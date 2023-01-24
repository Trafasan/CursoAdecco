package ejercicio7;

import java.util.Scanner;

public class Main {
	public static int buscarNumeroCuenta (Cuenta cuentas[], int n) {
		int x=0, indice=0;
		boolean encontrado = false;
		
		while((x<cuentas.length) && (encontrado == false)) {
			if(cuentas[x].getNumeroCuenta() == n) {
				encontrado =true;
				indice = x;
			}
			x++;
		}
		if(encontrado == false) {indice = -1;}
		return indice;
	}
	

	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		String nombre, apellido, dni;
		int numeroCuenta, nCuentas, opcion, indiceCuenta;
		double saldo, cantidad;
		Cuenta cuentas[];
		Cliente cliente;
		
		System.out.print("Inserte el nombre del cliente: ");
		nombre = Entrada.next();
		System.out.print("Inserte el apellido del cliente: ");
		apellido = Entrada.next();
		System.out.print("Inserte el DNI del cliente: ");
		dni = Entrada.next();
		System.out.print("Inserte el número de cuentas que posee: ");
		nCuentas = Entrada.nextInt();
		
		cuentas = new Cuenta[nCuentas];
		
		for(int x=0; x<cuentas.length; x++) {
			System.out.println("\nDatos de la cuenta "+(x+1));
			System.out.print("Inserte el número de cuenta: ");
			numeroCuenta = Entrada.nextInt();
			System.out.print("Inserte el saldo de la cuenta: ");
			saldo = Entrada.nextDouble();
			
			cuentas[x] = new Cuenta (numeroCuenta, saldo);
		}
		
		cliente = new Cliente (nombre, apellido, dni, cuentas);
		
		do {
			System.out.println("\n\t...:MENÚ:..."
					+ "\n1. Ingresar dinero en la cuenta"
					+ "\n2. Retirar dinero de la cuenta"
					+ "\n3. Consultar saldo de la cuenta"
					+ "\n4. Salir");
			System.out.print("Inserte la opción del menú: ");
			opcion = Entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.print("\nInserte el número de cuenta: ");
				numeroCuenta = Entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
				if(indiceCuenta == -1) {System.out.print("\nEl número de cuenta ingresado no existe.");}
				else {
					System.out.print("\nInserte la cantidad de dinero a ingresar: ");
					cantidad = Entrada.nextDouble();
					
					cliente.ingresar_dinero(indiceCuenta, cantidad);
					System.out.println("\nIngreso realizado correctamente");
					System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
				}
				break;
			case 2:
				System.out.print("\nInserte el número de cuenta: ");
				numeroCuenta = Entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
				if(indiceCuenta == -1) {System.out.print("\nEl número de cuenta ingresado no existe.");}
				else {
					System.out.print("\nInserte la cantidad de dinero a retirar: ");
					cantidad = Entrada.nextDouble();
					
					if(cantidad > cliente.consultar_saldo(indiceCuenta)) {
						System.out.print("\nNo se pudo completar la operación."
								+ "\nLa cantidad ingresada es mayor al saldo de la cuenta.");
					}
					else {
						cliente.retirar_dinero(indiceCuenta, cantidad);
						System.out.println("\nRetiro realizado correctamente");
						System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
					}
				}
				break;
			case 3:
				System.out.print("\nInserte el número de cuenta: ");
				numeroCuenta = Entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
				if(indiceCuenta == -1) {System.out.print("\nEl número de cuenta ingresado no existe.");}
				else {
					System.out.println("Saldo de la cuenta: "+cliente.consultar_saldo(indiceCuenta));
				}
				break;
			case 4: System.out.println("Hasta pronto :)"); break;
			default: System.out.println("ERROR\nLa opción insertada no existe");
			}
			System.out.println("");
		}while(opcion != 4);
		
		Entrada.close();
	}

}
