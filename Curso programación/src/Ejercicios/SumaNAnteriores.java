/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class SumaNAnteriores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		int N, suma=0;
		System.out.print("Inserte un número: ");
		N=Entrada.nextInt();
		for(int x=N; x>0; x--) {
			suma+=x;
			if(x!=1) {System.out.print(x+" + ");}
			else {System.out.print(x+" =");}
			}
		System.out.println(" "+suma);
		Entrada.close();
	}
}