package com.sandra.poo.ejercicios.clases;

public class Triangulo {
	private double base;
	private double lado;
	
	public Triangulo(double base, double lado) {
		this.base = base;
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return base + lado*2;
	}
	
	public double getArea() {
		return base*Math.sqrt(Math.pow(lado, 2)-Math.pow(base/2, 2))/2;
	}
}
