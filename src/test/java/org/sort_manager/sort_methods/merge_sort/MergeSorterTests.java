package org.sort_manager.sort_methods.merge_sort;

import org.junit.jupiter.api.*;
import org.sort_manager.sort_methods.bubble_sort.BubbleSorter;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSorterTests {
    private MergeSorter merge_sorter;
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setupEach(TestInfo testInfo) { merge_sorter = new MergeSorter(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}); }

    @Nested
    @DisplayName("Sort Method Abstract Class Methods Testing")
    class SortMethodFunctionTests {
        @Test
        @DisplayName("Getting the sorted array test")
        public void mergeSorterGetSortedTest() {
            assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 6, 6, 8, 9, 9}, merge_sorter.getSortedArray());

        }

        @Test
        @DisplayName("Getting the unsorted array test")
        public void mergeSorterGetUnsortedTest() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, merge_sorter.getUnsortedArray());

        }

        @Test
        @DisplayName("Getting the iterations test")
        public void getIterations() {
            /*
            Each iteration here is when a number is added to a new array. This means that if two arrays of 4 were being
            added together, the number of iterations would be 8 as the amount of numbers added to the new merged array
            is 8. This equals 39 as it is not basically (11 * how many times lists were merged) as 11 does not cleanly
            divide by 2.
             */
            assertEquals(39, merge_sorter.getIterations());

        }

        @Test
        @DisplayName("Time taken below threshold test")
        public void getTimeTaken() {
            //3 is just a number I decided to limit it by. From what I can tell it seems to take less than a millisecond anyway.
            assertTrue(merge_sorter.getTimeTaken() < 3);
        }
    }
}
