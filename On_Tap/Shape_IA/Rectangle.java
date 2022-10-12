package Shape_IA;

import java.util.Scanner;

public class Rectangle extends Shape {
	private double width, height;
	public Rectangle() {}
	public Rectangle(String shapeId, double w, double h) {
		super(shapeId);
		this.width = w;
		this.height = h;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width: "); this.width = sc.nextDouble();
		System.out.println("Enter height: "); this.height = sc.nextDouble();
	}
	
	public double getPerimeter() {
		return 2*(this.width+this.height);
	}
	public double getArea() {
		return this.width*this.height;
	}
	public void in() {
		super.display();
		System.out.println("Perimeter of Rectangle: " + getPerimeter());
		System.out.println("Area of Rectangle: " + getArea());
	}
	@Override
	public String toString() {
		return "RECTANGLE [ " + 
				super.toString() + 
				", Width =" + width + 
				", Height =" + height + 
				", Perimeter: " + String.format("%.2f", getPerimeter()) + 
				", Area: " + String.format("%.2f", getArea()) + 
				"]";
	}
	
}
