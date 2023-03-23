
package com.javaswing;

import javax.swing.*;

public class JavaSwing {

    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        // frame.setTitle("Ini Judul");
        // frame.setSize(300, 200);
        // frame.setLayout(null);
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        GUI gui = new GUI();

    }

}

class GUI extends JFrame {
    JLabel labelNama = new JLabel("Nama Lengkap");
    JTextField fieldNama = new JTextField(15);

    JLabel jenisKelamin = new JLabel("Jenis Kelamin");
    JRadioButton rLaki = new JRadioButton("Laki - Laki");
    JRadioButton rPerempuan = new JRadioButton("Perempuan");

    JLabel labelAgama = new JLabel("Agama");
    String[] namaAgama = { "islam", "Katolik", "Kristen", "Hindu", "Budha" };
    JComboBox cmAgama = new JComboBox(namaAgama);

    JLabel status = new JLabel("Status");
    JCheckBox cMhs = new JCheckBox("Mahasiswa/Pelajar");
    JCheckBox cbHobby = new JCheckBox("Makan");

    JButton buttonKirim = new JButton("Submit");

    public GUI() {
        setTitle("Form Pendataan");
        setSize(350, 200);
        ButtonGroup group = new ButtonGroup();
        group.add(rLaki);
        group.add(rPerempuan);

        setLayout(null);
        add(labelNama);
        add(fieldNama);
        add(jenisKelamin);
        add(rLaki);
        add(rPerempuan);
        add(labelAgama);
        add(cmAgama);
        add(status);
        add(cMhs);
        add(cbHobby);
        add(buttonKirim);

        // setBounds(x,y,w,h)
        // x = posisi x; y = posisi y
        // w = panjang komponen; p = tinggi komponen
        labelNama.setBounds(10, 10, 120, 20);
        fieldNama.setBounds(130, 10, 150, 20);
        jenisKelamin.setBounds(10, 35, 120, 20);
        rLaki.setBounds(130, 35, 100, 20);
        rPerempuan.setBounds(230, 35, 100, 20);
        labelAgama.setBounds(10, 60, 150, 20);
        cmAgama.setBounds(130, 60, 150, 20);
        status.setBounds(10, 85, 120, 20);
        cMhs.setBounds(130, 85, 100, 20);
        cbHobby.setBounds(230, 85, 150, 20);
        buttonKirim.setBounds(100, 130, 120, 20);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}