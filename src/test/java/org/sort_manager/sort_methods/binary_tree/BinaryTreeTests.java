package org.sort_manager.sort_methods.binary_tree;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    BinaryTree tree1 = new BinaryTree(5);
    BinaryTree tree2 = new BinaryTree();

    @Test
    public void binaryTreeAddTest() {

        //Tests to make sure it adds the nodes in the correct places.
        tree1.add(2);
        tree1.add(3);
        tree1.add(new Integer[]{9, 6});
        assertEquals(3, tree1.root.left.right.value);
        assertEquals(6, tree1.root.right.left.value);
        tree2.add(new Integer[]{5, 3, 6, 2, 9, 9, 10, 4, 7});
        assertEquals(7, tree2.root.right.right.left.left.value);
        assertEquals(2, tree2.root.left.left.value);
        assertEquals(9, tree2.root.right.right.left.value);
    }

    @Test
    public void binaryTreeSearchTest() {
        tree1.add(new Integer[]{9, 6});
        //Hard typing in the route it needs to go through to search.
        assertEquals(tree1.root.right.left.value, BinaryTreeSearch.binaryTreeSearch(tree1.root, 6).value);
    }

    @Test
    public void binaryTreeCountTest() {
        tree1.add(new Integer[]{9, 6});
        assertEquals(3, tree1.getNumberOfElements());

    }

    @Test
    public void binaryTreeGetterTests() {
        //Tree1, so 5 is already root
        tree1.add(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4});
        assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 9, 9}, tree1.getSortedTreeAsc());
        assertArrayEquals(new Integer[]{9, 9, 8, 6, 6, 5, 5, 4, 4, 3, 3, 2}, tree1.getSortedTreeDesc());
    }

    @Test
    public void binaryTreeGetRootTest() {
        tree1.add(new Integer[]{9, 6});
        assertEquals(5, tree1.getRootElement().value);

    }

    //Doesnt have a remove yet. I am going to try and make one.
    /*
    This is difficult though for this reason:
       5
      / \
     4   7
        / \
       6   8
    If I delete 7, where do I move 6 and 8? This can be solved by simply moving 8 up by one, so heres a harder issue:
    if I delete 5, what happens then? If 7 moves up, then 8 will have to move up. However, 6 cannot move up with 7,
    therefore making the list unordered. Also, this could make an issue of if I set 7.left to 4, then 6 has essentially
    been deleted too.
    These issues do not exist with a remove function that only removes the bottom nodes, however.
    Therefore, I will come back and make this.
    */
}