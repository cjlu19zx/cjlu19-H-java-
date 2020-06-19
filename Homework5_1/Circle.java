package Homework5_1;

public class Circle {
	private double radius;
	Circle() {}
	Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	void show() {
		System.out.println("Բ�뾶:" + radius + ", Բ�ܳ�" + getPerimeter() + ", ԰�����" + getArea());
	}
}
