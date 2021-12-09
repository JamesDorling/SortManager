package org.sort_manager.sort_methods.binary_tree;

import org.sort_manager.sort_methods.SortMethod;

//THIS CLASS IS GOING TO BE CALLED BY THE FACTORY TO MAKE A BINARY TREE. LIKE A BINARY TREE MASTER FILE.
public class BinaryTreeSort extends SortMethod {
    BinaryTree sortedTree;
    public BinaryTreeSort(Integer[] unsortedArray) {
        super(unsortedArray);
        sortedTree = new BinaryTree();
        //sortedTree.add(unsortedArray);
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
}
