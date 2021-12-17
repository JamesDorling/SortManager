package org.sort_manager.sort_methods.merge_sort;

//I found this online, seems to have an array.remove function so I added it.
import org.apache.commons.lang3.ArrayUtils;
import org.sort_manager.output_handler.SystemLogger;
import org.sort_manager.sort_methods.SortMethod;

import java.util.Arrays;

public class MergeSorter extends SortMethod {
    Integer[] sorted_array;
    int iterations = 0;
    long time_taken;

    public MergeSorter(Integer[] listToSort) {
        super(listToSort);
        SystemLogger.logInfo("Merge Sorter Called!");
        long start = System.currentTimeMillis();
        iterations = 0;
        sorted_array = mergeSort(listToSort);

        time_taken = System.currentTimeMillis() - start;

    }

    @Override
    public Integer[] getSortedArray() {
        return sorted_array;
    }

    /*
    So if Im understanding merge sort right, you split an array up until it is in groups of one, and then put them
    together again in ascending order so that when merging two arrays you can go through the arrays only checking the
    far left element as it will always be the smallest in the array.

    It makes sense to me, but I don't think I have explained that well.
    So with an array of 1,4,3,2 you split it up to be 4 individual numbers, and then put them together again
    meaning you would be left with 1,4 and 2,3 which you then can put together again by only comparing their elements
    that are on the far left.
     */

    private Integer[] mergeSort(Integer[] arrayToSplit) {
        //If the array is already only one value then just return it, as it is already sorted.
        if (arrayToSplit.length == 1) {
            return arrayToSplit;
        }
        //Recursively get all of the merged arrays
        Integer[] leftArray = mergeSort(ArrayUtils.subarray(arrayToSplit, 0, arrayToSplit.length / 2));
        Integer[] rightArray = mergeSort(ArrayUtils.subarray(arrayToSplit, arrayToSplit.length / 2, arrayToSplit.length + 1));
        return mergeArrays(leftArray, rightArray);
    }

    //Left and right array are to visualise it better.
    private Integer[] mergeArrays(Integer[] leftArray, Integer[] rightArray) {
        //Predefine the result
        Integer[] result = new Integer[leftArray.length + rightArray.length];

        //Loop through and merge the arrays. Could probably do with rewriting to remove excessive if statements.
        for(int i = 0; i < result.length; i++) {
            //Add one to iterations as this is how many times the array has been split and merged.
            iterations += 1;
            //If the left array is empty, then add the right array values.
            if(leftArray.length == 0) {
                result[i] = rightArray[0];
                rightArray = ArrayUtils.remove(rightArray, 0);
            } //If the right array is empty, then add the left array values.
            else if(rightArray.length == 0) {
                result[i] = leftArray[0];
                leftArray = ArrayUtils.remove(leftArray, 0);
            } //If the first value in the left array is smaller than the right array, then add it
            else if(leftArray[0] <= rightArray[0]) {
                result[i] = leftArray[0];
                leftArray = ArrayUtils.remove(leftArray, 0);
            } //If all of these fail then add the first value in the right array.
            else
            {
                result[i] = rightArray[0];
                rightArray = ArrayUtils.remove(rightArray, 0);
            }
        }
        //Return the sorted result
        return result;
    }

    @Override
    public int getIterations() {
        return iterations;
    }

    @Override
    public long getTimeTaken() {
        return time_taken;
    }

    @Override
    public String getSorterName() {
        return "Merge: ";
    }
}
