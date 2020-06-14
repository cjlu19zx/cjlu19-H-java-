package Homework7_2;

import java.util.Scanner;

class IsTriangle extends Exception {}

public class Triangle {

	private int a, b, c;
	
	Triangle () {}
	
	public void setSideLength(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void isTriangle() throws IsTriangle {
		if(a + b <= c || a + c <= b || b + c <= a) throw new IsTriangle();
	}
	
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("���������ε������߳�a, b, c:");
				Triangle tri = new Triangle();
				Scanner in = new Scanner(System.in);
				tri.setSideLength(in.nextInt(), in.nextInt(), in.nextInt());
				tri.isTriangle();
			} catch(IsTriangle e) {
				System.out.println("a, b, c���ܹ��������Σ�");
				// �����쳣����ѭ��
				break;
			}
		}

	}

}
