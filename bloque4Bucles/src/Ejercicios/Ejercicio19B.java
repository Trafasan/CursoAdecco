/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio19B {
//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int aprobados=0, condicionados=0, suspendidos=0;
		float nota;
		
		for (int x=1; x<=6; x++) {
			do {
				System.out.print("Inserte su nota ("+x+"/6) : ");
				nota=Entrada.nextFloat();
			} while (nota<0 || nota>10);
			if (nota>=0 && nota<4) {suspendidos++;}
			else if (nota>=4 && nota<5) {condicionados++;}
			else {aprobados++;}
		}
		
		System.out.println("\nEl número de alumnos suspendidos es: "+suspendidos);
		System.out.println("El número de alumnos condicionados es: "+condicionados);
		System.out.println("El número de alumnos aprobados es: "+aprobados);
		
		Entrada.close();

	}

}
