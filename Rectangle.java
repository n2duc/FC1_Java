package n2duc.io;

public class Rectangle extends Shape {
	private double width, height;
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	public double Perimeter() {
		return 2*(width + height);
	}
	public double Area() {
		return width*height;
	}
}
