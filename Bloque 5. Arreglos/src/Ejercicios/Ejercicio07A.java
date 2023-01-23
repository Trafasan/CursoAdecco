/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio07A {
	/*
	 * Crear un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
	 * Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int horasT, horas, díasT, días, semanas;
		
		System.out.print("Inserte el número de horas: ");
		horasT=Entrada.nextInt();
		
		horas = horasT%24;
		díasT = horasT/24;
		días = díasT%7;
		semanas = díasT/7;
		
		System.out.print(horasT+" horas son equivalentes a "+semanas+" semanas, "+días+" días y "+horas+" horas.");
		
		Entrada.close();
	}

}
