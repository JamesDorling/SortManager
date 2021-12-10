package org.sort_manager;

import org.sort_manager.sort_methods.SortMethod;
import org.sort_manager.sort_methods.binary_tree.BinaryTree;
import org.sort_manager.sort_methods.bubble_sort.BubbleSorter;
import org.sort_manager.sort_methods.insertion_sort.InsertionSorter;
import org.sort_manager.sort_methods.merge_sort.MergeSorter;

public class SortFactory {
    public static SortMethod getSorter(String sortType, Integer[] arrayToSort) {
        return switch (sortType) {
            case "bubble" -> new BubbleSorter(arrayToSort);
            case "tree" -> new BinaryTree(arrayToSort);
            case "merge" -> new MergeSorter(arrayToSort);
            case "insertion" -> new InsertionSorter(arrayToSort);
            default -> new BubbleSorter(arrayToSort);
        };
    }
}
