package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class frmMenu extends JFrame implements ActionListener{
	
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
    			frmCliente.setVisible(true);						//HACE VISIBLE EL CONSTRUCTOR
        	}
        });

        menu1.add(Cliente);
        
        JMenu menu2 = new JMenu("Menu #2");
        menu2.setFont(new Font("Arial", Font.PLAIN, 16));
        MenuBar.add(menu2);
                
        JMenuItem Menu2Item1 = new JMenuItem("Opcion #1");
        Menu2Item1.setFont(new Font("Arial", Font.PLAIN, 14));
        Menu2Item1.setIcon(new ImageIcon(frmMenu.class.getResource("/Imagenes/Java1.png")));
        Menu2Item1.addActionListener(this);
        
        menu2.add(Menu2Item1);
        
        JMenuItem Menu2Item2 = new JMenuItem("Opcion #2");
        Menu2Item2.setIcon(new ImageIcon(frmMenu.class.getResource("/Imagenes/Java2.png")));
        Menu2Item2.setFont(new Font("Arial", Font.PLAIN, 14));
        Menu2Item2.addActionListener(this);
        menu2.add(Menu2Item2);
        
        JMenuItem Menu2Item3 = new JMenuItem("Opcion #3");
        Menu2Item3.setIcon(new ImageIcon(frmMenu.class.getResource("/Imagenes/Java3.png")));
        Menu2Item3.setFont(new Font("Arial", Font.PLAIN, 14));
        Menu2Item3.addActionListener(this);
        menu2.add(Menu2Item3);    
        
    	setBounds(100, 100, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public void actionPerformed(ActionEvent eventoClick) {
	}
}


