package Homework7_1;

import java.util.Scanner;

class Score extends Exception {}

public class ScoreInput {

	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.printf("������ٷ��Ƴɼ�:");
				Scanner in = new Scanner(System.in);
				int num = in.nextInt();
				System.out.println("�������ĳɼ���: " + num);
				if(num < 0 || num > 100) throw new Score();
			} catch (Score e) {
				System.out.println("ŶŶŶ������ĳɼ�������0-100֮��Ŷ");
				// �����쳣�˳�ѭ��
				break;
			}
		}
	}

}
