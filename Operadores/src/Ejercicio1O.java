import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio1O {
//Hacer un programa que calcule e imprima la suma de tres calificaciones.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		
		float NotaA,NotaB,NotaC,Suma;
		
		System.out.print("Inserte sus tres calificaciones: ");
		NotaA=Entrada.nextFloat();
		NotaB=Entrada.nextFloat();
		NotaC=Entrada.nextFloat();
		
		Suma=NotaA+NotaB+NotaC;
		
		System.out.println("\nLa suma de sus tres calificaciones es:"+Suma);
		//La expresión\n es para dar un salto de línea.

	}

}
