/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios01_05 {
	public static void ejercicio01() {
		// Hacer un programa que calcule e imprima la suma de tres calificaciones.
		Scanner sc=new Scanner(System.in);
		float notaA,notaB,notaC,suma;
		System.out.print("Inserte sus tres calificaciones: ");
		notaA=sc.nextFloat();
		notaB=sc.nextFloat();
		notaC=sc.nextFloat();
		suma=notaA+notaB+notaC;
		System.out.println("\nLa suma de sus tres calificaciones es: "+suma);
		//La expresión\n es para dar un salto de línea.
		sc.close();
	}
	
	public static void ejercicio02() {
		// Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por hora.
		Scanner sc=new Scanner(System.in);
		int HH;
		float sHoras,sSemanal;
		System.out.print("Inserte las horas trabajadas en esta semana: ");
		HH=sc.nextInt();
		System.out.print("Inserte el salario por hora: ");
		sHoras=sc.nextFloat();
		sc.nextLine();
		sSemanal=HH*sHoras;
		System.out.println("\nSu salario semanal es: "+sSemanal+'€');
		sc.close();
	}
	
	public static void ejercicio03() {
		/*
		 * Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
		 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
		 */
		Scanner sc=new Scanner(System.in);
		float N,dLuis,dJuan,dTotal;
		System.out.print("Inserte los dólares que tiene Guillermo: ");
		N=sc.nextFloat();
		sc.nextLine();
		dLuis=N/2;
		dJuan=(N+dLuis)/2;
		dTotal=N+dLuis+dJuan;
		System.out.println("Luis tiene: "+dLuis+'$');
		System.out.println("Juan tiene: "+dJuan+'$');
		System.out.println("Entre los tres tienen: "+dTotal+'$');
		sc.close();
	}
	
	public static void ejercicio04() {
		/*
		 * Una compañía de venta de coches usados, paga a su personal de ventas un salario de $1000 mensuales,
		 * más una comisión de $150 por cada coche vendido, más el 5% del valor de la venta por coche.
		 * Cada mes el capturista de la empresa ingresa en el ordenador los datos pertinentes.
		 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
		 */
		Scanner sc=new Scanner(System.in);
		final int salario=1000;
		int nCoches;
		float valorC, sMes;
		System.out.print("Inserte el número de coches vendidos: ");
		nCoches=sc.nextInt();
		System.out.print("Inserte el valor de venta del coche: ");
		valorC=sc.nextFloat();
		sMes=salario+150*nCoches+valorC*nCoches*0.05f;
		System.out.println("El salario del empleado es de: "+sMes+'$');
		sc.close();
	}
	
	public static void ejercicio05() {
		/*
		 * La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico:
		 * participación, primer examen parcial, segundo examen parcial y examen final.
		 * Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%...
		 * Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
		 */
		Scanner sc=new Scanner(System.in);
		float participacion,p1,p2,examen,nota;
		System.out.print("Inserte la nota de participación: ");
		participacion=sc.nextFloat();
		System.out.print("Inserte la nota del primer parcial: ");
		p1=sc.nextFloat();
		System.out.print("Inserte la nota del segundo parcial: ");
		p2=sc.nextFloat();
		System.out.print("Inserte la nota del examen final: ");
		examen=sc.nextFloat();
		sc.nextLine();
		participacion*=0.1f;
		p1*=0.25f;
		p2*=0.25f;
		examen*=0.4f;
		nota=participacion+p1+p2+examen;
		//Funciona igual que nota=participacion*0.1f+p1*0.25f+p2*0.25f+examen*0.4f
		System.out.println("\nLa calificación obtenida del estudiante es: "+nota);
		int nFinal=Math.round(nota);
		System.out.println("Redondeo: "+nFinal);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio01();
		// ejercicio02();
		// ejercicio03();
		// ejercicio04();
		// ejercicio05();

	}

}
