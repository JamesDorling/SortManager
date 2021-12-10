package org.sort_manager.input_handler;

import org.sort_manager.output_handler.Printer;

import java.util.Scanner;

public class InputHandler {
    public static String takeInputSortType() {
        Printer.printMessage("Please input the type of sorting you would like to use: ");
        Scanner scan = new Scanner(System.in);
        //Take the typed in word
        return scan.nextLine();
    }

    public static Integer takeInputListSize() {
        Printer.printMessage("Please input the size of the array you would like to sort: ");
        Scanner scan = new Scanner(System.in);
        //Take the typed in word
        return scan.nextInt();
    }
}
