package org.sort_manager.sort_methods;

import java.util.Arrays;

public abstract class SortMethod {

    Integer[] unsortedArray;

    public SortMethod(Integer[] arrayToSort) {
        unsortedArray = new Integer[arrayToSort.length];
        System.arraycopy(arrayToSort, 0, unsortedArray, 0, arrayToSort.length);
        //System.out.println(Arrays.toString(unsortedArray));
    }

    public abstract Integer[] getSortedArray();

    public Integer[] getUnsortedArray() {
        return this.unsortedArray;
    }

    public abstract int getIterations();

    public abstract long getTimeTaken();

    public abstract String getSorterName();

}
