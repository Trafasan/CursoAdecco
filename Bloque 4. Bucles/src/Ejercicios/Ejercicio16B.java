/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio16B {
//Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número,producto;
		System.out.print("Inserte un número entre 0 y 10: ");
		número=Entrada.nextInt();
		
		if (número>=0 && número<=10){
			for(int x=0;x<=10;x++) {
				producto=número*x;
				System.out.println(x+" x "+número+" = "+producto);
			}
		}
		else {
			System.out.println("ERROR\nEL número insertado no es válido.");
		}
		
		Entrada.close();

	}

}
