package ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio06C {
// Hacer un programa que tome dos números y diga si ambos son pares o impares.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte otro número: "));
		if ((n1%2==0) && (n2%2==0)) JOptionPane.showMessageDialog(null, "Ambos números son pares");
		else if ((n1%2!=0) && (n2%2!=0)) JOptionPane.showMessageDialog(null, "Ambos números son impares");
		else JOptionPane.showMessageDialog(null, "Un número es par y el otro es impar");
		

	}

}
