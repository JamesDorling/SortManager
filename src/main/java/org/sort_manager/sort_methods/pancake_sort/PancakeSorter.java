package org.sort_manager.sort_methods.pancake_sort;

import org.sort_manager.output_handler.SystemLogger;
import org.sort_manager.sort_methods.SortMethod;

import java.util.Arrays;

public class PancakeSorter extends SortMethod {
    Integer[] sorted_array;
    int iterations;
    long time_taken;

    public PancakeSorter(Integer[] arrayToSort) {
        super(arrayToSort);
        long start = System.currentTimeMillis();
        sorted_array = pancakeSort(arrayToSort);
        time_taken = System.currentTimeMillis() - start;
    }

    private Integer[] pancakeSort(Integer[] arrayToSort) {
        /*
        So the idea here is to flip parts of the list until the list is in order, by flipping the list at the largest
        point, then the second-largest point, and so on. So for example, an array of 4, 1, 3, 2 would flip the 1 and the
        4, making the array 1, 4, 3, 2, and then next would flip the entire array to now contain 2, 3, 4, 1. The next
        flip will then not do anything, and the flip afterwards would flip the 2, 3, 4 to now be in order backwards.
        Then finally, the entire array will be flipped.
         */
        for(int i = arrayToSort.length; i > 1; i--) {
            int maxValue = findMax(arrayToSort, i);
            if(maxValue != i - 1) {
                flipPancake(arrayToSort, maxValue);
                flipPancake(arrayToSort, i - 1);
            }
        }
        //Flip it one more time so that it is in order
        flipPancake(arrayToSort, arrayToSort.length - 1);
        return arrayToSort;
    }

    private int findMax(Integer[] arrayToSort, int arraySize) {
        int maxLocation = 0;
        for(int i = 0; i < arraySize; i++) {
            if(arrayToSort[i] < arrayToSort[maxLocation]) {
                maxLocation = i;
            }
        }
        return maxLocation;
    }

    private Integer[] flipPancake(Integer[] arrayToSort, int arraySize) {
        int start = 0;
        while (start < arraySize) {
            Integer temp = arrayToSort[start];
            arrayToSort[start] = arrayToSort[arraySize];
            arrayToSort[arraySize] = temp;
            start += 1;
            arraySize -= 1;
            iterations += 1;
        }
        return arrayToSort;
    }

    @Override
    public Integer[] getSortedArray() {
        return sorted_array;
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
        return "Pancake: ";
    }
}
