package Ej2;

public class Movimiento {
	private int arriba;
	private int derecha;
	
	public void getArriba() {this.arriba++;}
	
	public void getAbajo() {this.arriba--;}
	
	public void getIzquierda() {this.derecha--;}
	
	public void getDerecha() {this.derecha++;}
	
	public Movimiento(int derecha, int arriba) {
		this.arriba = arriba;
		this.derecha = derecha;		
	}
	
	public String mover() {
		return "Las coordenadas son ("+derecha+", "+arriba+").";
	}
	
	
	

	
	
	
	
}
