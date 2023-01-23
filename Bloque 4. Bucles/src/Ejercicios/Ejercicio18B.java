/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio18B {
/*
 * Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.
 * Solo existen tres productos con precios:
 * 1-0.6 $/litro
 * 2-3 $/litro
 * 3-1,25 $/litro
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int código, Lvendidos, contador=0,artículo=0;
		float precio=0,facturación, total=0;
		for (int x=1;x<=5;x++) {
			do {
				System.out.print("\nInserte el código del artículo ("+x+"/5): ");
				código=Entrada.nextInt();
			} while (código<1 || código>3);
			
			switch(código) {
			case 1: precio=0.6f; break;
			case 2: precio=3; break;
			case 3: precio=1.25f; break;
			}
			System.out.print("Inserte los litros vendidos ("+x+"/5): ");
			Lvendidos=Entrada.nextInt();
			facturación=Lvendidos*precio; total+=facturación; 
			if (código==1) {artículo+=Lvendidos;}
			if (facturación>600) {contador++;}
		}
		System.out.println("\nFacturación total: $"+total+"\nCantidad vendida del artículo 1: "+artículo+" L");
		System.out.println("Hay "+contador+" factura(s) de más de $600.");
		
		Entrada.close();

	}

}
