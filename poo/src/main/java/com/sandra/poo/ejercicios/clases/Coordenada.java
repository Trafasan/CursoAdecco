package com.sandra.poo.ejercicios.clases;

public class Coordenada {
	private int x;
	private int y;
	
	public void moverDerecha() {
		this.x++;
	}
	
	public void moverIzquierda() {
		this.x--;
	}
	
	public void moverArriba() {
		this.y++;
	}
	
	public void moverAbajo() {
		this.y--;
	}
	
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;		
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
	
}
