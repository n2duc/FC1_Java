package lab0610;

import java.util.Scanner;

public abstract class KHACHHANG implements ITIENDIEN {
	protected String cusCode;
	protected String cusName;
	protected String dateTime;
	protected int amountKW;
	protected double unitPrice, price;
	
	public KHACHHANG() {}
	public KHACHHANG(String cusCode, String cusName, String dateTime, int amountKW, double unitPrice, double price) {
		this.cusCode = cusCode;
		this.cusName = cusName;
		this.dateTime = dateTime;
		this.amountKW = amountKW;
		this.unitPrice = unitPrice;
		this.price = price;
	}
	
	public String getCusCode() {
		return cusCode;
	}
	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getAmountKW() {
		return amountKW;
	}
	public void setAmountKW(int amountKW) {
		this.amountKW = amountKW;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Code: ");
		this.cusCode = sc.nextLine();
		System.out.println("Enter Customer Name: ");
		this.cusName = sc.nextLine();
		System.out.println("Enter Time: ");
		this.dateTime = sc.nextLine();
		System.out.println("Enter Amount: ");
		this.amountKW = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Unit Price: ");
		this.unitPrice = Float.parseFloat(sc.nextLine());
	}
	public double TinhThanhTien() {
		return price;
	}
	@Override
	public String toString() {
		return "KHACHHANG ["
				+ "cusCode=" + cusCode + 
				", cusName=" + cusName + 
				", dateTime=" + dateTime + 
				", amountKW=" + amountKW +
				", price=" + price +
				", unitPrice=" + unitPrice + 
				"]";
	}
}
