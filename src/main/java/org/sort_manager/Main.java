package org.sort_manager;

import org.sort_manager.sort_methods.SortMethod;

import java.util.Arrays;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println(Arrays.toString(SortFactory.getSorter("tree", new Integer[]{5, 4, 2, 6, 7, 1, 2, 7}).getSortedArray()));
    }
}
