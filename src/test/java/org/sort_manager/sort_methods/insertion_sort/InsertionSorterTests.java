package org.sort_manager.sort_methods.insertion_sort;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSorterTests {
    private InsertionSorter insertion_sorter;


    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setupEach(TestInfo testInfo) {
        insertion_sorter = new InsertionSorter(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4});
    }

    @Nested
    @DisplayName("Sort Method Abstract Class Methods Testing")
    class SortMethodFunctionTests {
        @Test
        @DisplayName("Getting the sorted array test")
        public void insertionSorterGetSortedTest() {
            assertArrayEquals(new Integer[]{2, 3, 3, 4, 4, 5, 6, 6, 8, 9, 9}, insertion_sorter.getSortedArray());

        }

        @Test
        @DisplayName("Getting the unsorted array test")
        public void insertionSorterGetUnsortedTest() {
            assertArrayEquals(new Integer[]{9, 6, 5, 3, 8, 9, 2, 4, 6, 3, 4}, insertion_sorter.getUnsortedArray());

        }

        @Test
        @DisplayName("Getting the iterations test")
        public void getIterations() {
            /*
            There should be 34 iterations as each value being moved forwards counts as an iteration. For example:
            taking an array containing the numbers {3, 1, 2}, moving the 1 back would only move the 3 forward which
            would therefore be 1 iteration. However, moving the 2 back would move both the 1 and the 3 forwards, which
            means that there would be 2 iterations.
             */
            assertEquals(34, insertion_sorter.getIterations());
        }

        @Test
        @DisplayName("Time taken below threshold test")
        public void getTimeTaken() {
            //3 is just a number I decided to limit it by. From what I can tell it seems to take less than a millisecond anyway.
            assertTrue(insertion_sorter.getTimeTaken() < 3);
        }
    }
}
