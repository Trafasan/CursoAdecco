package com.sandra.poo.ejercicios.clases;

public class Atleta {
	private int dorsal;
	private String nombre;
	private float tiempo;
	
	public Atleta(int dorsal, String nombre, float tiempo) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return String.format("Atleta nº%d (%s). Tiempo: %.3fs", dorsal, nombre, tiempo);
	}
}