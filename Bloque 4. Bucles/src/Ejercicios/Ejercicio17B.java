/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio17B {
/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
 * Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas se emitieron de más de $600.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int código, Lvendidos, contador=0,artículo=0;
		float precio,facturación, total=0;
		for (int x=1;x<=5;x++) {
			System.out.print("\nInserte el código del artículo ("+x+"/5): ");
			código=Entrada.nextInt();
			System.out.print("Inserte los litros vendidos ("+x+"/5): ");
			Lvendidos=Entrada.nextInt();
			System.out.print("Inserte el precio por litro ("+x+"/5): ");
			precio=Entrada.nextInt();
			facturación=Lvendidos*precio; total+=facturación;
			if (facturación>600) {contador++;}
			if (código==1) {artículo+=Lvendidos;}
		}
		System.out.println("\nFacturación total: $"+total+"\nCantidad vendida del artículo 1: "+artículo+" L");
		System.out.println("Hay "+contador+" factura(s) de más de $600.");
		
		Entrada.close();

	}

}
