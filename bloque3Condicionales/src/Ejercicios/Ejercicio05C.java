package Ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio05C {
/*
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 * Si trabaja 40 o menos se le paga $16 por hora.
 * Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Horas;
		
		Horas=Integer.parseInt(JOptionPane.showInputDialog("Inserte las horas trabajadas:"));
		
		if (Horas<=40) {
			Horas*=16;
			JOptionPane.showMessageDialog(null, "Su salario es de "+Horas+" $.");
		}
		else {
			Horas=40*16+(Horas-40)*20;
			JOptionPane.showMessageDialog(null, "Su salario es de "+Horas+" $.");
		}

	}

}
