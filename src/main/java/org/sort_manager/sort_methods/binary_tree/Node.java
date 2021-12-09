package org.sort_manager.sort_methods.binary_tree;
//Package private.
public class Node {
    //Predefine the stored items, those being the value, the nodes to the left and to the right.
    int value;
    Node left, right;

    //Constructor to initialise the stored values
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    public int getValue() { return value; }
}
