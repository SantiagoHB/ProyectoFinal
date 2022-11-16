package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class frmMenu extends JFrame implements ActionListener {

    public frmMenu() {
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setFont(new Font("Arial", Font.PLAIN, 14));
        setJMenuBar(MenuBar);

        JMenu menu1 = new JMenu("Recepcionista");
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

        JMenu menu2 = new JMenu("Habitaciones");
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
        
        JMenu mnNewMenu = new JMenu("Administración");
        MenuBar.add(mnNewMenu);
        
        JButton btnNewButton = new JButton("Precio Habitaciones");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmAdministracion Admin = new frmAdministracion();
        		Admin.setVisible(true);
        	}
        });
        mnNewMenu.add(btnNewButton);

        setBounds(100, 100, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
    }

    public void actionPerformed(ActionEvent eventoClick) {

    }
}
