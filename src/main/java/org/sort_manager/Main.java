package org.sort_manager;

import org.sort_manager.sort_methods.SortMethod;

import java.util.Arrays;

public class Main
{
    public static void main( String[] args )
    {
        //This is super inefficient but its temporary.
        System.out.println(Arrays.toString(SortFactory.getSorter("tree", new Integer[]{5, 4, 2, 6, 7, 1, 2, 7}).getSortedArray()));
        //System.out.println((SortFactory.getSorter("tree", new Integer[]{5, 4, 2, 6, 7, 1, 2, 7}).getIterations()));

        System.out.println(Arrays.toString(SortFactory.getSorter("bubble", new Integer[]{5, 4, 2, 6, 7, 1, 2, 7}).getSortedArray()));
        //System.out.println((SortFactory.getSorter("bubble", new Integer[]{5, 4, 2, 6, 7, 1, 2, 7}).getIterations()));
    }
}
