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
		System.out.printf("圆柱体底面半径:%f, 圆柱体高:%f, 圆柱体表面积:%f, 圆主题体积：%f\n", super.getRadius(), height, getArea(), getVolume());
	}
	
}
