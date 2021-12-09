package org.sort_manager;

import org.sort_manager.sort_methods.SortMethod;
import org.sort_manager.sort_methods.binary_tree.BinaryTree;
import org.sort_manager.sort_methods.bubble_sort.BubbleSortIntArray;

public class SortFactory {
    public static SortMethod getSorter(String sortType, Integer[] arrayToSort) {
        return switch (sortType) {
            case "bubble" -> new BubbleSortIntArray(arrayToSort);
            case "tree" -> new BinaryTree(arrayToSort);
            case "merge" -> null;
            case "insertion" -> null;
            default ->
                    //return null, instructors aint liking this one but its temporary so please dont kill me
                    null;
            //Do all of them? Why not?
        };
    }
}
