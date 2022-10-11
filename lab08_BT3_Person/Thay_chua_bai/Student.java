package solution;

import java.util.Scanner;

class Student extends Person {
	private String DP;
	private int YG;
	
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap CT hoc: "); DP = sc.nextLine();
		System.out.print("Nam tot nghiep: "); YG = sc.nextInt();
	}
	public void display() {
		super.display();
		System.out.println("CT hoc: " + DP);
		System.out.println("Tot nghiep: " + YG);
	}
	public String description() {
		String t = "";
		switch(rank) {
			case 0: t= t+ "None"; break;
			case 1: t= t+ "Preshman"; break;
			case 2: t= t+ "Sophomore"; break;
			case 3: t= t+ "Junior"; break;
			case 4: t= t+ "Senior"; break;
			case 5: t= t+ "Graduate"; break;
			case 6: t= t+ "Masters Postgraduate"; break;
			case 7: t= t+ "PhD Postgraduate\r\n"; break;
		}
		return t;
	}
	public int gettype() {
		return 1;
	}
}