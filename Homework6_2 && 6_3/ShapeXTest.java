package Homework6_2;

public class ShapeXTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4.0, 5.0);
		Oval ova = new Oval(5.0, 5.0);
		Triangle tri = new Triangle(3.0, 4.0, 5.0);
		
		System.out.println("�����ε����߳�: " + tri.getA() + ", " + tri.getB() + ", " + tri.getC());
		System.out.println("�����ε��ܳ�:" + tri.get_perimeter() + ", �����ε������" + tri.get_Area());
		
		System.out.println("��Բ�İ볤��: " + ova.getA() + " ," + ova.getB());
		System.out.println("��Բ���ܳ�:" + ova.get_perimeter() + ", ��Բ�������" + ova.get_Area());
		
		System.out.println("���εı߳�: " + rec.getA() + ", " + rec.getB());
		System.out.println("���ε��ܳ�:" + rec.get_perimeter() + ", ���ε������" + rec.get_Area());
	
		Rectangle original = rec.clone();
		System.out.println("Object Cloning:");
		System.out.println("���εı߳�: " + original.getA() + ", " + original.getB());
		System.out.println("���ε��ܳ�:" + original.get_perimeter() + ", ���ε������" + original.get_Area());
	}

}
