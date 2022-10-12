package shape;

import java.util.Scanner;

interface Shape {
	public double chuvi();
	public double dientich();
}

public abstract class Hinh implements Shape {
	protected String shapeId;
	
	public Hinh() {}
	public Hinh(String shapdeId) {
		this.shapeId = shapdeId;
	}
	public String getShapeID() {
		return shapeId;
	}
	public void setShapeID(String shapeId) {
		this.shapeId = shapeId;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID Hinh: ");
		shapeId = sc.nextLine();
	}
	public void in() {
		System.out.println("ID Shape: " + shapeId);
	}
	@Override
	public String toString() {
		return "shapeId=" + shapeId;
	}
}
