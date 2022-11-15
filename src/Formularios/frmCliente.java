package Formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.HabitacionDoble;
import Clases.HabitacionMatrimonial;
import Clases.HabitacionSimple;
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
	private JTextField textPrecioDia;
	private JTextField textFechaNacimiento;
	private JTextField textPrecioDiasSeleccionados;
	private JTextField textDiasSeleccionados;

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
		JLabel lblCedula = new JLabel("Cedula :");
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
		JLabel lblNombre = new JLabel("Nombre :");
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
		JLabel lblEmail = new JLabel("Email :");
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
		JLabel lblAño = new JLabel("Año Nacimiento :");
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
		JLabel lblMes = new JLabel("Mes Nacimiento :");
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

		JLabel lblDiaNacimiento = new JLabel("Dia Nacimiento :");
		lblDiaNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiaNacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiaNacimiento.setBounds(10, 176, 157, 25);
		contentPane.add(lblDiaNacimiento);

		textDia = new JTextField();
		textDia.setFont(new Font("Arial", Font.PLAIN, 14));
		textDia.setColumns(10);
		textDia.setBounds(177, 179, 298, 20);
		contentPane.add(textDia);

		JLabel lblPrecioDia = new JLabel("Precio Dia :");
		lblPrecioDia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioDia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPrecioDia.setBounds(10, 367, 157, 25);
		contentPane.add(lblPrecioDia);

		textPrecioDia = new JTextField();
		textPrecioDia.setEditable(false);
		textPrecioDia.setFont(new Font("Arial", Font.PLAIN, 14));
		textPrecioDia.setColumns(10);
		textPrecioDia.setBounds(208, 369, 298, 20);
		contentPane.add(textPrecioDia);

		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(485, 211, 238, 20);
		contentPane.add(textFechaNacimiento);

		JRadioButton rdbtnHabitacionSimple = new JRadioButton("Habitacion Simple");
		rdbtnHabitacionSimple.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHabitacionSimple.setBounds(177, 206, 137, 23);
		contentPane.add(rdbtnHabitacionSimple);

		JRadioButton rdbtnHabitacionDoble = new JRadioButton("Habitacion Doble");
		rdbtnHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHabitacionDoble.setBounds(177, 232, 137, 23);
		contentPane.add(rdbtnHabitacionDoble);

		JRadioButton rdbtnHabitacionMatrimonial = new JRadioButton("Habitacion Matrimonial");
		rdbtnHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHabitacionMatrimonial.setBounds(177, 258, 173, 23);
		contentPane.add(rdbtnHabitacionMatrimonial);

		JLabel lblPrecioDiasSeleccionados = new JLabel("Precio Dias Seleccionados :");
		lblPrecioDiasSeleccionados.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPrecioDiasSeleccionados.setBounds(10, 403, 188, 25);
		contentPane.add(lblPrecioDiasSeleccionados);

		textPrecioDiasSeleccionados = new JTextField();
		textPrecioDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		textPrecioDiasSeleccionados.setEditable(false);
		textPrecioDiasSeleccionados.setColumns(10);
		textPrecioDiasSeleccionados.setBounds(208, 405, 298, 20);
		contentPane.add(textPrecioDiasSeleccionados);

		JLabel lblDiasASeleccionar = new JLabel("Numero dias a seleccionar :");
		lblDiasASeleccionar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiasASeleccionar.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiasASeleccionar.setBounds(10, 296, 188, 25);
		contentPane.add(lblDiasASeleccionar);

		JComboBox cbxDiasSeleccionados = new JComboBox();
		cbxDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxDiasSeleccionados.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12" }));
		cbxDiasSeleccionados.setBounds(208, 298, 298, 22);
		contentPane.add(cbxDiasSeleccionados);

		JLabel lblDiasAseleccionados = new JLabel("Dias Seleccionados :");
		lblDiasAseleccionados.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiasAseleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiasAseleccionados.setBounds(10, 331, 188, 25);
		contentPane.add(lblDiasAseleccionados);

		textDiasSeleccionados = new JTextField();
		textDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		textDiasSeleccionados.setEditable(false);
		textDiasSeleccionados.setColumns(10);
		textDiasSeleccionados.setBounds(208, 331, 298, 20);
		contentPane.add(textDiasSeleccionados);

		// BOTON CALCULAR
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(frmCliente.class.getResource("/Imagenes/Calcular.png")));
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCalcular.setToolTipText("Calcula el salario mes");
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				HabitacionSimple HabitacionSimple = new HabitacionSimple();
				HabitacionDoble HabitacionDoble = new HabitacionDoble();
				HabitacionMatrimonial HabitacionMatrimonial = new HabitacionMatrimonial();

				int PrecioDiasSeleccionado = 0;

				short NumDias = 0;

				textDiasSeleccionados.setText(cbxDiasSeleccionados.getSelectedItem().toString());

				if (cbxDiasSeleccionados.getSelectedItem().toString() == "1")
					NumDias = 1;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "2")
					NumDias = 2;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "3")
					NumDias = 3;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "4")
					NumDias = 4;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "5")
					NumDias = 5;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "6")
					NumDias = 6;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "7")
					NumDias = 7;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "8")
					NumDias = 8;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "9")
					NumDias = 9;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "10")
					NumDias = 10;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "11")
					NumDias = 11;
				if (cbxDiasSeleccionados.getSelectedItem().toString() == "12")
					NumDias = 12;

				if (rdbtnHabitacionSimple.isSelected() == true)
					textPrecioDia.setText(Integer.toString(HabitacionSimple.Precio));
				PrecioDiasSeleccionado = HabitacionSimple.Precio * NumDias;
				textPrecioDiasSeleccionados.setText("" + PrecioDiasSeleccionado);
				if (rdbtnHabitacionDoble.isSelected() == true)
					textPrecioDia.setText(Integer.toString(HabitacionDoble.Precio));
				PrecioDiasSeleccionado = HabitacionDoble.Precio * NumDias;
				textPrecioDiasSeleccionados.setText("" + PrecioDiasSeleccionado);
				if (rdbtnHabitacionMatrimonial.isSelected() == true)
					textPrecioDia.setText(Integer.toString(HabitacionMatrimonial.Precio));
				PrecioDiasSeleccionado = HabitacionMatrimonial.Precio * NumDias;
				textPrecioDiasSeleccionados.setText("" + PrecioDiasSeleccionado);

			}
		});
		btnCalcular.setBounds(59, 474, 108, 95);
		contentPane.add(btnCalcular);

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

	}
}
