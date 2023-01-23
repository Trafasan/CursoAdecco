package Ej3;

import java.util.Scanner;

public class Main {
	public static int indiceCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		
		precio = coches[0].getPrecio();
		for(int i=1; i<coches.length; i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		String marca, modelo;
		float precio;
		int numeroVehiculos, indiceBarato;
		
		System.out.print("Inserte la cantidad de vehículos: ");
		numeroVehiculos = Entrada.nextInt();
		
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];
		
		for(int i=0; i<coches.length; i++) {
			System.out.println("\nCaracterísticas del coche "+(i+1));
			System.out.print("Introduzca la marca: ");
			marca = Entrada.next();
			System.out.print("Introduzca el modelo: ");
			modelo = Entrada.next();
			System.out.print("Introduzca el precio: ");
			precio = Entrada.nextFloat();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceBarato = indiceCocheMBarato(coches);
		
		System.out.println("\nCoche más barato");
		System.out.println(coches[indiceBarato].mostrarDatos());
		
		Entrada.close();

	}

}
