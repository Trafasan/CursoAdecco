package ejercicio3;

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
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserte la cantidad de vehículos: ");
		int numeroVehiculos = sc.nextInt();
		sc.nextLine();
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];
		for(int i=0; i<coches.length; i++) {
			System.out.println("\nCaracterísticas del coche "+(i+1));
			System.out.print("Introduzca la marca: ");
			String marca = sc.nextLine();
			System.out.print("Introduzca el modelo: ");
			String modelo = sc.nextLine();
			System.out.print("Introduzca el precio: ");
			float precio = sc.nextFloat();
			sc.nextLine();
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		int indiceBarato = indiceCocheMBarato(coches);
		System.out.println("\nCoche más barato");
		System.out.println(coches[indiceBarato].mostrarDatos());
		sc.close();

	}

}
