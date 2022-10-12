package Shape_IA;

import java.util.Scanner;

interface ItfShape {
	public double getPerimeter();
	public double getArea();
}

public abstract class Shape implements ItfShape {
	protected String shapeId;
	
	public Shape() {}
	public Shape(String shapdeId) {
		this.shapeId = shapdeId;
	}
	public String getShapeID() {
		return shapeId;
	}
	public void setShapeID(String shapeId) {
		this.shapeId = shapeId;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID Shape: ");
		shapeId = sc.nextLine();
	}
	public void display() {
		System.out.println("ID Shape: " + shapeId);
	}
	@Override
	public String toString() {
		return "shapeId=" + shapeId;
	}
}
