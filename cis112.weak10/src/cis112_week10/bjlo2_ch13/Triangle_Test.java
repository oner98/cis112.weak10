package cis112_week10.bjlo2_ch13;

public class Triangle_Test {
	
	public static void main(String[] args) {
		Triangle t = new Triangle(10);
		int area = t.getArea();
		System.out.println("Area: " + area);
		System.out.println("Expected: 55");
	}
	
}
