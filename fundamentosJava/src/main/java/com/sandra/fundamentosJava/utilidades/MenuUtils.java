package com.sandra.fundamentosJava.utilidades;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.ejercicios.EjArrays;
import com.sandra.fundamentosJava.ejercicios.EjBucles;
import com.sandra.fundamentosJava.ejercicios.EjCondicionales;
import com.sandra.fundamentosJava.ejercicios.EjOperadores;
import com.sandra.fundamentosJava.teoria.ArraysTeoria;
import com.sandra.fundamentosJava.teoria.Bucles;
import com.sandra.fundamentosJava.teoria.Condicionales;
import com.sandra.fundamentosJava.teoria.Operadores;
import com.sandra.fundamentosJava.teoria.Variables;

public class MenuUtils {
	private static String ruta = "src/main/java/com/sandra/fundamentosJava/images/";
	private static String opcion;
	private static int selector;
	
	public static void mainMenu() {
	    try {
	    	opcion = JOptionPane.showInputDialog(null, "Seleccione un tema: ", "MENÚ PRINCIPAL", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Variables", "Operadores", "Condicionales", "Bucles", "Arrays", "Extra"}, null).toString();
			switch (opcion) {
			case "Variables" -> Variables.temario();
			case "Extra" -> Extras.apartados();
			default -> subMenu(opcion);
			}
	    	
	    } catch (NullPointerException e){
	    	JOptionPane.showMessageDialog(null, "Gracias por usar este programa", "HASTA PRONTO", 1, new ImageIcon(ruta+"gracias.png"));
	    }
	}
	
	public static void subMenu(String menu) {
		do {
			selector = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "MENÚ "+menu.toUpperCase(), 0, 3, null,
						new Object[] {"Teoría", "Ejercicios"}, null);
			switch (selector) {
			case 0 -> {
				switch (menu) {
				case "Operadores" -> Operadores.temario();
				case "Condicionales" -> Condicionales.temario();
				case "Bucles" -> Bucles.temario();
				case "Arrays" -> ArraysTeoria.temario();
				}
			}
			case 1 -> {
				switch (menu) {
				case "Operadores" -> EjOperadores.ejercicios();
				case "Condicionales" -> EjCondicionales.ejercicios();
				case "Bucles" -> EjBucles.ejercicios();
				case "Arrays" -> EjArrays.ejercicios();
				}
			}
			case -1 -> mainMenu();
			}
		} while(selector != -1);
	}

}
