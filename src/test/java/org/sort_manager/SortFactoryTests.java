package org.sort_manager;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.sort_manager.sort_methods.binary_tree.BinaryTree;
import org.sort_manager.sort_methods.bubble_sort.BubbleSorter;
import org.sort_manager.sort_methods.insertion_sort.InsertionSorter;
import org.sort_manager.sort_methods.merge_sort.MergeSorter;

import java.util.stream.Stream;

public class SortFactoryTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    public static Stream<Arguments> sortCheckerArguments() {
        return Stream.of(
                Arguments.arguments("bubble", new Integer[]{3, 2}, BubbleSorter.class),
                Arguments.arguments("tree", new Integer[]{3, 2}, BinaryTree.class),
                Arguments.arguments("merge", new Integer[]{3, 2}, MergeSorter.class),
                Arguments.arguments("insert", new Integer[]{3, 2}, InsertionSorter.class)
        );
    }

    @ParameterizedTest
    @MethodSource("sortCheckerArguments")
    @DisplayName("Check if correct sorters are created test")
    public void makeCorrectSortersTest(String sortType, Integer[] arrayToSort, Class expectedSortMethod) {
        Assertions.assertEquals(expectedSortMethod, SortFactory.getSorter(sortType, arrayToSort).getClass());
    }


}
