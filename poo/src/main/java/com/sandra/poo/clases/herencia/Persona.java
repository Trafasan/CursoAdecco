/**
 * 
 */
package com.sandra.poo.clases.herencia;

import java.util.Objects;

public abstract class Persona {
	protected String nombre;
	protected int edad;
	protected String dni;
	
	public Persona() {
		this.nombre = "Nuevo "+this.getClass().getSimpleName().toLowerCase();
		this.dni = "Sin DNI";
	}
	
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public abstract void presentacion();

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return String.format("""
				%s (%s)
				· Edad: %d
				· DNI: %s
				""", nombre, this.getClass().getSimpleName(), edad, dni);
	}
}