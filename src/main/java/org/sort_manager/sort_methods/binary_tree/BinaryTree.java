package org.sort_manager.sort_methods.binary_tree;

import java.util.ArrayList;

public class BinaryTree implements BinaryTreeI {
    Node root;

    //Two constructors. Either setting a root node or setting it to null.
    public BinaryTree(int rootValue)
    {
        root = new Node(rootValue);
    }
    //Constructor two, so that a starting node is not necessary.
    public BinaryTree()
    {
        root = null;
    }

    //Add function, triggers the recursive add function on the root.
    @Override
    public void add(int value) {
        root = addNodeRecursive(root, value);
    }

    @Override
    public void add(final int[] valueArray) {
        for (int j : valueArray) {
            //Iterate through the array and add each value.
            this.add(j);
        }
    }

    //Recursive node addition. Will loop from node until it finds the perfect spot that is null.
    private Node addNodeRecursive(Node currentNode, int addedValue)
    {
        //If the current node is a null, then make a new node with the value.
        if(currentNode == null) {
            return new Node(addedValue);
        }

        //If the value to be added is less than the current node's value then make a new node at currentNode.left.
        if(addedValue <= currentNode.value) {
            currentNode.left = addNodeRecursive(currentNode.left, addedValue);
        } //If the value to be added is more than the current node's value then make a new node at currentNode.right.
        else {
            currentNode.right = addNodeRecursive(currentNode.right, addedValue);
        }
        //Else return currentNode, as the node already exists.
        return currentNode;
    }

    @Override
    public Node getRootElement() {
        return root;
    }

    @Override
    public int getNumberOfElements() {
        //Return the number of elements
        return countElements(this.root);
    }

    private int countElements(Node rootNode) {
        //If no root then no elements.
        if(rootNode == null) {
            return 0;
        }
        //Predefine result
        int result = 1;

        //recursively go through each child.
        result += (countElements(rootNode.left) + countElements(rootNode.right));
        return result;
    }

    @Override
    public Node findElement(int value) {
        return BinaryTreeSearch.binaryTreeSearch(this.root, value);
    }

    @Override //Getter for element.left.
    public Node getLeftChild(Node element) {
        return element.left;
    }

    @Override //Getter for element.right.
    public Node getRightChild(Node element) {
        return element.right;
    }

    @Override //Getter for the tree's elements. I wanted to return this as an array of ints rather than an arraylist.
    public int[] getSortedTreeAsc() {
        //Grab an arraylist of the nodes
        ArrayList<Integer> nodeList = getNodeList(root);
        //Grab an arraylist of the nodes
        int[] result = new int[nodeList.size()];
        //transform the arraylist into an array of ints.
        for (int i = 0; i < result.length; i++) {
            result[i] = nodeList.get(i);
        }
        return result;
    }

    //USE ARRAY FLIPPER?
    @Override //Getter for the tree's elements backwards. I wanted to return this as an array of ints rather than an arraylist.
    public int[] getSortedTreeDesc() {
        //Grab an arraylist of the nodes
        ArrayList<Integer> nodeList = getNodeList(root);
        //Grab an arraylist of the nodes
        int[] result = new int[nodeList.size()];
        //transform the arraylist into an array of ints, but do it backwards.
        for (int i = 0; i < nodeList.size(); i++) {
            result[i] = nodeList.get((result.length - 1) - i);
        }
        return result;
    }

    private ArrayList<Integer> getNodeList(Node rootNode) {
        //Define an arraylist of nodes
        ArrayList<Integer> result = new ArrayList<>();
        //If there is a left node
        if(getLeftChild(rootNode) != null) {
            //Recursion of this function to keep adding all nodes on the left
            result.addAll(getNodeList(getLeftChild(rootNode)));
        }
        //Add this node, as it is in the middle.
        result.add(rootNode.value);
        //If there is a node on the right
        if(getRightChild(rootNode) != null) {
            //Recursion of this function to keep adding all nodes on the right
            result.addAll(getNodeList(getRightChild(rootNode)));
        }
        //Return the result.
        return result;
    }
}
