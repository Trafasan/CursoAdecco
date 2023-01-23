/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio13B {
//Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número,contador=0,sumaP=0,sumaN=0,cantP=0,cantN=0,ceros=0;
		float mediaP,mediaN;
		
		while (contador<10) {
			System.out.print("Inserte un número ("+(contador+1)+"/10): ");
			número=Entrada.nextInt();
			if (número>0) {contador++;sumaP+=número;cantP++;}
			else if (número<0) {contador++;sumaN+=número;cantN++;}
			else {contador++;ceros++;}
		}
		mediaP= (float) sumaP/cantP; mediaN= (float) sumaN/cantN;
		if (cantP==0) {
			System.out.println("No se insertaron números positivos."
					+ "\nLa media de los números negativos es: "+mediaN
					+ "\nLa cantidad de ceros es: "+ceros);
		}
		else if (cantN==0) {
			System.out.println("La media de los números positivos es: "+mediaP
					+"\nNo se insertaron números negativos."
					+ "\nLa cantidad de ceros es: "+ceros);
		}
		else {
			System.out.println("La media de los números positivos es: "+mediaP
					+"\nLa media de los números negativos es: "+mediaN
					+"\nLa cantidad de ceros es: "+ceros);
		}
		
		Entrada.close();

	}

}
