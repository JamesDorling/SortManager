package org.sort_manager.swing_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SwingTextInput {
    private static int inputNumber;
    public static void addTextInputField (JFrame window, GridBagConstraints constraints) {
        //This is static as there will only ever be one window
        JTextField textInputField = new JTextField(10);
        inputNumber = 5;

        constraints.gridx = 0;
        constraints.gridy = 0;
        textInputField.setHorizontalAlignment(0);
        textInputField.setText(Integer.toString(inputNumber));
        window.add(textInputField, constraints);
        constraints.gridx = 1;
        window.add(textInputField, constraints);
        textInputField.addFocusListener(new FocusListener() {
                                            @Override
                                            public void focusGained(FocusEvent e) {

                                            }

                                            @Override
                                            public void focusLost(FocusEvent e) {
                                                try {
                                                    inputNumber = Integer.parseInt(textInputField.getText());
                                                } catch (NumberFormatException exception) {
                                                    SwingTextOutputWindow.addTextToScreen("Thats not a number! \n");
                                                }
                                            }
                                        }
        );
    }

    //This is here because it is part of the input field.
    public static void addTextInputLabel(JFrame window, GridBagConstraints constraints) {
        JLabel textInputLabel = new JLabel("Array Size Label");
        textInputLabel.setText("Array Size:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        window.add(textInputLabel, constraints);
    }

    public static void addPressEnterLabel(JFrame window, GridBagConstraints constraints) {
        JLabel textInputLabel = new JLabel("Press Enter Label");
        textInputLabel.setText("(Remember to press enter!)");
        constraints.gridx = 2;
        constraints.gridy = 0;
        window.add(textInputLabel, constraints);
    }

    public static int getInputNumber() {
        return inputNumber;
    }
}
