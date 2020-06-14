package Homework6_1;

public class Star implements Movie, TV, Sing{

	public Star() {
		System.out.println("大家好，我是刘德华");
	}
	public void movie() {
		System.out.println("我能演电影");
	}

	public void TV_Series() {
		System.out.println("我能演电视剧");
	}

	public void sing() {
		System.out.println("我能唱歌");
	}
	
	public static void main(String[] args) {
		Star Liu = new Star();
		Liu.movie();
		Liu.TV_Series();
		Liu.sing();
	}


}
