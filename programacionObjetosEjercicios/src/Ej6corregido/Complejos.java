package Ej6corregido;

public class Complejos {
	private double a;
	private double b;
	
	public Complejos(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getA() {return a;}
	public double getB() {return b;}

	public Complejos sumar(Complejos c){
		Complejos suma = new Complejos(a+c.getA(),b+c.getB());
		return suma;
	}
	
	public Complejos multComplejos(Complejos c) {
		Complejos mult = new Complejos((a*c.getA()-b*c.getB()),(a*c.getB()+b*c.getA()));
		return mult;
	}
	
	public boolean comparar(Complejos c) {
		boolean igualdad = false;
		if((a == c.getA()) && (b == c.getB())) {igualdad = true;}
		return igualdad;
	}
	
	public Complejos multEntero(int x) {
		Complejos mult = new Complejos(a*x,b*x);
		return mult;
	}
	
	
}
