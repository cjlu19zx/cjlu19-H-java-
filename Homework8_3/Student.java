package Homework8_3;

/*
 * Author:cjlu_19_zx
 */

public class Student {
	private String number;
	private String name;
	private int age;
	
	Student () {}
	Student (String number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "" + number + ", " + name + ", " + age;
	}
}
