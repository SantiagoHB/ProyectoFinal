package Formularios;

import java.awt.event.ActionListener;

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

        JButton btnHabitacionSencilla = new JButton("");
        btnHabitacionSencilla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                HabitacionSimple HabitacionSimple = new HabitacionSimple();

                textPrecioHS.setText(Integer.toString(HabitacionSimple.Precio));
                textField.setText("Su selección fue habitación simple");
                

            }
        });
        btnHabitacionSencilla.setFont(new Font("Arial", Font.PLAIN, 11));
        btnHabitacionSencilla.setIcon(new ImageIcon(frmHabitacion.class.getResource("/Imagenes/Java1.png")));
        btnHabitacionSencilla.setBounds(33, 47, 119, 112);
        getContentPane().add(btnHabitacionSencilla);

        JButton btnHabitacionDoble = new JButton("");
        btnHabitacionDoble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                HabitacionDoble HabitacionDoble = new HabitacionDoble();

                textPrecioHD.setText(Integer.toString(HabitacionDoble.Precio));
                textField.setText("Su selección fue habitación doble");

            }
        });

        btnHabitacionDoble.setIcon(new ImageIcon(frmHabitacion.class.getResource("/Imagenes/Java2.png")));
        btnHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 11));
        btnHabitacionDoble.setBounds(162, 47, 119, 112);
        getContentPane().add(btnHabitacionDoble);

        JButton btnHabitacionMatrimonial = new JButton("");
        btnHabitacionMatrimonial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                HabitacionMatrimonial HabitacionMatrimonial = new HabitacionMatrimonial();

                textPrecioHM.setText(Integer.toString(HabitacionMatrimonial.Precio));
                textField.setText("Su selección fue habitación matrimonial");

            }
        });
        btnHabitacionMatrimonial.setIcon(new ImageIcon(frmHabitacion.class.getResource("/Imagenes/Java3.png")));
        btnHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 11));
        btnHabitacionMatrimonial.setBounds(291, 47, 119, 112);
        getContentPane().add(btnHabitacionMatrimonial);

        JLabel lblHabitacionSencilla = new JLabel("Precio:");
        lblHabitacionSencilla.setFont(new Font("Arial", Font.PLAIN, 11));
        lblHabitacionSencilla.setBounds(33, 170, 46, 14);
        getContentPane().add(lblHabitacionSencilla);

        JLabel lblHabitacionDoble = new JLabel("Precio:");
        lblHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 11));
        lblHabitacionDoble.setBounds(162, 170, 46, 14);
        getContentPane().add(lblHabitacionDoble);

        JLabel lblHabitacionMatrimonial = new JLabel("Precio:");
        lblHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 11));
        lblHabitacionMatrimonial.setBounds(291, 170, 46, 14);
        getContentPane().add(lblHabitacionMatrimonial);

        textPrecioHS = new JTextField();
        textPrecioHS.setEditable(false);
        textPrecioHS.setBounds(73, 167, 79, 20);
        getContentPane().add(textPrecioHS);
        textPrecioHS.setColumns(10);

        textPrecioHD = new JTextField();
        textPrecioHD.setEditable(false);
        textPrecioHD.setColumns(10);
        textPrecioHD.setBounds(202, 167, 79, 20);
        getContentPane().add(textPrecioHD);

        textPrecioHM = new JTextField();
        textPrecioHM.setEditable(false);
        textPrecioHM.setColumns(10);
        textPrecioHM.setBounds(331, 170, 79, 20);
        getContentPane().add(textPrecioHM);
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(48, 311, 280, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.setBounds(376, 310, 89, 23);
        getContentPane().add(btnNewButton);

    }
}