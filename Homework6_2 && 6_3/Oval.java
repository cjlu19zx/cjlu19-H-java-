package Homework6_2;

public class Oval implements ShapeX{
	private double a, b;
	
	public Oval() {}
	
	public Oval(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double get_Area() {
		return Math.PI * a * b;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double get_perimeter() {
		return 2 * Math.PI * b + 4 * (a - b);
	}
}
