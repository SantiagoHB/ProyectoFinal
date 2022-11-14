package Clases;

import javax.swing.JOptionPane;

import Formularios.frmMenu;

public class Inicio {
	
	public static String datosHotel[][] = new String [5][8];
	
    public static void main(String[] ar) {
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    }    
}
