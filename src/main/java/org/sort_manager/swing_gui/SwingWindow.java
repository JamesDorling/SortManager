package org.sort_manager.swing_gui;

import javax.swing.*;
import java.awt.*;

public class SwingWindow {
    //Change to a constructor
    public static void displayWindow(){
        //Create the window
        JFrame window = createWindow("James's Sort Manager", new int[]{1600, 800});
        GridBagConstraints grid_constraints = new GridBagConstraints();

        configureWindow(window, grid_constraints);

        //Final setup for the window
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    private static JFrame createWindow(String name, int[] size) {
        JFrame window = new JFrame(name);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(size[0], size[1]);
        window.setLayout(new GridBagLayout());
        return window;
    }

    private static void configureWindow(JFrame window, GridBagConstraints constraints) {
        //Configure the constraints
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 50;
        constraints.ipadx = 80;
        constraints.weightx = 0.0;
        constraints.gridwidth = 1;

        //Add the text input field label
        SwingTextInput.addTextInputLabel(window, constraints);

        //Add the text input field
        SwingTextInput.addTextInputField(window, constraints);

        //Add the press enter reminder
        SwingTextInput.addPressEnterLabel(window, constraints);

        //Add the output text area
        SwingTextOutputWindow.addOutputArea(window, constraints);

        //Add the buttons
        SwingSortButtons.addButtons(window, constraints);

    }
}
