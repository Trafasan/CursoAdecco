package Ejercicios;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio8O {
//Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado de coeficientes reales.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		double a,b,c,x1,x2;
		System.out.print("Inserte el valor a: ");
		a=Entrada.nextDouble();
		System.out.print("Inserte el valor b: ");
		b=Entrada.nextDouble();
		System.out.print("Inserte el valor c: ");
		c=Entrada.nextDouble();
		
		x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("El resultado positivo es: "+x1);
		System.out.println("El resultado negativo es: "+x2);
		
		Entrada.close();

	}

}
