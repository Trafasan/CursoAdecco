package Ej5;

public class Triángulos {
	private double base;
	private double lado;
	
	public Triángulos(double base, double lado) {
		this.base = base;
		this.lado = lado;
	}
	
	public double getPerimetro() {
		double perimetro = base + lado*2;
		return perimetro;
	}
	
	public double getArea() {
		double h2 = Math.pow(lado, 2);
		double c2 = Math.pow(base/2, 2);
		double altura = Math.sqrt(h2-c2);
		double area = (base*altura)/2;
		return area;
	}
}
