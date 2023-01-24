package ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio13C {
/*
 * Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
 * 1. Ingresar dinero a la cuenta
 * 2. Retirar dinero de la cuenta
 * 3. Salir
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int op, dinero, saldoF;
		final int saldoI=1000; 
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido :)\nSu saldo actual es de "+saldoI+" $.\n"
				+ "Inserte la operación deseada:\n1. Ingresar dinero a la cuenta\n2. Sacar dinero de la cuenta\n3. Salir"));
		
		switch (op) {
		case 1 -> {
			dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el dinero que desea ingresar:"));
			if (dinero>0) {
				saldoF=saldoI+dinero;
				JOptionPane.showMessageDialog(null, "Su saldo actual es de "+saldoF+" $");
			}
			else JOptionPane.showMessageDialog(null, "ERROR\nNo se pudo completar la operación");
		}
		case 2 -> dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el dinero que desea sacar:"));
			if (dinero>0 && dinero<=saldoI) {
			saldoF=saldoI-dinero;
			JOptionPane.showMessageDialog(null, "Su saldo actual es de "+saldoF+" $");
			}
			else {
			JOptionPane.showMessageDialog(null, "ERROR\nNo se pudo completar la operación");
			}
			break;
		case 3: JOptionPane.showMessageDialog(null, "Hasta pronto :)");
			break;
		default -> JOptionPane.showMessageDialog(null, "ERROR\nNo se reconoció la operación");
		}

	}

}
