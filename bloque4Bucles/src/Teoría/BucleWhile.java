/**
 * 
 */
package Teoría;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class BucleWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int x=1, contador;
		System.out.print("Inserte el número final de la serie: ");
		contador=Entrada.nextInt();
		while (x<=contador) { //Este ciclo comprueba antes de ejecutarse que la condición es válida
		System.out.println(x);
		x++;
		}
		
		Entrada.close();

	}

}
