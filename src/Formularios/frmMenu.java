package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class frmMenu extends JFrame implements ActionListener {

    public frmMenu() {
        getContentPane().setLayout(null);
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setFont(new Font("Arial", Font.PLAIN, 14));
        setJMenuBar(MenuBar);

        JMenu menu1 = new JMenu("Menu #1");
        menu1.setFont(new Font("Arial", Font.PLAIN, 16));
        MenuBar.add(menu1);

        JMenuItem Cliente = new JMenuItem("Ingresar Cliente");
        Cliente.setIcon(new ImageIcon(frmMenu.class.getResource("/Imagenes/Cliente.png")));
        Cliente.setFont(new Font("Arial", Font.PLAIN, 14));
        Cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmCliente frmCliente = new frmCliente();
                frmCliente.setVisible(true); // HACE VISIBLE EL CONSTRUCTOR
            }
        });

        menu1.add(Cliente);

        JMenu menu2 = new JMenu("Menu #2");
        menu2.setFont(new Font("Arial", Font.PLAIN, 16));
        MenuBar.add(menu2);

        JMenuItem Menu2Habitaciones = new JMenuItem("Habitaciones");
        Menu2Habitaciones.setFont(new Font("Arial", Font.PLAIN, 14));
        Menu2Habitaciones.setIcon(new ImageIcon(frmMenu.class.getResource("/Imagenes/Java1.png")));
        Menu2Habitaciones.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmHabitacion frmHabitacion = new frmHabitacion();
                frmHabitacion.setVisible(true); // HACE VISIBLE EL CONSTRUCTOR
            }
        });

        menu2.add(Menu2Habitaciones);

        setBounds(100, 100, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent eventoClick) {

    }
}
