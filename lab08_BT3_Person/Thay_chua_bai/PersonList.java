package solution;

import java.util.Scanner;

public class PersonList {
	int n;
	Person []a;
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguoi: "); n = sc.nextInt();
		a = new Person[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap nguo thu: " + (i+1) + ": ");
			System.out.println("Sinh vien hay Giao su (0/<>0)? ");
			int tl = sc.nextInt();
			if(tl == 0) a[i] = new Student();
			else a[i] = new Professor();
			
			a[i].nhap();
		}
	}
	void in() {
		for(Person x: a) {
			x.display();
		}
	}
	double tbRank() {
		double k = 0;
		for(Person x: a) {
			k += x.getRank();
		}
		return k/n;
	}
	void maxRank() {
		int v = n-1;
		for(int i = n-1; i >=0 ; i--) {
			if(a[i].getRank() > a[v].getRank()) v = i;
		}
		System.out.println("\n Nguoi co rank cao cuoi cung la: ");
		a[v].display();
	}
	void remove(String code) {
		int co = 0;
		for(Person x:a) {
			if(x.getCode().compareTo(code)==0) {
				co = 1;
				break;
			}
		}
		if(co == 0) {
			System.out.println("\nKhong co nguoi co code =" + code + " trong danh sach");
		} else {
			int v = 0;
			Person []b = new Person[n-1];
			for(int i=0; i<n; i++) {
				if(a[i].getCode().compareTo(code)==0);
				else {
					if(a[i].gettype() == 1) b[v] = new Student();
					else b[v] = new Professor();
					b[v++] = a[i];
				}
			}
			n--;
			a = b;
			System.out.println("\n Da xoa xong!!");
		}
		System.out.println("\n DS Sau khi xoa: ");
		in();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PersonList m = new PersonList();
		m.nhap(); m.in();
		System.out.println("\n Trung binh rank = " + m.tbRank());
		m.maxRank();
		
		System.out.println("\n Nhap code cua nguoi muon xoa: ");
		String code = sc.nextLine();
		m.remove(code);
		
		System.out.println("\n Done!");
	}

}
