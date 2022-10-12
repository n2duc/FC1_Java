package Shape_IA;

import java.util.Scanner;

public class Circle extends Shape {
	private double radius;
	final double pi = Math.PI;
	
	public Circle() {}
	public Circle(String shapeId, double radius) {
		super(shapeId);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle: ");
		radius = sc.nextDouble();
	}
	public double getPerimeter() {
		return 2*pi*radius;
	}
	public double getArea() {
		return (pi * Math.pow(radius, 2));
	}
	public void in() {
		super.display();
		System.out.println("Perimeter of a Circle: " + getPerimeter());
		System.out.println("Area of a Circle: " + getArea());
	}
	@Override
	public String toString() {
		return "CIRCLE [ " + 
				super.toString() + 
				", Radius =" + radius + 
				", Perimeter: " + String.format("%.2f", getPerimeter()) + 
				", Area: " + String.format("%.2f", getArea()) + 
				"]";
	}
	
}
