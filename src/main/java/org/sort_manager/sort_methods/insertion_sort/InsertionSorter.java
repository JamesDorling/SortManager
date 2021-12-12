package org.sort_manager.sort_methods.insertion_sort;

import org.apache.commons.lang3.ArrayUtils;
import org.sort_manager.sort_methods.SortMethod;

public class InsertionSorter extends SortMethod {
    Integer[] sorted_array;
    int iterations;
    long time_taken;

    public InsertionSorter(Integer[] arrayToSort) {
        super(arrayToSort);
        iterations = 0;
        long start = System.currentTimeMillis();

        sorted_array = insertionSortArray(arrayToSort);

        time_taken = System.currentTimeMillis() - start;

    }

    private Integer[] insertionSortArray(Integer[] arrayToSort) {
        //My idea is to take each value in the array to sort and individually add it to the new array in the right spot.
        for(int i = 1; i < arrayToSort.length; i++)
        {
            //Grab the value being moved, as it will soon be overwritten in the array
            Integer valueSorting = arrayToSort[i];
            //Grab a sorting index. This is below the current i index as elements will be moved down.
            int sortingIndex = i - 1;
            //While the sortingIndex is greater than 0 and the value being sorted is smaller than the current value at
            //the sorting index
            while(sortingIndex >= 0 && valueSorting < arrayToSort[sortingIndex])
            {
                //move the value at the sorting index forwards by one
                arrayToSort[sortingIndex + 1] = arrayToSort[sortingIndex];
                //Move the sorting index back
                sortingIndex -= 1;
                //This all happens to move forwards all values greater than the one being moved, therefore putting
                //the smallest value at the back

                //Up the iterations by one here, because Im counting moved values as an interation
                iterations += 1;
            }
            //Set the lowest value to the smallest one. this is +1 as the sorting index will have gone one too far back
            //due to it being set back at the end.
            arrayToSort[sortingIndex + 1] = valueSorting;
        }
        //Return the now sorted array
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
        return "Insertion: ";
    }
}
