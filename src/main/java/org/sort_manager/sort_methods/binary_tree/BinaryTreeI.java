package org.sort_manager.sort_methods.binary_tree;

public interface BinaryTreeI {
    Node getRootElement();

    int getNumberOfElements();

    void add(int value);

    void add(final int[] valueArray);

    Node findElement(int value);

    Node getLeftChild(Node element);// throws ChildNotFoundException;

    Node getRightChild(Node element);// throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
