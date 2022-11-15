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
	JTextField textEmail;
	JTextField textDiaNacimiento;
	JTextField textAño;
	JRadioButton rdbtnVerdadero, rdbtnFalso;
	ButtonGroup GrupoRadios;
	private JTextField textDia;
	private JTextField textPrecio;
	private JTextField textFechaNacimiento;

	public frmCliente() {

		Inicio.datosHotel[0][0] = "98123456";
		Inicio.datosHotel[0][1] = "Maria Isabel";
		Inicio.datosHotel[0][2] = "20";

		Inicio.datosHotel[0][0] = "123456789";
		Inicio.datosHotel[0][1] = "Juan Camilo";
		Inicio.datosHotel[0][2] = "50";

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// CEDULA
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

		// NOMBRE
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

		// SALARIO DIA
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(10, 84, 157, 25);
		contentPane.add(lblEmail);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		textEmail.setColumns(10);
		textEmail.setBounds(177, 84, 298, 20);
		contentPane.add(textEmail);

		// SALARIO MES... CALCULADO
		// JLabel lblSalarioMes = new JLabel("Salario mes");
		// lblSalarioMes.setFont(new Font("Arial", Font.PLAIN, 14));
		// lblSalarioMes.setHorizontalAlignment(SwingConstants.RIGHT);
		// lblSalarioMes.setBounds(10, 115, 157, 25);
		// contentPane.add(lblSalarioMes);

		// textSalarioMes = new JTextField();
		// textSalarioMes.setFont(new Font("Arial", Font.PLAIN, 14));
		// textSalarioMes.setColumns(10);
		// textSalarioMes.setBounds(177, 115, 298, 20);
		// contentPane.add(textSalarioMes);

		// Año
		JLabel lblAño = new JLabel("Año Nacimiento");
		lblAño.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAño.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAño.setBounds(10, 115, 157, 25);
		contentPane.add(lblAño);

		textAño = new JTextField();
		textAño.setFont(new Font("Arial", Font.PLAIN, 14));
		textAño.setColumns(10);
		textAño.setBounds(177, 115, 298, 20);
		contentPane.add(textAño);

		// COMBOBOX FECHA
		JLabel lblMes = new JLabel("Mes nacimiento");
		lblMes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMes.setBounds(10, 146, 157, 25);
		contentPane.add(lblMes);

		JComboBox cbxMes = new JComboBox();
		cbxMes.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxMes.setModel(new DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
		cbxMes.setBounds(177, 146, 298, 22);
		contentPane.add(cbxMes);

		JLabel lblDiaNacimiento = new JLabel("Dia Nacimiento");
		lblDiaNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiaNacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiaNacimiento.setBounds(10, 176, 157, 25);
		contentPane.add(lblDiaNacimiento);

		textDia = new JTextField();
		textDia.setFont(new Font("Arial", Font.PLAIN, 14));
		textDia.setColumns(10);
		textDia.setBounds(177, 179, 298, 20);
		contentPane.add(textDia);

		// BOTON CALCULAR
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(frmCliente.class.getResource("/Imagenes/Calcular.png")));
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCalcular.setToolTipText("Calcula el salario mes");
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(45, 206, 108, 95);
		contentPane.add(btnCalcular);

		// CHECKBOX
		JCheckBox chckbxHabitacionSencilla = new JCheckBox("Habitacion Sencilla");
		chckbxHabitacionSencilla.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxHabitacionSencilla.setBounds(177, 206, 145, 23);
		contentPane.add(chckbxHabitacionSencilla);

		JCheckBox chckbxHabitacionDoble = new JCheckBox("Habitacion Doble");
		chckbxHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxHabitacionDoble.setBounds(177, 232, 145, 23);
		contentPane.add(chckbxHabitacionDoble);

		// RADIOBUTTON

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Inicio Inicio = new Inicio();

				int Numero = 0;
				String MesNum;

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
				if (cbxMes.getSelectedItem().toString() == "Junio")
					Numero = 6;
				if (cbxMes.getSelectedItem().toString() == "Julio")
					Numero = 7;
				if (cbxMes.getSelectedItem().toString() == "Agosto")
					Numero = 8;
				if (cbxMes.getSelectedItem().toString() == "Septiembre")
					Numero = 9;
				if (cbxMes.getSelectedItem().toString() == "Octubre")
					Numero = 10;
				if (cbxMes.getSelectedItem().toString() == "Noviembre")
					Numero = 11;
				if (cbxMes.getSelectedItem().toString() == "Diciembre")
					Numero = 12;

				MesNum = Integer.toString(Numero);

				textFechaNacimiento.setText(textDia.getText() + "/" + MesNum + "/" + textAño.getText());

				for (int i = 0; i <= 4; i++) {
					if (Inicio.datosHotel[i][0] == null) {
						Inicio.datosHotel[i][0] = textCedula.getText();
						Inicio.datosHotel[i][1] = textNombre.getText();
						Inicio.datosHotel[i][2] = textEmail.getText();
						Inicio.datosHotel[i][3] = textFechaNacimiento.getText();
					}
				}
			}
		});
		btnGuardar.setBounds(386, 210, 89, 23);
		contentPane.add(btnGuardar);

		JCheckBox chckbxHabitacionMatrimonial = new JCheckBox("Habitacion Matrimonial");
		chckbxHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxHabitacionMatrimonial.setBounds(177, 258, 173, 23);
		contentPane.add(chckbxHabitacionMatrimonial);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPrecio.setBounds(10, 313, 157, 25);
		contentPane.add(lblPrecio);

		textPrecio = new JTextField();
		textPrecio.setFont(new Font("Arial", Font.PLAIN, 14));
		textPrecio.setColumns(10);
		textPrecio.setBounds(177, 315, 298, 20);
		contentPane.add(textPrecio);

		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(485, 211, 238, 20);
		contentPane.add(textFechaNacimiento);

	}
}
