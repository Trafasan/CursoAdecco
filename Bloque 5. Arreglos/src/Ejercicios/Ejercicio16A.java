/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio16A {
/*
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
 * Cada grupo (o clase) está compuesto por 5 alumnos.
 * Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
 * Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado).
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		float notas1[]= new float [5], notas2[]= new float [5], notas3[]= new float [5];
		int suma1=0, suma2=0, suma3=0;
		
		System.out.println("Notas del primer trimestre");
		for (int x=0; x<5; x++) {
			System.out.print("Inserte la nota del alumno "+(x+1)+": ");
			notas1[x]=Entrada.nextFloat();
		}
		
		System.out.println("\nNotas del segundo trimestre");
		for (int x=0; x<5; x++) {
			System.out.print("Inserte la nota del alumno "+(x+1)+": ");
			notas2[x]=Entrada.nextFloat();
		}
		
		System.out.println("\nNotas del tercer trimestre");
		for (int x=0; x<5; x++) {
			System.out.print("Inserte la nota del alumno "+(x+1)+": ");
			notas3[x]=Entrada.nextFloat();
		}
		
		System.out.println("\nNota media de cada trimestre");
		for (int x=0; x<5; x++) {suma1+=notas1[x];}
		float media1=suma1/5f; System.out.println("Primer trimestre: "+media1);
		for (int x=0; x<5; x++) {suma2+=notas2[x];}
		float media2=suma2/5f; System.out.println("Segundo trimestre: "+media2);
		for (int x=0; x<5; x++) {suma3+=notas3[x];}
		float media3=suma3/5f; System.out.println("Tercer trimestre: "+media3);
		
		int Nalumno;
		System.out.print("\nInserte el número del alumno del cual se va a calcular su media: ");
		Nalumno=Entrada.nextInt(); Nalumno=Nalumno-1;
		
		float MediaN=(notas1[Nalumno]+notas2[Nalumno]+notas3[Nalumno])/3;
		System.out.println("La media del alumno "+(Nalumno+1)+" es: "+MediaN);
		
		Entrada.close();

	}

}
