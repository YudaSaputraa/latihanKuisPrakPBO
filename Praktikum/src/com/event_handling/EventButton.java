package com.event_handling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventButton {
    public static void main(String[] args) {
        new ButtonHandling();
    }

}

class ButtonHandling extends JFrame implements ActionListener {

    private JLabel lbl;
    private JButton btnSetuju;
    private JButton btnBatal;

    public ButtonHandling() {
        super("Coba Button Handling");
        lbl = new JLabel("Status : None");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        btnSetuju = new JButton("Setuju");
        btnBatal = new JButton("Batal");
        btnSetuju.addActionListener(this);
        btnBatal.addActionListener(this);
        setLayout(new BorderLayout());
        add(lbl, "North");
        add(btnSetuju, "West");
        add(btnBatal, "East");

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == btnSetuju) {
            lbl.setText("Status : Setuju");

        } else if (action.getSource() == btnBatal) {
            lbl.setText("Status : Batal");
        }
    }

}