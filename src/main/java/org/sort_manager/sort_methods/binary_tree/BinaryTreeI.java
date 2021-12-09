package org.sort_manager.sort_methods.binary_tree;

public interface BinaryTreeI {
    Node getRootElement();

    Integer getNumberOfElements();

    void add(Integer value);

    void add(final Integer[] valueArray);

    Node findElement(Integer value);

    Node getLeftChild(Node element);// throws ChildNotFoundException;

    Node getRightChild(Node element);// throws ChildNotFoundException;

    Integer[] getSortedTreeAsc();

    Integer[] getSortedTreeDesc();
}
