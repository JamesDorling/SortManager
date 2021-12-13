package org.sort_manager.ArrayRandomiser;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.sort_manager.array_randomiser.ArrayRandomiser;

import java.util.Arrays;

public class ArrayRandomiserTests {

    /*
    Many of these tests are kind of unnecessary as I am using a built-in java.util function for the randomness. However,
    there is no harm in making sure I haven't messed anything up while using it.
    */
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @ParameterizedTest()
    @ValueSource(ints = {10, 30, 4, 18})
    @DisplayName("Correct amount of numbers are generated test")
    void amountOfNumsGeneratedTest(int listSize) {
        Assertions.assertEquals(listSize, ArrayRandomiser.generateRandomNumberList(listSize).length);
    }

    //@Test
    //@DisplayName("Random numbers are below 1000 test")
    //void randomNumbersGeneratedBelow1000Test() {
    //    /*
    //    The idea is to individually compare each value to 1000, and if any of the values are higher than 1000 then the
    //    test should fail.
    //    */
    //    //The array to compare the other array to.
    //    Integer[] arrayToCompare = ArrayRandomiser.generateRandomNumberList(100);
    //    //predefine result as true
    //    boolean result = true;
    //    //Loop through each value in the array, and compare it to 1000. If it is higher, then fail the test.
    //    for(int i = 0; i < 100; i++) {
    //        if (arrayToCompare[i] >= 1000) {
    //            result = false;
    //            //Break because if even one is too high then it is a fail.
    //            break;
    //        }
    //    }
    //    Assertions.assertTrue(result);
    //}

    //@Test
    //@DisplayName("Random numbers are above 0 test")
    //void randomNumbersGeneratedAbove0Test() {
    //    /*
    //    The idea is to individually compare each value to 1000, and if any of the values are higher than 1000 then the
    //    test should fail.
    //    */
    //    //The array to compare the other array to.
    //    Integer[] arrayToCompare = ArrayRandomiser.generateRandomNumberList(100);
    //    //predefine result as true
    //    boolean result = true;
    //    //Loop through each value in the array, and compare it to 1000. If it is higher, then fail the test.
    //    for(int i = 0; i < 100; i++) {
    //        if (arrayToCompare[i] <= 0) {
    //            result = false;
    //            //Break because if even one is too high then it is a fail.
    //            break;
    //        }
    //    }
    //    Assertions.assertTrue(result);
    //}
}
