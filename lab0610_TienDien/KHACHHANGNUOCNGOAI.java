package lab0610;

import java.util.Scanner;

public class KHACHHANGNUOCNGOAI extends KHACHHANG {
	private String national;
	
	public KHACHHANGNUOCNGOAI() {}
	public KHACHHANGNUOCNGOAI(String cusCode, String cusName, String dateTime, int amountKW, float unitPrice, double price, String national) {
		super(cusCode, cusName, dateTime, amountKW, unitPrice, price);
		this.national = national;
	}
	public String getNational() {
		return national;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter National: ");
		this.national = sc.nextLine();
	}
	public double TinhThanhTien() {
		return this.amountKW * this.unitPrice;
	}
	@Override
	public String toString() {
		return "KHACHHANGNUOCNGOAI [" + super.toString() + "national=" + national + "]";
	}
}
