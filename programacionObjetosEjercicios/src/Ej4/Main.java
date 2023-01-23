package Ej4;

import java.util.Scanner;

public class Main {
	public static int atletaMasRapido(Carrera participantes[]) {
		float tiempo;
		int indice = 0;
		
		tiempo = participantes[0].getTiempo();
		for(int i=1; i<participantes.length; i++) {
			if(participantes[i].getTiempo() < tiempo) {
				tiempo = participantes[i].getTiempo();
				indice = i;
			}
		}
		return indice;
	}
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int numero;
		String nombre;
		float tiempo;
		int numeroAtletas, menorTiempo;
		
		System.out.print("Inserte la cantidad de participantes: ");
		numeroAtletas = Entrada.nextInt();
		
		Carrera participantes[] = new Carrera[numeroAtletas];
		
		for(int i=0; i<participantes.length; i++) {
			System.out.println("\nDatos del atleta "+(i+1));
			System.out.print("Introduzca el número: ");
			numero = Entrada.nextInt();
			System.out.print("Introduzca el nombre: ");
			nombre = Entrada.next();
			System.out.print("Introduzca el tiempo de carrera: ");
			tiempo = Entrada.nextFloat();
			
			participantes[i] = new Carrera(numero, nombre, tiempo);
		}
		
		menorTiempo = atletaMasRapido(participantes);
		
		System.out.println("\nAtleta más rápido");
		System.out.println(participantes[menorTiempo].mostrarDatos());
		
		Entrada.close();

	}

}
