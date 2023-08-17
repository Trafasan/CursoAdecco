package com.sandra.poo.utilidades;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sandra.poo.ejercicios.Ejercicios;
import com.sandra.poo.teoria.Poo;

public class MenuUtils {
	private static String ruta = "src/main/java/com/sandra/poo/images/";
	
	public static void mainMenu() {
		int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "MENÚ PRINCIPAL", 0, 3, null,
				new Object[] {"Teoría", "Ejercicios"}, null);
		switch (opcion) {
			case 0 -> Poo.apartados();
			case 1 -> Ejercicios.ejercicios();
			case -1 -> JOptionPane.showMessageDialog(null, "Gracias por usar este programa", "HASTA PRONTO", 1, new ImageIcon(ruta+"gracias.png"));
	    }
	}
}
