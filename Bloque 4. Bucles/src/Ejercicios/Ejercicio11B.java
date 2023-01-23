/**
 * 
 */
package Ejercicios;

/**
 * @author Sandra
 *
 */
public class Ejercicio11B {
//Diseñar un programa que muestre el producto de los 10 primeros números impares.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long mult=1;
		
		for (int x=1;x<=20;x+=2) {
			mult*=x;
		}
		System.out.println("El producto de los primeros 10 números impares es "+mult+'.');
	}

}
