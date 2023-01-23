/**
 * 
 */
package Teoría;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class BucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		int contador;
		
		System.out.print("Inserte el número final de la serie: ");
		contador=Entrada.nextInt();
		
		for (int x=2;x<=contador;x+=2) {
			System.out.println(x);
		}
		
		Entrada.close();

	}

}
