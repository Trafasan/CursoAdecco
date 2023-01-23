package Ejercicios;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio7O {
/*
 * Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
 * Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		int HorasT,HorasF,DíasT, DíasF,SemanasF;
		
		System.out.print("Inserte número de horas: ");
		HorasT=Entrada.nextInt();
		
		HorasF=HorasT%24;
		DíasT=HorasT/24;
		DíasF=DíasT%7;
		SemanasF=DíasT/7;
		
		System.out.println(HorasT+" horas equivalen a "+SemanasF+" semanas, "+DíasF+" días y "+HorasF+" horas.");
		
		Entrada.close();
		
	}

}
