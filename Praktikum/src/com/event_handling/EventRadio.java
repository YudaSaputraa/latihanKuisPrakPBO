package com.event_handling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventRadio {

    public static void main(String[] args) {
        new RadioHandling();
    }

}

class RadioHandling extends JFrame implements ItemListener {
    private JLabel text;
    private JPanel panel;
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JRadioButton rbtn3;

    public RadioHandling() {
        setTitle("Coba RadioButton Handling");
        text = new JLabel("Jenis Kelamin : Pilihan");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        panel = new JPanel(new FlowLayout());
        rbtn1 = new JRadioButton("Pria");
        rbtn2 = new JRadioButton("Wanita");
        rbtn3 = new JRadioButton("Setengah Pria Setengah Wanita");

        ButtonGroup group = new ButtonGroup();
        group.add(rbtn1);
        group.add(rbtn2);
        group.add(rbtn3);

        rbtn1.addItemListener(this);
        rbtn2.addItemListener(this);
        rbtn3.addItemListener(this);

        setLayout(new BorderLayout());
        add(text, "North");
        add(panel, "West");
        panel.add(rbtn1);
        panel.add(rbtn2);
        panel.add(rbtn3);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);

    }

    @Override
    public void itemStateChanged(ItemEvent actionRadio) {
        if (actionRadio.getSource() == rbtn1) {
            if (actionRadio.getStateChange() == ItemEvent.SELECTED)
                text.setText("Jenis Kelamin : Pria");

        } else if (actionRadio.getSource() == rbtn2) {
            if (actionRadio.getStateChange() == ItemEvent.SELECTED)
                text.setText("Jenis Kelamin : Wanita");

        } else if (actionRadio.getSource() == rbtn3) {
            if (actionRadio.getStateChange() == ItemEvent.SELECTED)
                text.setText("Jenis Kelamin : Setengah Pria Setengah Wanita");

        }
    }

}
