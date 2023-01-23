package Ej1;

public class Cuadrilátero {
	private float base;
	private float altura;
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getArea() {
		float area = base*altura;
		return area;
	}
	
	public float getPerimetro() {
		float perimetro = 2*base+2*altura;
		return perimetro;
	}
}
