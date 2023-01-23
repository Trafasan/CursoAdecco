package Ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio03C {
//Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char Caracter;
		
		Caracter=JOptionPane.showInputDialog("Inserte un caracter:").charAt(0);
		
		if(Character.isUpperCase(Caracter)) {
			JOptionPane.showMessageDialog(null, Caracter+" es una letra mayúscula");
		}
		else {
			JOptionPane.showMessageDialog(null, Caracter+" no es una letra mayúscula");
		}

	}

}
