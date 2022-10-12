package Shape_IA;

import java.util.*;

public class ShapeList {
	ArrayList<Shape> h = new ArrayList<Shape>();
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.println("Nhap so luong hinh: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			System.out.println("Circle or Rectangle (1/0)?");
			int chon = sc.nextInt();
			if(chon == 1) {
				Shape ht = new Circle();
				ht.input();
				h.add(ht);
			} else {
				Shape hcn = new Rectangle();
				hcn.input();
				h.add(hcn);
			}
		}
	}
	void display() {
		System.out.println("\n==== Shape List ====");
		for(int i=0; i<h.size(); i++) {
			System.out.println((i+1)+ ". " + h.get(i));
		}
	}
	void findShape() {
		System.out.println("\nNhap ID hinh can tim: ");
		sc.nextLine();
		String tempId = sc.nextLine();
		int temp = 0;
		
		for(Shape x: h) {
			if(x.getShapeID().equalsIgnoreCase(tempId)) {
				temp = 1;
				break;
			}
		}
		
		if(temp == 1) {
			for(int i=0; i< h.size(); i++) {
				if(h.get(i).getShapeID().compareTo(tempId)==0) {
					System.out.println("Hinh can tim\n" + h.get(i));
				}
			}
		} else {
			System.out.println("\nKhong tim thay hinh co ID nay!!");
		}
	}
	void changeShape() {
		String tempId;
	}
	void removeShape() {
		System.out.println("\nNhap ID hinh muon xoa: ");
		String tempId = sc.nextLine();
		int temp = 0;
		
		for(Shape x: h) {
			if(x.getShapeID().equalsIgnoreCase(tempId)) {
				temp = 1;
				break;
			}
		}
		
		if(temp == 1) {
			for(int i=0; i<h.size(); i++) {
				if(h.get(i).getShapeID().compareTo(tempId)==0) {
					h.remove(i);
				}
			}
			System.out.println("DS Hinh sau khi xoa: ");
			display();
		} else {
			System.out.println("\nKhong tim thay hinh co ID nay !!");
		}
	}
	public static void main(String[] args) {
		ShapeList m = new ShapeList();
		m.input(); m.display();
		m.findShape();
		m.removeShape();
	}

}
