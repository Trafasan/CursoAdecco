/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios16_20 {
	public static void ejercicio16() {
		// Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte un número entre 0 y 10: ");
		int n = sc.nextInt();
		if (n>=0 && n<=10){
			for(int x=0;x<=10;x++) {
				int producto = n*x;
				System.out.println(x+" x "+n+" = "+producto);
			}
		}
		else System.out.println("ERROR\nEL número insertado no es válido.");
		sc.close();
	}
	
	public static void ejercicio17() {
		/*
		 * Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
		 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
		 * Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas se emitieron de más de $600.
		 */
		Scanner sc=new Scanner (System.in);
		int contador=0,artículo=0;
		float total=0;
		for (int x=1;x<=5;x++) {
			System.out.print("\nInserte el código del artículo ("+x+"/5): ");
			int code = sc.nextInt();
			System.out.print("Inserte los litros vendidos ("+x+"/5): ");
			int Lvendidos=sc.nextInt();
			System.out.print("Inserte el precio por litro ("+x+"/5): ");
			float precio=sc.nextInt();
			float facturación=Lvendidos*precio;
			total+=facturación;
			if (facturación>600) contador++;
			if (code==1) artículo+=Lvendidos;
		}
		System.out.println("\nFacturación total: $"+total+"\nCantidad vendida del artículo 1: "+artículo+" L");
		System.out.println("Hay "+contador+" factura(s) de más de $600.");
		sc.close();
	}
	
	public static void ejercicio18() {
		/*
		 * Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.
		 * Solo existen tres productos con precios:
		 * 1-0.6 $/litro
		 * 2-3 $/litro
		 * 3-1,25 $/litro
		 */
		Scanner sc = new Scanner (System.in);
		int contador=0,artículo=0;
		float precio=0, total=0;
		for (int x=1;x<=5;x++) {
			int code;
			do {
				System.out.print("\nInserte el código del artículo ("+x+"/5): ");
				code = sc.nextInt();
			} while (code<1 || code>3);
			switch(code) {
			case 1: precio=0.6f; break;
			case 2: precio=3; break;
			case 3: precio=1.25f; break;
			}
			System.out.print("Inserte los litros vendidos ("+x+"/5): ");
			int Lvendidos = sc.nextInt();
			float facturación=Lvendidos*precio;
			total+=facturación; 
			if (code==1) artículo+=Lvendidos;
			if (facturación>600) contador++;
		}
		System.out.println("\nFacturación total: $"+total+"\nCantidad vendida del artículo 1: "+artículo+" L");
		System.out.println("Hay "+contador+" factura(s) de más de $600.");
		sc.close();
	}
	
	public static void ejercicio19() {
		// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
		Scanner sc = new Scanner (System.in);
		int aprobados=0, condicionados=0, suspendidos=0;
		float nota;
		for (int x=1; x<=6; x++) {
			do {
				System.out.print("Inserte su nota ("+x+"/6) : ");
				nota = sc.nextFloat();
			} while (nota<0 || nota>10);
			if (nota>=0 && nota<4) suspendidos++;
			else if (nota>=4 && nota<5) condicionados++;
			else aprobados++;
		}
		System.out.println("\nEl número de alumnos suspendidos es: "+suspendidos);
		System.out.println("El número de alumnos condicionados es: "+condicionados);
		System.out.println("El número de alumnos aprobados es: "+aprobados);
		sc.close();
	}
	
	public static void ejercicio20() {
		// Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
		Scanner sc = new Scanner (System.in);
		int max=0;
		System.out.print("Inserte la cantidad de sueldos a introducir: ");
		int n = sc.nextInt();
		for (int x=1;x<=n;x++) {
			System.out.print("Inserte un sueldo ("+x+"/"+n+"): ");
			int sueldo=sc.nextInt();			
			max=Math.max(sueldo, max);
		}
		System.out.println("El sueldo máximo es de $"+max);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio16();
		// ejercicio17();
		// ejercicio18();
		// ejercicio19();
		// ejercicio20();

	}

}
