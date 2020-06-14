package Homework7_1;

import java.util.Scanner;

class Score extends Exception {}

public class ScoreInput {

	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.printf("请输入百分制成绩:");
				Scanner in = new Scanner(System.in);
				int num = in.nextInt();
				System.out.println("你刚输入的成绩是: " + num);
				if(num < 0 || num > 100) throw new Score();
			} catch (Score e) {
				System.out.println("哦哦哦，输入的成绩必须是0-100之间哦");
				// 出现异常退出循环
				break;
			}
		}
	}

}
