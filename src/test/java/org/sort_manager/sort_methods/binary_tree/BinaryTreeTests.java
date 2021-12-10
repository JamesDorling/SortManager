package org.sort_manager.sort_methods.binary_tree;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeTests {
    private BinaryTree tree1;


    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setupEach(TestInfo testInfo) {
        tree1 = new BinaryTree(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4});
    }

    @Nested
    @DisplayName("BinaryTree Interface Methods Testing")
    class BinaryTreeIFunctionsTests {
        @Test
        @DisplayName("Add Function test")
        public void binaryTreeAddTest() {
            //Tests to make sure it adds the nodes in the correct places.
            tree1.add(new Integer[]{4, 7, 10, 100, 3, 76, 34, 5});
            assertEquals(34, tree1.root.right.right.left.left.value);
        }

        @Test
        @DisplayName("Binary Tree Search test")
        public void binaryTreeSearchTest() {
            //Hard typing in the route it needs to go through to search.
            assertEquals(tree1.root.left.left.left.right.value, BinaryTreeSearch.binaryTreeSearch(tree1.root, 4).value);
        }

        @Test
        @DisplayName("Returning amount of elements test")
        public void binaryTreeCountTest() {
            assertEquals(11, tree1.getNumberOfElements());

        }

        @Test
        @DisplayName("Getting the sorted array test")
        public void binaryTreeAscendingSortTest() {
            assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 6, 6, 8, 9, 9}, tree1.getSortedTreeAsc());

        }

        @Test
        @DisplayName("Getting the sorted array descending test")
        public void binaryTreeDescendingSortTest() {
            assertArrayEquals(new Integer[]{9, 9, 8, 6, 6, 5, 4, 4, 3, 3, 2}, tree1.getSortedTreeDesc());

        }

        @Test
        @DisplayName("Test to get the root element")
        public void binaryTreeGetRootTest() {
            assertEquals(tree1.root, tree1.getRootElement());
        }
    }

    @Nested
    @DisplayName("Sort Method Abstract Class Methods Testing")
    class SortMethodFunctionTests {
        @Test
        @DisplayName("Getting the sorted array test")
        public void binaryTreeGetSortedTest() {
            assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 6, 6, 8, 9, 9}, tree1.getSortedArray());

        }

        @Test
        @DisplayName("Getting the unsorted array test")
        public void binaryTreeGetUnsortedTest() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, tree1.getUnsortedArray());

        }

        @Test
        @DisplayName("Getting the iterations test")
        public void getIterations() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, tree1.getUnsortedArray());

        }

        @Test
        @DisplayName("Time taken below threshold test")
        public void getTimeTaken() {
            //3 is just a number I decided to limit it by. From what I can tell it seems to take less than a millisecond anyway.
            assertTrue(tree1.getTimeTaken() < 3);
        }
    }
}