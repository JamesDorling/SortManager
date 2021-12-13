package org.sort_manager.array_randomiser;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomiser {
    public static Integer[] generateRandomNumberList (int listSize) {
        //Get randomiser instance
        Random randomiser = new Random();
        //Return a random array of Integers from 0 to listSize
        return Arrays.stream(randomiser.ints(listSize).toArray()).boxed().toArray(Integer[]::new);
    }
}
