
package com.manajemenlayout;

import javax.swing.*;
import java.awt.*;

public class FLayout extends JFrame {

    JButton saveButton, editButton, deleteButton, openButton;

    public FLayout() {
        setTitle("Flow layout");
        openButton = new JButton("Open");
        saveButton = new JButton("Save");
        deleteButton = new JButton("Delete");
        editButton = new JButton("Edit");

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(openButton);
        add(saveButton);
        add(deleteButton);
        add(editButton);

        openButton.setBounds(10, 10, 150, 20);
        saveButton.setBounds(150, 15, 150, 20);
        editButton.setBounds(100, 30, 150, 20);
        deleteButton.setBounds(40, 50, 150, 20);

        setSize(350, 200);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
