package Homework6_2;

public class ShapeXTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4.0, 5.0);
		Oval ova = new Oval(5.0, 5.0);
		Triangle tri = new Triangle(3.0, 4.0, 5.0);
		
		System.out.println("三角形的三边长: " + tri.getA() + ", " + tri.getB() + ", " + tri.getC());
		System.out.println("三角形的周长:" + tri.get_perimeter() + ", 三角形的面积：" + tri.get_Area());
		
		System.out.println("椭圆的半长轴: " + ova.getA() + " ," + ova.getB());
		System.out.println("椭圆的周长:" + ova.get_perimeter() + ", 椭圆的面积：" + ova.get_Area());
		
		System.out.println("矩形的边长: " + rec.getA() + ", " + rec.getB());
		System.out.println("矩形的周长:" + rec.get_perimeter() + ", 矩形的面积：" + rec.get_Area());
	
		Rectangle original = rec.clone();
		System.out.println("Object Cloning:");
		System.out.println("矩形的边长: " + original.getA() + ", " + original.getB());
		System.out.println("矩形的周长:" + original.get_perimeter() + ", 矩形的面积：" + original.get_Area());
	}

}
