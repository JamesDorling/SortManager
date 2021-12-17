package org.sort_manager.sort_methods.pancake_sort;

import org.junit.jupiter.api.*;
import org.sort_manager.sort_methods.merge_sort.MergeSorter;

import static org.junit.jupiter.api.Assertions.*;

public class PancakeSorterTests {
    PancakeSorter pancake_sorter;
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setupEach(TestInfo testInfo) { pancake_sorter = new PancakeSorter(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}); }

    @Nested
    @DisplayName("Sort Method Abstract Class Methods Testing")
    class SortMethodFunctionTests {
        @Test
        @DisplayName("Getting the sorted array test")
        public void mergeSorterGetSortedTest() {
            assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 6, 6, 8, 9, 9}, pancake_sorter.getSortedArray());

        }

        @Test
        @DisplayName("Getting the unsorted array test")
        public void mergeSorterGetUnsortedTest() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, pancake_sorter.getUnsortedArray());

        }

        @Test
        @DisplayName("Getting the iterations test")
        public void getIterations() {
            /*
            Each iteration here is when a number is flipped with another, meaning that there will be 46 iterations or
            46 individual "flips" in the array provided.
             */
            assertEquals(46, pancake_sorter.getIterations());

        }

        @Test
        @DisplayName("Time taken below threshold test")
        public void getTimeTaken() {
            //3 is just a number I decided to limit it by. From what I can tell it seems to take less than a millisecond anyway.
            assertTrue(pancake_sorter.getTimeTaken() < 3);
        }
    }
}
