/**
 * 
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Condicionales {
	public static void ifElse() {
		int n, dato=5;
		n=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));
		if(n<=dato) JOptionPane.showMessageDialog(null, "El número es menor o igual a 5");
		else JOptionPane.showMessageDialog(null, "El número es mayor que 5");
		/*
		 * = es el operador de asignación, mientras que == es el operador de igualdad
		 * != es el operador de desigualdad
		 * > es el operador de mayor que, mientras que < es el operador de menor que
		 * >= es el operador de mayor o igual a, mientras que <= es el operador de menor o igual a
		 */
	}
	public static void operadorTernario() {
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));
		JOptionPane.showMessageDialog(null,(n%2==0) ? "Es par" : "Es impar");
	}
	public static void condicionalSwitch() {
		int dato;
		dato=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número entre 1 y 5: "));
		switch(dato) {
		case 1:JOptionPane.showMessageDialog(null, "Es el número 1");
		break;  // Este comando es esencial para no seguir con la serie.
		case 2:JOptionPane.showMessageDialog(null, "Es el número 2");
		break;
		case 3:JOptionPane.showMessageDialog(null, "Es el número 3");
		break;
		case 4:JOptionPane.showMessageDialog(null, "Es el número 4");
		break;
		case 5:JOptionPane.showMessageDialog(null, "Es el número 5");
		break;
		default:JOptionPane.showMessageDialog(null, "El número no está en el rango indicado");
		}
	}
	public static void condicionalSwitchFlecha() {
		int dato;
		dato=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número entre 1 y 5: "));
		switch(dato) {
		case 1 -> JOptionPane.showMessageDialog(null, "Es el número 1");
		// En este caso no hace falta el comando break.
		case 2 -> JOptionPane.showMessageDialog(null, "Es el número 2");
		case 3 -> JOptionPane.showMessageDialog(null, "Es el número 3");
		case 4 -> JOptionPane.showMessageDialog(null, "Es el número 4");
		case 5 -> JOptionPane.showMessageDialog(null, "Es el número 5");
		default -> JOptionPane.showMessageDialog(null, "El número no está en el rango indicado");
		}
	}
	
	public static void main(String[] args) {
		// ifElse();
		// operadorTernario();
		// condicionalSwitch();
		// condicionalSwitchFlecha();
	}

}
