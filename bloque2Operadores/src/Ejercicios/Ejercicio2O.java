package Ejercicios;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio2O {
//Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por hora.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		int Horas;
		float SalarioH,SalarioT;
		
		System.out.print("Inserte las horas trabajadas en esta semana: ");
		Horas=Entrada.nextInt();
		System.out.print("Inserte el salario por hora: ");
		SalarioH=Entrada.nextFloat();
		
		SalarioT=Horas*SalarioH;
		System.out.println("\nSu salario semanal es: "+SalarioT+'€');
		
		Entrada.close();

	}

}
