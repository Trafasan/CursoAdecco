import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio5O {
/*
 * La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico:
 * participación, primer examen parcial, segundo examen parcial y examen final.
 * Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%...
 * Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		float Participación,Parcial1,Parcial2,Examen,Final;
		
		System.out.print("Inserte la nota de participación: ");
		Participación=Entrada.nextFloat();
		System.out.print("Inserte la nota del primer parcial: ");
		Parcial1=Entrada.nextFloat();
		System.out.print("Inserte la nota del segundo parcial: ");
		Parcial2=Entrada.nextFloat();
		System.out.print("Inserte la nota del examen final: ");
		Examen=Entrada.nextFloat();
		
		Participación*=0.1f;
		Parcial1*=0.25f;
		Parcial2*=0.25f;
		Examen*=0.4f;
		Final=Participación+Parcial1+Parcial2+Examen;
		//Funciona igual que Final=Participación*0.1f+Parcial1*0.25f+Parcial2*0.25f+Examen*0.4f
		
		System.out.println("\nLa calificación obtenida del estudiante es: "+Final);
		
		int Calificación=Math.round(Final);
		System.out.println("Redondeo: "+Calificación);

	}

}
