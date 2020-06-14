package Homework7_3;

class illegalInput extends Exception {}

public class Student {
	private int grade;
	
	public void setGrade (int grade) {
		this.grade = grade;
	}
	
	public int getGrade () {
		return grade;
	}
	
	public void isGradeOk () throws illegalInput {
		if(grade < 0) throw new illegalInput();
	}
}
