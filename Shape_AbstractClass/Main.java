package n2duc.io;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w, h;
		System.out.println("Nhap chieu dai: "); w = sc.nextDouble();
		System.out.println("Nhap chieu rong: "); h = sc.nextDouble();
		Shape R = new Rectangle(w, h);
		System.out.println("Hinh Chu Nhat: Chu Vi = " + R.Perimeter() + ", Dien Tich = " + R.Area());
		
		double r;
		System.out.println("Nhap Ban Kinh: "); r = sc.nextDouble();
		Shape C = new Circle(r);
		System.out.println("Hinh Tron: Chu Vi = " + C.Perimeter() + ", Dien Tich = " + C.Area());
		
		sc.close();
	}

}
