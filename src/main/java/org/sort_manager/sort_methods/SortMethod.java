package org.sort_manager.sort_methods;

import java.util.Arrays;

public abstract class SortMethod {

    static Integer[] unsortedArray;

    public SortMethod(Integer[] arrayToSort) {
        unsortedArray = arrayToSort;
        //System.out.println(Arrays.toString(unsortedArray));
    }

    public abstract Integer[] getSortedArray();

    public static Integer[] getUnsortedArray() {
        return unsortedArray;
    }

    public abstract int getIterations();

    public abstract long getTimeTaken();

}
