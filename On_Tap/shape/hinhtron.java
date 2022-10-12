package shape;

import java.util.Scanner;

public class hinhtron extends Hinh {
	private double bk;
	final double pi = Math.PI;
	
	public hinhtron() {}
	public hinhtron(String shapeId, double bk) {
		super(shapeId);
		this.bk = bk;
	}
	public double getBk() {
		return bk;
	}
	public void setBk(double bk) {
		this.bk = bk;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap BK hinh tron: ");
		bk = sc.nextDouble();
	}
	public double chuvi() {
		return 2*pi*bk;
	}
	public double dientich() {
		return (pi * Math.pow(bk, 2));
	}
	public void in() {
		super.in();
		System.out.println("Chu vi hinh tron: " + chuvi());
		System.out.println("Dien tich hinh tron: " + dientich());
	}
	@Override
	public String toString() {
		return "hinhtron [ " + super.toString() + ", bk=" + bk + ", Chu vi: " + chuvi() + ", Dien tich: " + dientich() + "]";
	}
	
}
