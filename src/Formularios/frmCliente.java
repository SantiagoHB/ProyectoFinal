package Formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Inicio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class frmCliente extends JFrame {

	JPanel contentPane;
	JTextField textCedula;
	JTextField textNombre;
	JTextField textSalarioMes;
	JTextField textSalarioDia;
	JTextField textMesNumero;
	JRadioButton rdbtnVerdadero, rdbtnFalso;
	ButtonGroup GrupoRadios;
	JTextField textResultadoRadio;
	
	public frmCliente() {
		
    	Inicio.datosHotel[0][0] = "98123456";
    	Inicio.datosHotel[0][1] = "Maria Isabel";  
    	Inicio.datosHotel[0][2] = "20";  
		
    	Inicio.datosHotel[0][0] = "123456789";
    	Inicio.datosHotel[0][1] = "Juan Camilo";  
    	Inicio.datosHotel[0][2] = "50";  
    	    	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 560, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CEDULA
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCedula.setBounds(10, 27, 157, 25);
		contentPane.add(lblCedula);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Arial", Font.PLAIN, 14));
		textCedula.setBounds(177, 27, 298, 20);
		contentPane.add(textCedula);
		textCedula.setColumns(10);
		
		//NOMBRE
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 55, 157, 25);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		textNombre.setColumns(10);
		textNombre.setBounds(177, 55, 298, 20);
		contentPane.add(textNombre);

		//SALARIO DIA
		JLabel lblSalarioDia = new JLabel("Salario dia");
		lblSalarioDia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSalarioDia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalarioDia.setBounds(10, 84, 157, 25);
		contentPane.add(lblSalarioDia);
		
		textSalarioDia = new JTextField();
		textSalarioDia.setFont(new Font("Arial", Font.PLAIN, 14));
		textSalarioDia.setColumns(10);
		textSalarioDia.setBounds(177, 84, 298, 20);
		contentPane.add(textSalarioDia);
		
		//SALARIO MES...  CALCULADO
		JLabel lblSalarioMes = new JLabel("Salario mes");
		lblSalarioMes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSalarioMes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalarioMes.setBounds(10, 115, 157, 25);
		contentPane.add(lblSalarioMes);
		
		textSalarioMes = new JTextField();
		textSalarioMes.setFont(new Font("Arial", Font.PLAIN, 14));
		textSalarioMes.setColumns(10);
		textSalarioMes.setBounds(177, 115, 298, 20);
		contentPane.add(textSalarioMes);
							
		//COMBOBOX FECHA
		JLabel lblMes = new JLabel("Mes nacimiento");
		lblMes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMes.setBounds(10, 146, 157, 25);
		contentPane.add(lblMes);

		JComboBox cbxMes = new JComboBox();
		cbxMes.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo"}));
		cbxMes.setBounds(177, 146, 298, 22);
		contentPane.add(cbxMes);
			
		//MES EN NUMERO
		JLabel lblMesNumero = new JLabel("Mes numero");
		lblMesNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMesNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMesNumero.setBounds(10, 179, 157, 25);
		contentPane.add(lblMesNumero);
		
		textMesNumero = new JTextField();
		textMesNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		textMesNumero.setColumns(10);
		textMesNumero.setBounds(177, 179, 298, 20);
		contentPane.add(textMesNumero);
		
		cbxMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Numero = 0;
				if (cbxMes.getSelectedItem().toString() == "Enero")
					Numero = 1;
				if (cbxMes.getSelectedItem().toString() == "Febrero")
					Numero = 2;
				if (cbxMes.getSelectedItem().toString() == "Marzo")
					Numero = 3;
				if (cbxMes.getSelectedItem().toString() == "Abril")
					Numero = 4;
				if (cbxMes.getSelectedItem().toString() == "Mayo")
					Numero = 5;
				String mensaje = "El mes seleccionado en numero es: ";
				mensaje = mensaje + Integer.toString(Numero);
				textMesNumero.setText(mensaje);
			}
		});
				
		//BOTON CALCULAR
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(frmCliente.class.getResource("/Imagenes/Calcular.png")));
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCalcular.setToolTipText("Calcula el salario mes");
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int salarioMes;
				salarioMes = Integer.parseInt(textSalarioDia.getText()) * 30;
				String resultado = Integer.toString(salarioMes);
				textSalarioMes.setText(resultado);
			}
		});
		btnCalcular.setBounds(197, 299, 108, 95);
		contentPane.add(btnCalcular);
		

		
		//CHECKBOX
		JCheckBox chckbxOpcion1 = new JCheckBox("Opcion #1");
		chckbxOpcion1.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxOpcion1.setBounds(177, 206, 97, 23);
		contentPane.add(chckbxOpcion1);
		
		JCheckBox chckbxOpcion2 = new JCheckBox("Opcion #2");
		chckbxOpcion2.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxOpcion2.setBounds(177, 232, 97, 23);
		contentPane.add(chckbxOpcion2);
		
		//RADIOBUTTON
		ButtonGroup GrupoRadios = new ButtonGroup();
		JRadioButton rdbtnVerdadero = new JRadioButton("Verdadero");
		rdbtnVerdadero.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnVerdadero.setBounds(345, 206, 109, 23);
		contentPane.add(rdbtnVerdadero);
		
		JRadioButton rdbtnFalso = new JRadioButton("Falso");
		rdbtnFalso.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnFalso.setBounds(345, 233, 109, 23);
		contentPane.add(rdbtnFalso);
		
		GrupoRadios.add(rdbtnVerdadero);
		GrupoRadios.add(rdbtnFalso);
		
		textResultadoRadio = new JTextField();
		textResultadoRadio.setFont(new Font("Arial", Font.PLAIN, 14));
		textResultadoRadio.setBounds(345, 263, 130, 20);
		contentPane.add(textResultadoRadio);
		textResultadoRadio.setColumns(10);
		
		//BOTON VALIDAR
		JButton btnValidar = new JButton("Validar Radio Button");
		btnValidar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnValidar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnVerdadero.isSelected())
				{
					textResultadoRadio.setText("VERDADERO");
					JOptionPane.showMessageDialog(null,"Se selecciono el radio button VERDADERO");
				}
				if (rdbtnFalso.isSelected())
				{
					textResultadoRadio.setText("FALSO");
					JOptionPane.showMessageDialog(null,"Se selecciono el radio button FALSO");
				}
			}
		});
		btnValidar.setToolTipText("Valida lo seleccionado en el RadioButton");
		btnValidar.setBounds(302, 330, 173, 63);
		contentPane.add(btnValidar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio Inicio = new Inicio();
				for (int i=0; i<=4; i++)
				  {  
				    if (Inicio.datosHotel[i][0] == null)
				      { 
				    	Inicio.datosHotel[i][0] = textCedula.getText();
				    	Inicio.datosHotel[i][1] = textNombre.getText();  
				    	Inicio.datosHotel[i][2] = textSalarioDia.getText();  
				      }  
				  }
				
				
			}
		});
		btnGuardar.setBounds(47, 330, 89, 23);
		contentPane.add(btnGuardar);
	}
}
