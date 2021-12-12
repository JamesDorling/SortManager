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
            /*
            the iterations here should be 80 as one iteration is every time a number is compared to the one above it,
            And the amount of times the entire list is iterated through is 8.

            There are 11 values in the list, but the way that this bubble sort works is by comparing a number to the
            number after it in the array, meaning that the last value is never checked against anything above it,
            which therefore makes a complete iteration through the entire list only 10 checks. This means that, being as
            there are 8 "complete iterations" through the list, there are 80 iterations where a number is checked, even
            if no number was changed during that check. (For example the last 17 iterations change nothing, because the
            sorter finishes 3 into the second to last "complete iteration" and the last "complete iteration" is just
            to check the list is sorted.)
             */
            assertEquals(80, bubble_sorter.getIterations());

        }

        @Test
        @DisplayName("Time taken below threshold test")
        public void getTimeTaken() {
            //3 is just a number I decided to limit it by. From what I can tell it seems to take less than a millisecond anyway.
            assertTrue(bubble_sorter.getTimeTaken() < 3);
        }
    }
}