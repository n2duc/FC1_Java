package n2duc.io;

public class Circle extends Shape {
	private double radius;
	final double pi = Math.PI;
	
	public Circle() {
		this.radius = 1;
	}
	public Circle(double r) {
		this.radius = r;
	}
	public double Perimeter() {
		return 2*pi*radius;
	}
	public double Area() {
		return (pi * Math.pow(radius, 2));
	}
}	
