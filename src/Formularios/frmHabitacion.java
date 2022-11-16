package Formularios;

import javax.swing.*;

import Clases.HabitacionDoble;
import Clases.HabitacionSimple;
import Clases.HabitacionMatrimonial;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class frmHabitacion extends JFrame implements ActionListener {

    private JTextField textPrecioHS;
    private JTextField textPrecioHD;
    private JTextField textPrecioHM;
    private JTextField textField;

    public frmHabitacion() {
        getContentPane().setLayout(null);

        JButton btnHabitacionSencilla = new JButton("Sencilla");
        btnHabitacionSencilla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                HabitacionSimple HabitacionSimple = new HabitacionSimple();
                textPrecioHS.setText(Integer.toString(HabitacionSimple.Precio));
                textField.setText("Su selección fue habitación simple");

            }
        });
        btnHabitacionSencilla.setFont(new Font("Arial", Font.PLAIN, 11));
        btnHabitacionSencilla.setBounds(52, 104, 119, 40);
        getContentPane().add(btnHabitacionSencilla);

        JButton btnHabitacionDoble = new JButton("Doble");
        btnHabitacionDoble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                HabitacionDoble HabitacionDoble = new HabitacionDoble();

                textPrecioHD.setText(Integer.toString(HabitacionDoble.Precio));
                textField.setText("Su selección fue habitación doble");

            }
        });

        btnHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 11));
        btnHabitacionDoble.setBounds(298, 104, 119, 40);
        getContentPane().add(btnHabitacionDoble);

        JButton btnHabitacionMatrimonial = new JButton("Matrimonial");
        btnHabitacionMatrimonial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                HabitacionMatrimonial HabitacionMatrimonial = new HabitacionMatrimonial();

                textPrecioHM.setText(Integer.toString(HabitacionMatrimonial.Precio));
                textField.setText("Su selección fue habitación matrimonial");

            }
        });
        btnHabitacionMatrimonial.setIcon(null);
        btnHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 11));
        btnHabitacionMatrimonial.setBounds(540, 104, 119, 40);
        getContentPane().add(btnHabitacionMatrimonial);

        JLabel lblHabitacionSencilla = new JLabel("Precio:");
        lblHabitacionSencilla.setFont(new Font("Arial", Font.PLAIN, 11));
        lblHabitacionSencilla.setBounds(33, 170, 46, 14);
        getContentPane().add(lblHabitacionSencilla);

        JLabel lblHabitacionDoble = new JLabel("Precio:");
        lblHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 11));
        lblHabitacionDoble.setBounds(275, 170, 46, 14);
        getContentPane().add(lblHabitacionDoble);

        JLabel lblHabitacionMatrimonial = new JLabel("Precio:");
        lblHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 11));
        lblHabitacionMatrimonial.setBounds(536, 170, 46, 14);
        getContentPane().add(lblHabitacionMatrimonial);

        textPrecioHS = new JTextField();
        textPrecioHS.setEditable(false);
        textPrecioHS.setBounds(73, 167, 79, 20);
        getContentPane().add(textPrecioHS);
        textPrecioHS.setColumns(10);

        textPrecioHD = new JTextField();
        textPrecioHD.setEditable(false);
        textPrecioHD.setColumns(10);
        textPrecioHD.setBounds(316, 167, 79, 20);
        getContentPane().add(textPrecioHD);

        textPrecioHM = new JTextField();
        textPrecioHM.setEditable(false);
        textPrecioHM.setColumns(10);
        textPrecioHM.setBounds(580, 167, 79, 20);
        getContentPane().add(textPrecioHM);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(48, 311, 280, 20);
        getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.setBounds(376, 310, 89, 23);
        getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Ver habitación");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sencilla FotoSimple = new Sencilla();
                FotoSimple.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(48, 225, 123, 23);
        getContentPane().add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("Ver habitación");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Doble FotoDoble = new Doble();
                FotoDoble.setVisible(true);
            }
        });
        btnNewButton_1_1.setBounds(303, 225, 129, 23);
        getContentPane().add(btnNewButton_1_1);

        JButton btnNewButton_1_2 = new JButton("Ver habitación");
        btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Matrimonial FotoMatri = new Matrimonial();
                FotoMatri.setVisible(true);
            }
        });
        btnNewButton_1_2.setBounds(555, 225, 119, 23);
        getContentPane().add(btnNewButton_1_2);

    }
}