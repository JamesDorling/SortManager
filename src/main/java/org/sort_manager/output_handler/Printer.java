package org.sort_manager.output_handler;

import org.sort_manager.sort_methods.SortMethod;

import java.util.Arrays;

public class Printer {
    public static void printMessage(String message) {
        //Temporary until I learn another way to do it
        System.out.println(message);
    }

    public static void printArrayData(SortMethod sorter) {
        printMessage(sorter.getSorterName());
        printMessage("Unsorted: " + Arrays.toString(sorter.getUnsortedArray()));
        printMessage("Sorted: " + Arrays.toString(sorter.getSortedArray()));
        printMessage("Iterations: " + sorter.getIterations());
        printMessage("Time taken in milliseconds: " + sorter.getTimeTaken());
    }
}
