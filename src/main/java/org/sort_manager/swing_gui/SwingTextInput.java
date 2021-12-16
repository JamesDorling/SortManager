package org.sort_manager.swing_gui;

import org.sort_manager.output_handler.SystemLogger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SwingTextInput {
    private static int inputNumber = 5;

    public static void addTextInputField(JFrame window, GridBagConstraints constraints) {
        //This is static as there will only ever be one window
        //Make a text field
        JTextField textInputField = new JTextField(10);
        //Configure the location on the grid
        constraints.gridy = 0;
        constraints.gridx = 1;
        //Set the text alignment to the middle
        textInputField.setHorizontalAlignment(0);
        //Set the default text in the input field to the base number
        textInputField.setText(Integer.toString(inputNumber));
        //Add a focus listener so that the number is set upon lost focus
        addFocusListener(textInputField);
        //add the input field to the window
        window.add(textInputField, constraints);
    }

    //This is here because it is part of the input field.
    public static void addTextInputLabel(JFrame window, GridBagConstraints constraints) {
        //Create a label
        JLabel textInputLabel = new JLabel("Array Size Label");
        //Set the label's text to "Array size"
        textInputLabel.setText("Array Size:");
        //Configure the label's location
        constraints.gridx = 0;
        constraints.gridy = 0;
        //Add the label to the window
        window.add(textInputLabel, constraints);
    }

    //Getter for the input. Used by the buttons.
    public static int getInputNumber() {
        return inputNumber;
    }

    private static void addFocusListener(JTextField textInputField) {
        textInputField.addFocusListener(new FocusListener() {
                                            @Override
                                            public void focusGained(FocusEvent e) {
                                                //Empty the input field on focus
                                                textInputField.setText("");
                                                SystemLogger.logInfo("Text Input Field Focus Gained");
                                            }

                                            @Override
                                            public void focusLost(FocusEvent e) {
                                                SystemLogger.logInfo("Text Input Field Focus Lost");
                                                //If nothing is typed, set the text back to what is was before focusing.
                                                if (textInputField.getText().equals("")) {
                                                    textInputField.setText(Integer.toString(inputNumber));
                                                }
                                                //Try and parse the input text to an integer.
                                                try {
                                                    inputNumber = Integer.parseInt(textInputField.getText());
                                                    SystemLogger.logInfo("List Size Changed to " + inputNumber);
                                                } catch (NumberFormatException exception) { //If that fails, then say it isnt a number and reset the text to the previous inputnumber.
                                                    SwingTextOutputWindow.addTextToScreen("Thats not a number! \n");
                                                    SystemLogger.logSevere("Number not recognised! Resetting to previous.");
                                                    textInputField.setText(Integer.toString(inputNumber));
                                                }
                                            }
                                        }
        );
    }
}
