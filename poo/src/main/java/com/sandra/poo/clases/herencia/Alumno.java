package com.sandra.poo.clases.herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Alumno extends Persona{
	private NivelEducativo nivel_educativo;
	private int curso;
	private List<Double> notas = new ArrayList<Double>();
	
	public Alumno() {}

	public Alumno(String nombre, int edad, String dni, NivelEducativo nivel_educativo, int curso) {
		super(nombre, edad, dni);
		this.nivel_educativo = nivel_educativo;
		this.curso = curso;
	}
	
	public String getNivel_educativo() {
		return nivel_educativo!=null ? nivel_educativo.name().replace('_', ' ').toLowerCase() : "No matriculado";
	}

	public void setNivel_educativo(NivelEducativo nivel_educativo) {
		this.nivel_educativo = nivel_educativo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	@Override
	public void presentacion() {
		System.out.printf("Hola, me llamo %s y estoy en %dº de %s.\n", nombre, curso, getNivel_educativo());
	}

	public void addNotas(double... nota) {
		for (double n:nota) {
			if (n<0 || n>10) System.err.printf("La nota %.2f no se añadirá porque no es válida.\n", n);
			else notas.add(n);
		}
	}

	public double getMedia() {
		OptionalDouble media = notas.stream().mapToDouble(e->e).average();
		return media.isPresent() ? media.getAsDouble() : 0;
	}

	@Override
	public String toString() {
		return super.toString()+String.format("""
				· Curso: %s%s
				· Nota media: %.2f
				""", nivel_educativo!=null ? String.format("%dº de ", curso) : "" , getNivel_educativo(), getMedia());
	}
	
}