/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio21B {
//Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número; boolean contador=false;
		
		for (int x=1;x<=10;x++) {
			System.out.print("Inserte un número ("+x+"/10): ");
			número=Entrada.nextInt();
			if (número<0) {contador=true;}
		}
		if (contador==true) {
			System.out.println("\nSe ha introducido al menos un número negativo.");
		}
		else {
			System.out.println("\nNo se han introducido números negativos.");
		}
		
		Entrada.close();
		
	}

}
