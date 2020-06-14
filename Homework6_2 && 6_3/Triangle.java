package Homework6_2;

public class Triangle implements ShapeX{
	private double a, b, c;
	public Triangle() {}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double get_Area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
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
		return a + b + c;
	}
}
