package org.sort_manager.sort_methods.bubble_sort;

import org.junit.jupiter.api.*;
import org.sort_manager.sort_methods.binary_tree.BinaryTree;
import org.sort_manager.sort_methods.binary_tree.BinaryTreeSearch;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSorterTests {
    private BubbleSorter bubble_sorter;


    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setupEach(TestInfo testInfo) { bubble_sorter = new BubbleSorter(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}); }

    @Nested
    @DisplayName("Sort Method Abstract Class Methods Testing")
    class SortMethodFunctionTests {
        @Test
        @DisplayName("Getting the sorted array test")
        public void binaryTreeGetSortedTest() {
            assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 6, 6, 8, 9, 9}, bubble_sorter.getSortedArray());

        }

        @Test
        @DisplayName("Getting the unsorted array test")
        public void binaryTreeGetUnsortedTest() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, bubble_sorter.getUnsortedArray());

        }

        @Test
        @DisplayName("Getting the iterations test")
        public void getIterations() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, bubble_sorter.getUnsortedArray());

        }

        @Test
        @DisplayName("Time taken below threshold test")
        public void getTimeTaken() {
            //3 is just a number I decided to limit it by. From what I can tell it seems to take less than a millisecond anyway.
            assertTrue(bubble_sorter.getTimeTaken() < 3);
        }
    }
}