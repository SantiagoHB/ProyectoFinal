package Clases;

import javax.swing.JOptionPane;

public class HabitacionSimple {
	private int precio;


	public HabitacionSimple() {
	
	}
	
	public HabitacionSimple(int Precio) {
		this.precio=Precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio (int Precio) {
		this.precio = Precio;
	}
	
	public int AlmacenarDato() {
		int PrecioSimp = precio;
		return PrecioSimp;
	}
	
}

