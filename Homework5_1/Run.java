package Homework5_1;

public class Run {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		Cylinder cylinder = new Cylinder(6.0);
		circle.show();
		cylinder.setRadius(5.0);
		cylinder.show();
	}

}
