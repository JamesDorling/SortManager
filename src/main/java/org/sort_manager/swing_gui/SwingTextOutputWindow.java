package org.sort_manager.swing_gui;

import org.sort_manager.sort_methods.SortMethod;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SwingTextOutputWindow {
    static JTextArea output_area;
    private static final int OUTPUT_AREA_ROWS = 30;
    private static final int OUTPUT_AREA_COLUMNS = 30;

    public static void addOutputArea(JFrame window, GridBagConstraints constraints) {
        output_area = new JTextArea(OUTPUT_AREA_ROWS, OUTPUT_AREA_COLUMNS);
        output_area.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        constraints.ipady = 30;
        constraints.ipadx = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.gridwidth = 8;
        constraints.gridx = 0;
        constraints.gridy = 1;
        output_area.setText("Press a button to use that sort method! \n");
        output_area.setWrapStyleWord(true);
        output_area.setLineWrap(true);
        window.add(output_area, constraints);
    }

    public static void addTextToScreen(String message) {
        output_area.append(message);
    }

    public static void printArrayData(SortMethod sorter) {
        output_area.append(sorter.getSorterName() + "\n");
        output_area.append("Unsorted: " + Arrays.toString(sorter.getUnsortedArray()) + "\n");
        output_area.append("Sorted: " + Arrays.toString(sorter.getSortedArray()) + "\n");
        output_area.append("Iterations: " + sorter.getIterations() + "\n");
        output_area.append("Time taken in milliseconds: " + sorter.getTimeTaken() + "\n");
    }

    public static void clearTextArea() {
        output_area.setText("Press a button to use that sort method! \n");
    }
}
