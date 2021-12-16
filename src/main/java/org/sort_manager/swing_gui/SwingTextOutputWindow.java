package org.sort_manager.swing_gui;

import org.sort_manager.output_handler.SystemLogger;
import org.sort_manager.sort_methods.SortMethod;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SwingTextOutputWindow {
    static JTextArea output_area;
    private static final int OUTPUT_AREA_ROWS = 30;
    private static final int OUTPUT_AREA_COLUMNS = 30;

    public static void addOutputArea(JFrame window, GridBagConstraints constraints) {
        //Make, configure and add the output area
        output_area = new JTextArea(OUTPUT_AREA_ROWS, OUTPUT_AREA_COLUMNS);
        configureTextArea(constraints);
        window.add(output_area, constraints);
    }

    public static void addTextToScreen(String message) {
        output_area.append(message);
    }

    public static void printArrayData(SortMethod sorter) {
        //Print out the necessary data, that being the sorter name, the unsorted array, the sorted array, the iterations and the time taken.
        SystemLogger.logInfo("Printing results to screen.");
        output_area.append(sorter.getSorterName() + "\n");
        output_area.append("Unsorted: " + Arrays.toString(sorter.getUnsortedArray()) + "\n");
        output_area.append("Sorted: " + Arrays.toString(sorter.getSortedArray()) + "\n");
        output_area.append("Iterations: " + sorter.getIterations() + "\n");
        output_area.append("Time taken in milliseconds: " + sorter.getTimeTaken() + "\n");
    }

    //This function clears the text area, replacing all of the text with just the note provided.
    public static void clearTextArea() {
        output_area.setText("Press a button to use that sort method! \n");
    }

    private static void configureTextArea(GridBagConstraints constraints) {
        //Set the border
        output_area.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        //Configure the location and size
        constraints.ipady = 30;
        constraints.ipadx = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.gridwidth = 8;
        constraints.gridx = 0;
        constraints.gridy = 1;
        //Set the default text
        output_area.setText("Press a button to use that sort method! \n");
        //Set the text and lines to be wrapped, this is used to limit the amount of text on a line.
        output_area.setWrapStyleWord(true);
        output_area.setLineWrap(true);
    }
}
