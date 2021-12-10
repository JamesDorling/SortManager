package org.sort_manager.sort_methods.insertion_sort;

import org.sort_manager.sort_methods.SortMethod;

public class InsertionSorter extends SortMethod {

    public InsertionSorter(Integer[] arrayToSort) {
        super(arrayToSort);
        System.out.println("Insertion Sort Called");
    }

    @Override
    public Integer[] getSortedArray() {
        return new Integer[0];
    }

    @Override
    public int getIterations() {
        return 0;
    }

    @Override
    public long getTimeTaken() {
        return 0;
    }

    @Override
    public String getSorterName() {
        return "Insertion: ";
    }
}
