/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio15A {
/*
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
 * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int números[]=new int[10], N;
		boolean creciente=true, Npresente=false;
		
		System.out.println("Serie de números");
		do {
			for(int x=0;x<10;x++) {
				System.out.print("Inserte un número ("+(x+1)+"/10): ");
				números[x]=Entrada.nextInt();
			}
			for (int x=0;x<9;x++) {
				if (números[x]<números[x+1]) {creciente=true;}
				else {creciente=false; break;}
			}
			if (creciente==false) {System.out.println("\nERROR\nLa serie de números introducida no está ordenada de forma creciente.\n");}
		} while (creciente==false);
		
		System.out.print("\nInserte el número que busca: ");
		N=Entrada.nextInt();
		
		for (int x=0; x<10; x++) {if (números[x]==N) {System.out.print("Ese número se encuentra en la posición "+x+".");Npresente=true;}}
		if (Npresente==false) {System.out.print("El número introducido no se encuentra en la serie.");}
		
		Entrada.close();

	}

}
