package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.HabitacionDoble;
import Clases.HabitacionMatrimonial;
import Clases.HabitacionSimple;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAdministracion extends JFrame {


	private JPanel contentPane;

	public frmAdministracion() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(68, 144, 129, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[]{"Seleccione habitación", "Sencilla", "Doble", "Matrimonial"}));
		contentPane.add(comboBox);		
		
		
		JLabel lblNewLabel = new JLabel("Costo Habitaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(68, 103, 154, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int PrecioSimp,op; 
				do {
				if(comboBox.getSelectedItem().toString()=="Sencilla") {
					
					HabitacionSimple PrecioSimple = new HabitacionSimple();
					
					
					int opcion=Integer.parseInt(JOptionPane.showInputDialog(null," 1. Actualizar precio\n 2. Consultar precio",
							" Habitación Simple "+"",JOptionPane.QUESTION_MESSAGE));
					
					
					
					switch (opcion) {
					case 1:
						PrecioSimp =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese "
								+ "su nuevo precio.",
								"Habitación Sencilla"+"",JOptionPane.QUESTION_MESSAGE));
						PrecioSimple.setPrecio(PrecioSimp);
						PrecioSimp=PrecioSimple.AlmacenarDato();
						JOptionPane.showMessageDialog(null, "Precio habitación simple es de: " + PrecioSimp);
						 break;
						 
					case 2:
						PrecioSimp=PrecioSimple.AlmacenarDato();
						JOptionPane.showMessageDialog(null, "Precio habitación simple es de: " + PrecioSimp);
					default:
						break;
					}
				}
				if(comboBox.getSelectedItem().toString()=="Doble") {
					HabitacionDoble PrecioDoble = new HabitacionDoble();
					int opcion=Integer.parseInt(JOptionPane.showInputDialog(null," 1. Actualizar precio\n 2. Consultar precio",
							" Habitación Doble "+"",JOptionPane.QUESTION_MESSAGE));
					int PrecioDob; 
					
					switch (opcion) {
					case 1:
						PrecioDob =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese "
								+ "su nuevo precio.",
								"Habitación Doble"+"",JOptionPane.QUESTION_MESSAGE));
						PrecioDoble.setPrecio(PrecioDob);
						

						JOptionPane.showMessageDialog(null, "Precio habitación doble es de: " + PrecioDob);
						 break;
						 
					case 2:
						PrecioDob=PrecioDoble.getPrecio();
						JOptionPane.showMessageDialog(null, "Precio habitación doble es de: " + PrecioDob);
					default:
						break;
					}
				}
				if(comboBox.getSelectedItem().toString()=="Matrimonial") {
					HabitacionMatrimonial PrecioMatrimonial= new HabitacionMatrimonial();
					int opcion=Integer.parseInt(JOptionPane.showInputDialog(null," 1. Actualizar precio\n 2. Consultar precio",
							" Habitación Matrimonial "+"",JOptionPane.QUESTION_MESSAGE));
					int PrecioMatri; 
					
					switch (opcion) {
					case 1:
						PrecioMatri =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese "
								+ "su nuevo precio.",
								"Habitación Matrimonial"+"",JOptionPane.QUESTION_MESSAGE));
						PrecioMatrimonial.setPrecio(PrecioMatri);
						

						JOptionPane.showMessageDialog(null, "Precio habitación matrimonial es de: " + PrecioMatri);
						 break;
						 
					case 2:
						PrecioMatri=PrecioMatrimonial.getPrecio();
						JOptionPane.showMessageDialog(null, "Precio habitación matrimonial es de: " + PrecioMatri);
					default:
						break;
					}
				}
				op = JOptionPane.showConfirmDialog(null, "¿Desea ralizar otra acción?", "", 
						JOptionPane.YES_NO_OPTION);
			}while(op == 0);
			}
		});
		btnNewButton.setBounds(252, 144, 89, 23);
		contentPane.add(btnNewButton);
	}
}
