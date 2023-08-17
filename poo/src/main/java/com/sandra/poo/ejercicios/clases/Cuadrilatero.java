package com.sandra.poo.ejercicios.clases;

public class Cuadrilatero {
	private float base;
	private float altura;
	
	public Cuadrilatero(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public Cuadrilatero(float lado1) {
		this.base = this.altura = lado1;
	}
	
	public float getPerimetro() {
		return 2*base+2*altura;
	}
	
	public float getArea() {
		return base*altura;
	}
	
	
}
