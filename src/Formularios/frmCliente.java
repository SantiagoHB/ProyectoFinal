package Formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Habitacion;
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
	private JTextField textFechaReserva;
	private JTextField textFechaFinalReserva;
	private JTextField textNumeroHabitacion;
	private JTextField textHabitacionesDisponibles;

	public frmCliente() {

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
		lblPrecioDia.setBounds(24, 402, 157, 25);
		contentPane.add(lblPrecioDia);
		
		textPrecioDia = new JTextField();
		textPrecioDia.setEditable(false);
		textPrecioDia.setFont(new Font("Arial", Font.PLAIN, 14));
		textPrecioDia.setColumns(10);
		textPrecioDia.setBounds(222, 404, 298, 20);
		contentPane.add(textPrecioDia);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setEditable(false);
		textFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(493, 179, 238, 20);
		contentPane.add(textFechaNacimiento);
		
		JRadioButton rdbtnHabitacionSimple = new JRadioButton("Habitacion Simple # Habitacion 1 a 5");
		rdbtnHabitacionSimple.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHabitacionSimple.setBounds(177, 206, 278, 23);
		contentPane.add(rdbtnHabitacionSimple);
		
		JRadioButton rdbtnHabitacionDoble = new JRadioButton("Habitacion Doble # Habitacion 6 a 10");
		rdbtnHabitacionDoble.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHabitacionDoble.setBounds(177, 232, 298, 23);
		contentPane.add(rdbtnHabitacionDoble);
		
		JRadioButton rdbtnHabitacionMatrimonial = new JRadioButton("Habitacion Matrimonial # Habitacion 11 a 15");
		rdbtnHabitacionMatrimonial.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHabitacionMatrimonial.setBounds(177, 258, 309, 23);
		contentPane.add(rdbtnHabitacionMatrimonial);
		
		JLabel lblPrecioDiasSeleccionados = new JLabel("Precio Dias Seleccionados :");
		lblPrecioDiasSeleccionados.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPrecioDiasSeleccionados.setBounds(24, 438, 188, 25);
		contentPane.add(lblPrecioDiasSeleccionados);
		
		textPrecioDiasSeleccionados = new JTextField();
		textPrecioDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		textPrecioDiasSeleccionados.setEditable(false);
		textPrecioDiasSeleccionados.setColumns(10);
		textPrecioDiasSeleccionados.setBounds(222, 440, 298, 20);
		contentPane.add(textPrecioDiasSeleccionados);
		
		JLabel lblDiasASeleccionar = new JLabel("Numero dias a seleccionar :");
		lblDiasASeleccionar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiasASeleccionar.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiasASeleccionar.setBounds(24, 331, 188, 25);
		contentPane.add(lblDiasASeleccionar);
		
		JComboBox cbxDiasSeleccionados = new JComboBox();
		cbxDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxDiasSeleccionados.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12" }));
		cbxDiasSeleccionados.setBounds(222, 333, 298, 22);
		contentPane.add(cbxDiasSeleccionados);
		
		JLabel lblDiasAseleccionados = new JLabel("Dias Seleccionados :");
		lblDiasAseleccionados.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiasAseleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiasAseleccionados.setBounds(24, 366, 188, 25);
		contentPane.add(lblDiasAseleccionados);
		
		textDiasSeleccionados = new JTextField();
		textDiasSeleccionados.setFont(new Font("Arial", Font.PLAIN, 14));
		textDiasSeleccionados.setEditable(false);
		textDiasSeleccionados.setColumns(10);
		textDiasSeleccionados.setBounds(222, 366, 298, 20);
		contentPane.add(textDiasSeleccionados);
		
		JLabel lblMesReserva = new JLabel("Mes Reserva :");
		lblMesReserva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMesReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMesReserva.setBounds(55, 304, 157, 25);
		contentPane.add(lblMesReserva);
		
		JComboBox cbxMesReserva = new JComboBox();
		cbxMesReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxMesReserva.setBounds(222, 304, 298, 22);
		cbxMesReserva.setModel(new DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
		contentPane.add(cbxMesReserva);
		
		JLabel lblAñoReserva = new JLabel("Año Reserva :");
		lblAñoReserva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAñoReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAñoReserva.setBounds(524, 304, 157, 25);
		contentPane.add(lblAñoReserva);
		
		JComboBox cbxAñoReserva = new JComboBox();
		cbxAñoReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxAñoReserva.setModel(new DefaultComboBoxModel(new String[] { "2022", "2023", "2024", "2025", "2026"}));
		cbxAñoReserva.setBounds(691, 304, 298, 22);
		contentPane.add(cbxAñoReserva);
		
		JLabel lblDiaReserva = new JLabel("Dia Reserva :");
		lblDiaReserva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiaReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiaReserva.setBounds(524, 331, 157, 25);
		contentPane.add(lblDiaReserva);
		
		JComboBox cbxDiaReserva = new JComboBox();
		cbxDiaReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxDiaReserva.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbxDiaReserva.setBounds(691, 331, 298, 22);
		contentPane.add(cbxDiaReserva);
		
		textFechaReserva = new JTextField();
		textFechaReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		textFechaReserva.setEditable(false);
		textFechaReserva.setColumns(10);
		textFechaReserva.setBounds(691, 366, 238, 20);
		contentPane.add(textFechaReserva);
		
		JLabel lblFechaReserva = new JLabel("Fecha Inicio Reserva :");
		lblFechaReserva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFechaReserva.setBounds(524, 361, 157, 25);
		contentPane.add(lblFechaReserva);
		
		/*JLabel lblFechaFinalReserva = new JLabel("Fecha Final Reserva :");
		lblFechaFinalReserva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaFinalReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFechaFinalReserva.setBounds(524, 399, 157, 25);
		contentPane.add(lblFechaFinalReserva);
		
		textFechaFinalReserva = new JTextField();
		textFechaFinalReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		textFechaFinalReserva.setEditable(false);
		textFechaFinalReserva.setColumns(10);
		textFechaFinalReserva.setBounds(691, 404, 238, 20);
		contentPane.add(textFechaFinalReserva);*/
		
		JLabel lblNumeroHabitacion = new JLabel("Numero Habitacion :");
		lblNumeroHabitacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroHabitacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumeroHabitacion.setBounds(524, 402, 157, 25);
		contentPane.add(lblNumeroHabitacion);
		
		textNumeroHabitacion = new JTextField();
		textNumeroHabitacion.setFont(new Font("Arial", Font.PLAIN, 14));
		textNumeroHabitacion.setColumns(10);
		textNumeroHabitacion.setBounds(691, 404, 238, 20);
		contentPane.add(textNumeroHabitacion);
		
		JLabel lblHabitacionesDisponibles = new JLabel("Habitaciones Disponibles :");
		lblHabitacionesDisponibles.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHabitacionesDisponibles.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHabitacionesDisponibles.setBounds(177, 474, 188, 25);
		contentPane.add(lblHabitacionesDisponibles);
		
		textHabitacionesDisponibles = new JTextField();
		textHabitacionesDisponibles.setFont(new Font("Arial", Font.PLAIN, 14));
		textHabitacionesDisponibles.setEditable(false);
		textHabitacionesDisponibles.setColumns(10);
		textHabitacionesDisponibles.setBounds(375, 476, 238, 20);
		contentPane.add(textHabitacionesDisponibles);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Habitacion.CrearHabitacion();
				
			            	textHabitacionesDisponibles.setText(Integer.toString(Habitacion.HabitacionesDisponibles[1].length));
			}		
		});
		btnConsultar.setBounds(236, 510, 89, 23);
		contentPane.add(btnConsultar);

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
				
				int NumDias = 0;
				
				int DiaR = 0;
				
				int MesR = 0;
				
				int AñoR = 0;
				
				int boton = 0;
				
				int NumHabitacion = 0;
				
				
				
				/*String DiaRNum;
				String MesRNum;
				String AñoRNum;*/
				
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
					boton = 1;
				    
				if (rdbtnHabitacionDoble.isSelected() == true)
					boton = 2;
					
				if (rdbtnHabitacionMatrimonial.isSelected() == true)
					boton = 3;
					
					switch(boton) {
					
						case 1 :
							textPrecioDia.setText(Integer.toString(HabitacionSimple.getPrecio()));
						    PrecioDiasSeleccionado = HabitacionSimple.getPrecio()*NumDias;
						    textPrecioDiasSeleccionados.setText("" + PrecioDiasSeleccionado);
						    if(NumHabitacion <= 5)
						    	NumHabitacion = NumHabitacion + 1;
						    	textNumeroHabitacion.setText("" + NumHabitacion);						    
						break;
						case 2 :
							textPrecioDia.setText(Integer.toString(HabitacionDoble.Precio));
							PrecioDiasSeleccionado = HabitacionDoble.Precio*NumDias;
							textPrecioDiasSeleccionados.setText("" + PrecioDiasSeleccionado);
							if(NumHabitacion <= 10)
						    	NumHabitacion = NumHabitacion + 1;
						    	textNumeroHabitacion.setText("" + NumHabitacion);
						break;
						case 3 :
							textPrecioDia.setText(Integer.toString(HabitacionMatrimonial.Precio));
							PrecioDiasSeleccionado = HabitacionMatrimonial.Precio*NumDias;
							textPrecioDiasSeleccionados.setText("" + PrecioDiasSeleccionado);
							if(NumHabitacion <= 15)
						    	NumHabitacion = NumHabitacion + 1;
						    	textNumeroHabitacion.setText("" + NumHabitacion);
						break;
						
					}
					
					
					if (cbxMesReserva.getSelectedItem().toString() == "Enero")
						MesR = 1;
					if (cbxMesReserva.getSelectedItem().toString() == "Febrero")
						MesR = 2;
					if (cbxMesReserva.getSelectedItem().toString() == "Marzo")
						MesR = 3;
					if (cbxMesReserva.getSelectedItem().toString() == "Abril")
						MesR = 4;
					if (cbxMesReserva.getSelectedItem().toString() == "Mayo")
						MesR = 5;
					if (cbxMesReserva.getSelectedItem().toString() == "Junio")
						MesR = 6;
					if (cbxMesReserva.getSelectedItem().toString() == "Julio")
						MesR = 7;
					if (cbxMesReserva.getSelectedItem().toString() == "Agosto")
						MesR = 8;
					if (cbxMesReserva.getSelectedItem().toString() == "Septiembre")
						MesR = 9;
					if (cbxMesReserva.getSelectedItem().toString() == "Octubre")
						MesR = 10;
					if (cbxMesReserva.getSelectedItem().toString() == "Noviembre")
						MesR = 11;
					if (cbxMesReserva.getSelectedItem().toString() == "Diciembre")
						MesR = 12;
					
					if (cbxDiaReserva.getSelectedItem().toString() == "1")
						DiaR = 1;
					if (cbxDiaReserva.getSelectedItem().toString() == "2")
						DiaR = 2;
					if (cbxDiaReserva.getSelectedItem().toString() == "3")
						DiaR = 3;
					if (cbxDiaReserva.getSelectedItem().toString() == "4")
						DiaR = 4;
					if (cbxDiaReserva.getSelectedItem().toString() == "5")
						DiaR = 5;
					if (cbxDiaReserva.getSelectedItem().toString() == "6")
						DiaR = 6;
					if (cbxDiaReserva.getSelectedItem().toString() == "7")
						DiaR = 7;
					if (cbxDiaReserva.getSelectedItem().toString() == "8")
						DiaR = 8;
					if (cbxDiaReserva.getSelectedItem().toString() == "9")
						DiaR = 9;
					if (cbxDiaReserva.getSelectedItem().toString() == "10")
						DiaR = 10;
					if (cbxDiaReserva.getSelectedItem().toString() == "11")
						DiaR = 11;
					if (cbxDiaReserva.getSelectedItem().toString() == "12")
						DiaR = 12;
					if (cbxDiaReserva.getSelectedItem().toString() == "13")
						DiaR = 13;
					if (cbxDiaReserva.getSelectedItem().toString() == "14")
						DiaR = 14;
					if (cbxDiaReserva.getSelectedItem().toString() == "15")
						DiaR = 15;
					if (cbxDiaReserva.getSelectedItem().toString() == "16")
						DiaR = 16;
					if (cbxDiaReserva.getSelectedItem().toString() == "17")
						DiaR = 17;
					if (cbxDiaReserva.getSelectedItem().toString() == "18")
						DiaR = 18;
					if (cbxDiaReserva.getSelectedItem().toString() == "19")
						DiaR = 19;
					if (cbxDiaReserva.getSelectedItem().toString() == "20")
						DiaR = 20;
					if (cbxDiaReserva.getSelectedItem().toString() == "21")
						DiaR = 21;
					if (cbxDiaReserva.getSelectedItem().toString() == "22")
						DiaR = 22;
					if (cbxDiaReserva.getSelectedItem().toString() == "23")
						DiaR = 23;
					if (cbxDiaReserva.getSelectedItem().toString() == "24")
						DiaR = 24;
					if (cbxDiaReserva.getSelectedItem().toString() == "25")
						DiaR = 25;
					if (cbxDiaReserva.getSelectedItem().toString() == "26")
						DiaR = 26;
					if (cbxDiaReserva.getSelectedItem().toString() == "27")
						DiaR = 27;
					if (cbxDiaReserva.getSelectedItem().toString() == "28")
						DiaR = 28;
					if (cbxDiaReserva.getSelectedItem().toString() == "29")
						DiaR = 29;
					if (cbxDiaReserva.getSelectedItem().toString() == "30")
						DiaR = 30;
					if (cbxDiaReserva.getSelectedItem().toString() == "31")
						DiaR = 31;
					
					if (cbxAñoReserva.getSelectedItem().toString() == "2022")
						AñoR = 2022;
					if (cbxAñoReserva.getSelectedItem().toString() == "2023")
						AñoR = 2023;
					if (cbxAñoReserva.getSelectedItem().toString() == "2024")
						AñoR = 2024;
					if (cbxAñoReserva.getSelectedItem().toString() == "2025")
						AñoR = 2025;
					if (cbxAñoReserva.getSelectedItem().toString() == "2026")
						AñoR = 2026;
					
					textFechaReserva.setText(DiaR + "/" + MesR + "/" + AñoR);
					
					/*if(MesR == 12)
						if (DiaR + NumDias > 32)
							DiaR = NumDias - 1;
							MesR = MesR - 11;
							AñoR = AñoR + 1;
							DiaRNum = Integer.toString(DiaR);
							MesRNum = Integer.toString(MesR);
							AñoRNum = Integer.toString(AñoR);
							
						textFechaFinalReserva.setText(DiaRNum + "/" + MesRNum + "/" + AñoRNum);
					if (MesR == 2)
						if(DiaR + NumDias > 30)
							DiaR = NumDias - 1;
							MesR = MesR + 1;
							DiaRNum = Integer.toString(DiaR);
							MesRNum = Integer.toString(MesR);
							AñoRNum = Integer.toString(AñoR);
								
							textFechaFinalReserva.setText(DiaRNum + "/" + MesRNum + "/" + AñoRNum);
					if (MesR == 4 || MesR == 6 || MesR == 9 || MesR == 11)
						if(DiaR + NumDias > 31)
							DiaR = NumDias - 1;
							MesR = MesR + 1;
							DiaRNum = Integer.toString(DiaR);
							MesRNum = Integer.toString(MesR);
							AñoRNum = Integer.toString(AñoR);
								
							textFechaFinalReserva.setText(DiaRNum + "/" + MesRNum + "/" + AñoRNum);
					if (MesR == 1 || MesR == 3 || MesR == 5 || MesR == 7 || MesR == 8 || MesR == 10)
						if (DiaR + NumDias > 32)
							DiaR = NumDias - 1;
							MesR = MesR + 1;
							DiaRNum = Integer.toString(DiaR);
							MesRNum = Integer.toString(MesR);
							AñoRNum = Integer.toString(AñoR);
								
							textFechaFinalReserva.setText(DiaRNum + "/" + MesRNum + "/" + AñoRNum);*/
							
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
					
					
					
				    
				
			}
		});
		btnCalcular.setBounds(59, 474, 108, 95);
		contentPane.add(btnCalcular);

		// RADIOBUTTON

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Inicio Inicio = new Inicio();
				
				
				

				for (int i = 0; i <= 4; i++) {
					if (Inicio.datosHotel[i][0] == null) {
						Inicio.datosHotel[i][0] = textCedula.getText();
						Inicio.datosHotel[i][1] = textNombre.getText();
						Inicio.datosHotel[i][2] = textEmail.getText();
						Inicio.datosHotel[i][3] = textFechaNacimiento.getText();
						Inicio.datosHotel[i][4] = textFechaReserva.getText();
						Inicio.datosHotel[i][5] = textDiasSeleccionados.getText();
						Inicio.datosHotel[i][6] = textNumeroHabitacion.getText();
						Inicio.datosHotel[i][7] = textPrecioDia.getText();
						
					}
				}
				JOptionPane.showMessageDialog(null, "Reserva Guardada " + Inicio.datosHotel[0][0] + " " + Inicio.datosHotel[0][1] + " "
						+ Inicio.datosHotel[0][2] + " " +  Inicio.datosHotel[0][3] + " " + Inicio.datosHotel[0][4] + " " + Inicio.datosHotel[0][5]
						+ " " + Inicio.datosHotel[0][6] + " " + Inicio.datosHotel[0][7]);
				
				for (int i = 1; i<15; i++) {
					for (int j = 0; j<=4; j++) {
						if (Habitacion.HabitacionesDisponibles[1][i] == Inicio.datosHotel[j][6]) {
							
							Habitacion.HabitacionesDisponibles[1][i].
						}
					}
				}
			}
		});
		btnGuardar.setBounds(570, 440, 89, 23);
		contentPane.add(btnGuardar);
		
	}
}
