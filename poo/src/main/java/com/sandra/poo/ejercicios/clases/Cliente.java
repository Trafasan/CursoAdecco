package com.sandra.poo.ejercicios.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dni;
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();

	private static Scanner sc;
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		try {
			String numeros = dni.substring(0, dni.length()-1);
			Integer.parseInt(numeros);
			if (numeros.length()!=8 || !Character.toString(dni.charAt(dni.length()-1)).matches("[A-Z]")) throw new Exception();
			else this.dni = dni;
		}
		catch (Exception e) {
			System.err.println("El formato del DNI no es correcto");
		}
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public boolean addCuenta(Cuenta cuenta) {
		for (Cuenta c: getCuentas()) if (c.equals(cuenta)) return false;
		cuentas.add(cuenta);
		return true;
	}
	
	private double getCantidad() {
		sc = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de dinero a ingresar: ");
		return Double.parseDouble(sc.nextLine());
	}
	
	public void ingresarDinero(int numeroCuenta) {
		List<Cuenta> cuentas = getCuentas();
		if (cuentas.contains(new Cuenta(numeroCuenta))) {
			Cuenta cuenta = cuentas.get(cuentas.indexOf(new Cuenta(numeroCuenta)));
			double cantidad = getCantidad();
			cuenta.setSaldo(cuenta.getSaldo()+cantidad);
			System.out.printf("Ingreso realizado correctamente. Saldo disponible: %.2f€\n", cuenta.getSaldo());
		}
		else System.err.println("La cuenta con el número indicado no existe.");
	}
	
	public void retirarDinero(int numeroCuenta) {
		List<Cuenta> cuentas = getCuentas();
		if (cuentas.contains(new Cuenta(numeroCuenta))) {
			Cuenta cuenta = cuentas.get(cuentas.indexOf(new Cuenta(numeroCuenta)));
			double cantidad = getCantidad();
			if (cuenta.getSaldo()>=cantidad) {
				cuenta.setSaldo(cuenta.getSaldo()-cantidad);
				System.out.printf("Retiro realizado correctamente. Saldo disponible: %.2f€\n", cuenta.getSaldo());
			}
			else System.err.println("No se pudo completar la operación ya que la cantidad a retirar es mayor al saldo de la cuenta.");
		}
		else System.err.println("La cuenta con el número indicado no existe.");
	}
	
	public void consultarSaldo(int numeroCuenta) {
		List<Cuenta> cuentas = getCuentas();
		if (cuentas.contains(new Cuenta(numeroCuenta))) System.out.printf("Saldo disponible en la cuenta %d: %.2f€\n", numeroCuenta,
				cuentas.get(cuentas.indexOf(new Cuenta(numeroCuenta))).getSaldo());
		else System.err.println("La cuenta con el número indicado no existe.");
	}
}
