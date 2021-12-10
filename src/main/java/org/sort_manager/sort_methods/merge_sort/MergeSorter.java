package org.sort_manager.sort_methods.merge_sort;

import org.sort_manager.sort_methods.SortMethod;

public class MergeSorter extends SortMethod {
    public MergeSorter(Integer[] listToSort) {
        super(listToSort);
        System.out.println("Merge sort called");
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
        return "Merge: ";
    }
}
