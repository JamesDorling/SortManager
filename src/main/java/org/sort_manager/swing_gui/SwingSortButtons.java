package org.sort_manager.swing_gui;

import org.sort_manager.SortFactory;
import org.sort_manager.array_randomiser.ArrayRandomiser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingSortButtons {
    //This is the controller part of the MVC, I guess.
    public static void addButtons(JFrame window, GridBagConstraints constraints) {
        //Define each button
        JButton bubble_button = new JButton("Bubble");
        JButton tree_button = new JButton("Tree");
        JButton merge_button = new JButton("Merge");
        JButton insert_button = new JButton("Insert");
        //Configure and add each button
        addSortButtons(new JButton[]{bubble_button, tree_button, merge_button, insert_button}, window, constraints);
    }

    private static void addSortButtons(JButton[] buttonsToAdd, JFrame window, GridBagConstraints constraints) {
        //Configure the buttons
        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 2;
        //Loop through the buttons provided and add them, incrementing gridx each time so that they don't overlap.
        //This also adds a listener to the buttons.
        for(int i = 0; i < buttonsToAdd.length; i++) {
            window.add(buttonsToAdd[i], constraints);
            constraints.gridx = i + 1;
            addListenerToButton(buttonsToAdd[i]);
        }
    }

    private static void addListenerToButton(JButton button) {
        //Add a listener to the button.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingTextOutputWindow.clearTextArea();
                //Each button is named after the sortFactory's needed input, so can just call the sortFactory.
                SwingTextOutputWindow.printArrayData(SortFactory.getSorter(button.getText().toLowerCase(), ArrayRandomiser.generateRandomNumberList(SwingTextInput.getInputNumber())));
            }
        });
    }
}
