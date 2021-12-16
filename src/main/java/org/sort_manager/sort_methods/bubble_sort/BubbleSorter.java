package org.sort_manager.sort_methods.bubble_sort;

import org.sort_manager.output_handler.SystemLogger;
import org.sort_manager.sort_methods.SortMethod;

import java.util.Arrays;

public class BubbleSorter extends SortMethod {
    // BASE TAKEN FROM MY JAVA_PLAYGROUND CODE.
    int iterations = 0;
    long time_taken;
    Integer[] sorted_list;

    public BubbleSorter(Integer[] listToSort)
    {
        super(listToSort);
        SystemLogger.logInfo("Bubble Sorter Called!");
        long start = System.currentTimeMillis();
        //Set the sorted list to the sorted listToSort
        sorted_list = sortArray(listToSort);
        //Set the time taken
        time_taken = System.currentTimeMillis() - start;
    }

    private Integer[] sortArray(Integer[] listToSort) {
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for(int i = 0; i < listToSort.length-1; i++)
            {
                iterations += 1;
                //If the selected word is longer than the next one
                if (listToSort[i] > listToSort[i+1])
                {
                    //Save the selected string temporarily
                    Integer temp = listToSort[i];
                    //Move the next string back by one
                    listToSort[i] =  listToSort[i+1];
                    //replace the next string with the selected string
                    listToSort[i+1] = temp;
                    //Change has been made so the list is not yet sorted
                    sorted = false;
                }
            }
        }
        return listToSort;
    }

    @Override
    public Integer[] getSortedArray() {
        return sorted_list;
    }

    @Override
    public int getIterations() {
        return iterations;
    }

    @Override
    public long getTimeTaken() {
        return time_taken;
    }

    @Override //REMOVE": "
    public String getSorterName() {
        return "BubbleSorter: ";
    }
}