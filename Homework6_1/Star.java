package Homework6_1;

public class Star implements Movie, TV, Sing{

	public Star() {
		System.out.println("��Һã��������»�");
	}
	public void movie() {
		System.out.println("�����ݵ�Ӱ");
	}

	public void TV_Series() {
		System.out.println("�����ݵ��Ӿ�");
	}

	public void sing() {
		System.out.println("���ܳ���");
	}
	
	public static void main(String[] args) {
		Star Liu = new Star();
		Liu.movie();
		Liu.TV_Series();
		Liu.sing();
	}


}
