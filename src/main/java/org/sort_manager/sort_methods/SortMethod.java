package org.sort_manager.sort_methods;

public abstract class SortMethod {

    Integer[] unsortedArray;

    public SortMethod(Integer[] unsortedArray) {
        this.unsortedArray= unsortedArray;
    }

    public abstract Integer[] getSortedArray();

    public Integer[] getUnsortedArray() {
        return unsortedArray;
    }

    public abstract int getIterations();

    public abstract long getTimeTaken();

}
