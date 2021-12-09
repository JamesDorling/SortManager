package org.sort_manager.sort_methods.binary_tree;

public class BinaryTreeSearch {
    public static Node binaryTreeSearch(Node rootOfTreeToSearch, int valueToSearchFor) {
        //This node is entirely made for readability. Bad for memory, but it means I can name the provided variable what to
        //start with and have the name of the searched node make sense if it breaks.
        Node searchedNode = rootOfTreeToSearch;
        if(valueToSearchFor == searchedNode.value)
        {
            //Just return the searched node as its on the correct one
            return searchedNode;
        }

        //The resulting node to give back. Defined after previous searchedNode because if the searchednode is the correct one
        //then the rest of this is useless.
        Node result = null;

        //If the value to be added is less than the current node's value then make a new node at currentNode.left.
        if(valueToSearchFor < searchedNode.value) {
            result = binaryTreeSearch(searchedNode.left, valueToSearchFor);
        } //If the value to be added is more than the current node's value then make a new node at currentNode.right.
        else if (valueToSearchFor > searchedNode.value) {
            result = binaryTreeSearch(searchedNode.right, valueToSearchFor);
        }
        //Else return currentNode, as the node already exists.
        return result;

    }
}
