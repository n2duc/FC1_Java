package lab0610;

import java.util.Scanner;

public class KHACHHANGVIETNAM extends KHACHHANG {
	private int cusObject;
	private int quotaKW;
	
	public KHACHHANGVIETNAM() {}
	public KHACHHANGVIETNAM(String cusCode, String cusName, String dateTime, int amountKW, double unitPrice, double price, int cusObject, int quotaKW) {
		super(cusCode, cusName, dateTime, amountKW, unitPrice, price);
		this.cusObject = cusObject;
		this.quotaKW = quotaKW;
	}
	public int getCusObject() {
		return cusObject;
	}
	public int getQuotaKW() {
		return quotaKW;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Loai khach hang: (1. Sinh hoat. 2. Kinh doanh. 3. San xuat)");
		this.cusObject = sc.nextInt();
		System.out.println("Enter Quota: ");
		this.quotaKW = sc.nextInt();
	}
	public double TinhThanhTien() {
		if(amountKW <= quotaKW) {
			return  this.amountKW * this.unitPrice;
		} else {
			return this.amountKW*this.unitPrice*this.quotaKW + (this.amountKW - this.quotaKW)*this.unitPrice*2.5;
		}
	}
	@Override
	public String toString() {
		String temp;
		if(cusObject == 1) {
			temp = "Sinh hoat";
		} else if(cusObject == 2) {
			temp = "Kinh doanh";
		} else {
			temp = "San xuat";
		}
		return "KHACHHANGVIETNAM ["
				+ super.toString()
				+ "cusObject=" + temp
				+ ", quotaKW=" + quotaKW 
				+ "]";
	}
	
}
