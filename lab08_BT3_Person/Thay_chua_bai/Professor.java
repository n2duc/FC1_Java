package solution;

import java.util.Scanner;

class Professor extends Person {
	private String khoa;
	
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Khoa: "); khoa = sc.nextLine();
	}
	public void display() {
		super.display();
		System.out.println("Khoa:" + khoa);
	}
	public String description() {
		String t="";
		switch(rank)
		{
			case 0: t= t+ "None"; break;
			case 1: t= t+ "Assistant Professor"; break;
			case 2: t= t+ "Asociate Professor"; break;
			case 3: t= t+ "Professor"; break;
			case 4: t= t+ "Assistant Teaching Professor"; break;
			case 5: t= t+ "Asociate Teaching Professor"; break;
			case 6: t= t+ "Teaching Professor"; 
			
		}
		return t;
	}
	public int gettype() {
		return 2;
	}
}