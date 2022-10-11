package solution;

import java.util.Scanner;

abstract class Person {
	protected String code, name;
	protected int rank;
	public Person() { 
		code = name = ""; 
		this.rank = 0; 
	}
	public Person(String code, String name, int rank) {
		this.code = code; this.name = name; this.rank = rank;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}
	public abstract String description();
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: "); code = sc.nextLine();
		System.out.print("Nhap ten: "); name = sc.nextLine();
		System.out.print("Nhap rank: "); rank = sc.nextInt();
	}
	public void display() {
		System.out.println("Person code: " + code);
		System.out.println("Person name: " + name);
		System.out.println("Rank: " + rank);
	}
	public abstract int gettype();
}