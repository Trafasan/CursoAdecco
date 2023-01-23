package Ejercicios;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio4O {
/*
 * Una compañía de venta de coches usados, paga a su personal de ventas un salario de $1000 mensuales,
 * más una comisión de $150 por cada coche vendido, más el 5% del valor de la venta por coche.
 * Cada mes el capturista de la empresa ingresa en el ordenador los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		final int Salario=1000;
		int NCoches;
		float $Coche, $Mes;
		
		System.out.print("Inserte el número de coches vendidos: ");
		NCoches=Entrada.nextInt();
		
		System.out.print("Inserte el valor de venta del coche: ");
		$Coche=Entrada.nextFloat();
		
		$Mes=Salario+150*NCoches+$Coche*NCoches*0.05f;
		
		System.out.println("El salario del empleado es de: "+$Mes+'$');
		
		Entrada.close();

	}

}
