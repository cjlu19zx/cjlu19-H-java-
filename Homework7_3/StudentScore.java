package Homework7_3;

import java.util.Scanner;

class ilInput extends Exception {}

public class StudentScore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		double sum = 0;
		try {
			System.out.println("������N��ֵ(����Ԫ�ظ���):");
			n = in.nextInt();
			if(n <= 0) throw new ilInput();
		} catch (ilInput e) {
			System.out.println("Ԫ�صĸ�����������������");
			System.out.println("���ٴ�����N��ֵ:");
			n = in.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			Student stu = new Student();
			try {
				System.out.println("������ѧ���ķ�����");
				stu.setGrade(in.nextInt());
				stu.isGradeOk();
				sum += stu.getGrade();
			} catch (illegalInput e) {
				System.out.println("������������������0��");
				System.out.println("���ٴ�����÷���:");
				stu.setGrade(in.nextInt());
				sum += stu.getGrade();
			}
		}
		
		System.out.println("ѧ��������ƽ������:" + sum / n);
	}

}
