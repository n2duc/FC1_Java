package shape;

import java.util.Scanner;

public class hinhchunhat extends Hinh {
	private double dai, rong;
	public hinhchunhat() {}
	public hinhchunhat(String shapeId, double dai, double rong) {
		super(shapeId);
		this.dai = dai;
		this.rong = rong;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: "); dai = sc.nextDouble();
		System.out.println("Nhap chieu rong: "); rong = sc.nextDouble();
	}
	
	public double chuvi() {
		return 2*(dai+rong);
	}
	public double dientich() {
		return dai*rong;
	}
	public void in() {
		super.in();
		System.out.println("Chu vi hcn: " + chuvi());
		System.out.println("Dien tich hcn: " + dientich());
	}
	@Override
	public String toString() {
		return "hinhchunhat [dai=" + dai + ", rong=" + rong + ", Chu vi: " + chuvi() + ", Dien tich: " + dientich() + "]";
	}
	
}
