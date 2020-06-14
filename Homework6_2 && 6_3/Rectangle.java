package Homework6_2;

public class Rectangle implements ShapeX, Cloneable {
	private double a, b;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double get_Area() {
		return (a * b);
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
		return 2 * (a + b);
	}
	
	public Rectangle clone() {
		Rectangle rectangle = null;
		try {
			rectangle = (Rectangle) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return rectangle;
	}
}
