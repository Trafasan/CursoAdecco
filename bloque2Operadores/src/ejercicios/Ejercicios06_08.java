/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios06_08 {
	public static void ejercicio06() {
		// Hacer un programa que calcule el cuadrado de una suma.
		Scanner sc=new Scanner(System.in);
		double a,b,r1,r2;
		System.out.print("Inserte dos números: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		sc.nextLine();
		r1=Math.pow(a+b,2);
		r2=Math.pow(a,2)+Math.pow(b,2)+2*a*b;
		System.out.println("El cuadrado de la suma de "+a+" y "+b+ " es: "+r1+" (método 1)");//El método 1 es (a+b)^2
		System.out.println("El cuadrado de la suma de "+a+" y "+b+ " es: "+r2+" (método 2)");//El método 2 es a^2+2ab+b^2
		sc.close();
	}
	
	public static void ejercicio07() {
		/*
		 * Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
		 * Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
		 */
		Scanner sc=new Scanner(System.in);
		int hT,hF,dT, dF,sF;
		System.out.print("Inserte número de horas: ");
		hT=sc.nextInt();
		sc.nextLine();
		hF=hT%24;
		dT=hT/24;
		dF=dT%7;
		sF=dT/7;
		System.out.println(hT+" horas equivalen a "+sF+" semanas, "+dF+" días y "+hF+" horas.");
		sc.close();
	}
	
	public static void ejercicio08() {
		// Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado de coeficientes reales.
		Scanner sc=new Scanner (System.in);
		double a,b,c,x1,x2;
		System.out.print("Inserte el valor a: ");
		a=sc.nextDouble();
		System.out.print("Inserte el valor b: ");
		b=sc.nextDouble();
		System.out.print("Inserte el valor c: ");
		c=sc.nextDouble();
		sc.nextLine();
		x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("El resultado positivo es: "+x1);
		System.out.println("El resultado negativo es: "+x2);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio06();
		// ejercicio07();
		// ejercicio08();

	}

}
