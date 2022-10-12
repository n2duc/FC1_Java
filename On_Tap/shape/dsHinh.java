package shape;

import java.util.*;

public class dsHinh {
	ArrayList<Hinh> h = new ArrayList<Hinh>();
	Scanner sc = new Scanner(System.in);
	
	void nhap() {
		System.out.println("Nhap so luong hinh: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Hinh Tron or Hinh CN(0/1)?");
			int chon = sc.nextInt();
			if(chon == 1) {
				hinhtron ht = new hinhtron();
				ht.nhap();
				h.add(ht);
			} else {
				hinhchunhat hcn = new hinhchunhat();
				hcn.nhap();
				h.add(hcn);
			}
		}
	}
	void in() {
		for(int i=0; i<h.size(); i++) {
			System.out.println((i+1)+ ". " + h.get(i));
		}
	}
	void timHinh() {
		System.out.println("Nhap ID hinh can tim: ");
		sc.nextLine();
		String tempId = sc.nextLine();
		
		for(int i=0; i< h.size(); i++) {
			if(h.get(i).getShapeID().compareTo(tempId)==0) {
				System.out.println("Hinh can tim\n" + h.get(i));
			}
		}
	}
	void xoaHinh() {
		System.out.println("Nhap ID hinh muon xoa: ");
		String tempId = sc.nextLine();
		
		for(int i=0; i<h.size(); i++) {
			if(h.get(i).getShapeID().compareTo(tempId)==0) {
				h.remove(i);
			}
		}
		System.out.println("DS Hinh sau khi xoa: ");
		in();
	}
	public static void main(String[] args) {
		dsHinh m = new dsHinh();
		m.nhap(); m.in();
		m.timHinh();
		m.xoaHinh();
	}

}
