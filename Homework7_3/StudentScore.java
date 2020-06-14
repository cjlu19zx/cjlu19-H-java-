package Homework7_3;

import java.util.Scanner;

class ilInput extends Exception {}

public class StudentScore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		double sum = 0;
		try {
			System.out.println("请输入N的值(数组元素个数):");
			n = in.nextInt();
			if(n <= 0) throw new ilInput();
		} catch (ilInput e) {
			System.out.println("元素的个数必须是正整数！");
			System.out.println("请再次输入N的值:");
			n = in.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			Student stu = new Student();
			try {
				System.out.println("请输入学生的分数：");
				stu.setGrade(in.nextInt());
				stu.isGradeOk();
				sum += stu.getGrade();
			} catch (illegalInput e) {
				System.out.println("分数必须是正数或者0！");
				System.out.println("请再次输入该分数:");
				stu.setGrade(in.nextInt());
				sum += stu.getGrade();
			}
		}
		
		System.out.println("学生分数的平均分是:" + sum / n);
	}

}
