package numberClass;

import java.util.Scanner;

public class FractionNumber extends Number {
	private int numerator;
	private int denominator;

	public FractionNumber() {
		this.numerator = 1;
		this.denominator = 1;
	}
	public FractionNumber(int tu, int mau) {
		this.numerator = tu;
		this.denominator = mau;
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Tu: ");
		numerator = sc.nextInt();
		System.out.println("Nhap Mau: ");
		denominator = sc.nextInt();
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public int gcd(int a, int b) {
		while(a != b) {
			if(a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}
	public void reduce() {
		int gcd = gcd(this.getNumerator(), this.getDenominator());
		this.setNumerator(this.getNumerator() / gcd );
		this.setDenominator(this.getDenominator() / gcd);
	}
	public void add() {
		FractionNumber fn = new FractionNumber();
		int ts = this.getNumerator()*fn.getDenominator() + this.getDenominator()*fn.getNumerator();
		int ms = this.getDenominator()*fn.getDenominator();
		FractionNumber addFn = new FractionNumber(ts, ms);
		addFn.reduce();
		System.out.println("Tong hai phan so: " + addFn.numerator + "/" + addFn.denominator);
	}
	public void subtract() {
		FractionNumber fn = new FractionNumber();
		int ts = this.getNumerator()*fn.getDenominator() - this.getDenominator()*fn.getNumerator();
		int ms = this.getDenominator()*fn.getDenominator();
		FractionNumber subFn = new FractionNumber(ts, ms);
		subFn.reduce();
		System.out.println("Tong hai phan so: " + subFn.numerator + "/" + subFn.denominator);
	}
	public void multifly() {
		FractionNumber fn = new FractionNumber();
		int ts = this.getNumerator()*fn.getDenominator();
		int ms = this.getDenominator()*fn.getDenominator();
		FractionNumber multFn = new FractionNumber(ts, ms);
		multFn.reduce();
		System.out.println("Tich hai phan so: " + multFn.numerator + "/" + multFn.denominator);
	}
	public void divide() {
		FractionNumber fn = new FractionNumber();
		int ts = this.getNumerator()*fn.getDenominator();
		int ms = this.getDenominator()*fn.getNumerator();
		FractionNumber divFn = new FractionNumber(ts, ms);
		divFn.reduce();
		System.out.println("Thuong hai phan so: " + divFn.numerator + "/" + divFn.denominator);
	}
}
