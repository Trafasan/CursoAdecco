package com.sandra.poo.clases;

import java.util.Objects;

public class Coche {
	// Atributos
	public static int cochesCreados = 0;
	protected String marca;
	protected String modelo;
	protected int km;
	
	// Cada vez que se invoque un costructor, se ejecutará este código
	{
		cochesCreados++;
	}
	
	// Constructor sin parámetros
	public Coche() {
		this.marca="Opel";
		this.modelo="Corsa";
		this.km=0;
	}
	
	// Constructores parametrizado
	public Coche(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
		this.km=0;
	}
	
	public Coche(String marca, String modelo, int km) {
		this.marca=marca;
		this.modelo=modelo;
		this.km=km;
	}
	
	// Constructor de copia
	public Coche(Coche c) {
		this.marca=c.marca;
		this.modelo=c.modelo;
		this.km=c.km;
	}
	
	// Métodos
	// Getters y setters
	public String getMarca() {
		return marca.toUpperCase();
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		if (km<0) System.err.println("El kilometraje no puede ser negativo");
		else this.km = km;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return String.format("%s %s (Kilometraje: %d km)", getMarca(), modelo, km);
	}
}
