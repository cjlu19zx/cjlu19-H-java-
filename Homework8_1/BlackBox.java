package Homework8_1;

/*
 * Author:cjlu_19_zx
 */

import java.util.Scanner;

public class BlackBox<T> {

	private T val1, val2, val3;
	
	public BlackBox () {}
	public BlackBox (T val1, T val2, T val3) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
	}
	
	public T getVal1() {
		return val1;
	}
	public void setVal1(T val1) {
		this.val1 = val1;
	}
	public T getVal2() {
		return val2;
	}
	public void setVal2(T val2) {
		this.val2 = val2;
	}
	public T getVal3() {
		return val3;
	}
	public void setVal3(T val3) {
		this.val3 = val3;
	}
	
	public String toString() {
		return " " + val1 + " " + val2 + " " + val3;
	}
	
	public static void main(String[] args) {
		BlackBox box[] = new BlackBox[2];
		box[0] = new BlackBox(1, 3.14159, "PI");
		box[1] = new BlackBox("Tom", "Jerry", "һ�Ի");
		for(BlackBox x : box) {
			System.out.println(x);
		}
	}

}
