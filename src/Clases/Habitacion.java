package Clases;

public class Habitacion {

	public static int numeroHabitacion = 0;

	public static String[][] HabitacionesDisponibles = new String[2][15];

	public String TipoHabitacion;

	public static void CrearHabitacion() {

		for (int j = 0; j < 5; j++) {
			if (HabitacionesDisponibles[0][j] == null) {
				HabitacionesDisponibles[0][j] = "Simple";

			}
		}
		for (int j = 0; j < 5; j++) {
			if (HabitacionesDisponibles[1][j] == null) {
				numeroHabitacion = numeroHabitacion + 1;
				HabitacionesDisponibles[1][j] = Integer.toString(numeroHabitacion);

			}
		}
		for (int j = 5; j < 10; j++) {
			if (HabitacionesDisponibles[0][j] == null) {
				HabitacionesDisponibles[0][j] = "Doble";
			}
		}
		for (int j = 5; j < 10; j++) {
			if (HabitacionesDisponibles[1][j] == null) {
				numeroHabitacion = numeroHabitacion + 1;
				HabitacionesDisponibles[1][j] = Integer.toString(numeroHabitacion);

			}
		}
		for (int j = 10; j < 15; j++) {
			if (HabitacionesDisponibles[0][j] == null) {
				HabitacionesDisponibles[0][j] = "Matrimonial";
			}
		}
		for (int j = 10; j < 15; j++) {
			if (HabitacionesDisponibles[1][j] == null) {
				numeroHabitacion = numeroHabitacion + 1;
				HabitacionesDisponibles[1][j] = Integer.toString(numeroHabitacion);

			}
		}
		 
	}

}
