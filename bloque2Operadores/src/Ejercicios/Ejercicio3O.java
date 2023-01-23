package Ejercicios;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio3O {
/*
 * Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		float N,$Luis,$Juan,$Total;
		System.out.print("Inserte los dólares que tiene Guillermo: ");
		N=Entrada.nextFloat();
		$Luis=N/2;
		$Juan=(N+$Luis)/2;
		$Total=N+$Luis+$Juan;
		System.out.println("Luis tiene: "+$Luis+'$');
		System.out.println("Juan tiene: "+$Juan+'$');
		System.out.println("Entre los tres tienen: "+$Total+'$');
		
		Entrada.close();
		
	}

}
