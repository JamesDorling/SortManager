package org.sort_manager.array_randomiser;

import java.util.Random;

public class ArrayRandomiser {
    public static Integer[] generateRandomNumberList (int listSize) {
        //Predefine result
        Integer[] result = new Integer[listSize];
        //Get an instance of the randomiser
        Random randomiser = new Random();
        //Loop through each value in the array and randomise it.
        for(int i = 0; i < listSize; i++) { result[i] = randomiser.nextInt(999); }
        //Return the randomised array.
        return result;
    }
}
