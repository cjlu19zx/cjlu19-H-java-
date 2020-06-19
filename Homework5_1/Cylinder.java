package Homework5_1;

public class Cylinder extends Circle {
	private double height;
	Cylinder() {}
	Cylinder(double h) {
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return super.getArea() * 2 + super.getPerimeter() * height;
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	public void show() {
		System.out.printf("Բ�������뾶:%f, Բ�����:%f, Բ��������:%f, Բ���������%f\n", super.getRadius(), height, getArea(), getVolume());
	}
	
}
