package lab0610;

import java.util.Scanner;

public class DSKHACHHANG {
	private KHACHHANG[] kh;
	private int n;
	Scanner sc = new Scanner(System.in);
	
	public DSKHACHHANG() {
		System.out.println("Nhap so luong khach hang: ");
		n = sc.nextInt();
		kh = new KHACHHANG[n];
		
		for(int i=0; i<n; i++) {
			kh[i] = new KHACHHANG();
		}
	}
	
	public void nhapKH() {
		int choose;
		System.out.println("KHVN or KHNN (1/2)?");
		choose = sc.nextInt();
		for(int i=0; i<n; i++) {
			if(choose == 1) {
				kh[i] = new KHACHHANGVIETNAM();
				kh[i].input();
				kh[i].price = kh[i].TinhThanhTien();
			} else if(choose == 2) {
				kh[i] = new KHACHHANGNUOCNGOAI();
				kh[i].input();
				kh[i].price = kh[i].TinhThanhTien();
			} else {
				System.out.println("Lua chon khong hop le!!");
			}
		}
	}
	public void hienthiKH() {
		for(int i=0; i<n; i++) {
			System.out.println(kh[i].toString());
		}
	}
	public void timKH() {
		String tempCode;
		System.out.println("Nhap ma KH can tim: ");
		sc.nextLine();
		tempCode = sc.nextLine();
		int temp = 0;
		
		for(KHACHHANG k:kh) {
			if(k.getCusCode().compareTo(tempCode) == 0) {
				temp = 1;
				break;
			}
		}
		
		if(temp == 1) {
			for(int i=0; i<n; i++) {
				if(kh[i].getCusCode().compareTo(tempCode) == 0) {
					System.out.println(kh[i].toString());
				}
			}
		} else {
			System.out.println("Khong tim thay khach hang!!");
		}
	}
	
	public void capnhatTen() {
		String name;
		System.out.println("Nhap ten muon cap nhat: ");
		name = sc.nextLine();
		int temp = 0, k = -1;
		
		for(int i=0; i<n; i++) {
			if(kh[i].getCusName().toUpperCase().compareTo(name.toUpperCase()) == 0) {
				temp  = 1;
				k = i;
				break;
			}
		}
		if(temp == 1) {
			String newName;
			System.out.println("Nhap ten moi: "); newName = sc.nextLine();
			kh[k].setCusName(newName);
			System.out.println("Thong tin moi: " +kh[k].toString());
		} else {
			System.out.println("Khong tim thay khach hang!!");
		}
	}
	public void sort() {
		for(int i =0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(kh[i].TinhThanhTien() >= kh[j].TinhThanhTien()) {
					KHACHHANG temp;
					temp = kh[i];
					kh[i] = kh[j];
					kh[j] = temp;
				}
			}
		}
		System.out.println("\nDS Khach hang sau khi sap xep theo thanh toan");
		hienthiKH();
	}
	public static void main(String[] args) {
		DSKHACHHANG ds = new DSKHACHHANG();
		ds.nhapKH();
		ds.hienthiKH();
		ds.timKH();
		ds.capnhatTen();
		ds.sort();
	}

}
