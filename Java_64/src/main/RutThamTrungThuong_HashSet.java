//hashSet là sắp xếp không có thứ tự
package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	public RutThamTrungThuong_HashSet() {
		
	}
	
//	1. Thêm mã số dự thưởng.
	public boolean themPhieuDuThuong(String giaTri) {
		return thungPhieuDuThuong.add(giaTri);
	}
	
//	2. Xóa mã số dự thưởng.
	public boolean xoaPhieu(String giaTri) {
		return thungPhieuDuThuong.remove(giaTri);
	}
	
//	3. Kiểm tra mã số dự thưởng có tồn tại hay không.
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return thungPhieuDuThuong.contains(giaTri);
	}
	
//	4. Xóa tất cả mã số dự thưởng.
	public void xoaTatCaPhieuDuThuong() {
		thungPhieuDuThuong.clear();
	}
	
//	5. Số lượng số dự thưởng.
	public int laySoLuong() {
		return thungPhieuDuThuong.size();
	}
	
//	6. Rút thăm trúng thưởng.
	public String rutThamTrungThuong() {
		String ketQua = "";
		Random random = new Random();
		int viTri = random.nextInt(thungPhieuDuThuong.size()); // rand từ 0 -> size() 
		ketQua = (String) thungPhieuDuThuong.toArray()[viTri]; // chuyển về string
		return ketQua;
	}
	
//	7. In tất cả thăm trúng thưởng.
	public void inTatCa() {
		System.out.println(Arrays.toString(thungPhieuDuThuong.toArray()));
	}
 
	public static void main(String[] args) {
		RutThamTrungThuong_HashSet rutTham = new RutThamTrungThuong_HashSet();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------------------");
			System.out.println("Menu: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không.");
			System.out.println("4. Xóa tất cả mã số dự thưởng.");
			System.out.println("5. Số lượng số dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In tất cả thăm trúng thưởng.");
			System.out.println("0. Thoát.");
			
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập mã phiếu dự thưởng: ");
				String giaTri = sc.nextLine();
				if(luaChon == 1) {
					rutTham.themPhieuDuThuong(giaTri);
				} else if (luaChon == 2) {
					rutTham.xoaPhieu(giaTri);
				} else {
					System.out.println("Kết quả kiểm tra: " + rutTham.kiemTraPhieuTonTai(giaTri));
				}
			} else if(luaChon == 4) {
				rutTham.xoaTatCaPhieuDuThuong();
			} else if (luaChon == 5) {
				System.out.println("Số lượng phiếu: " + rutTham.laySoLuong());
			} else if (luaChon == 6) {
				System.out.println("Mã số trúng thưởng: " + rutTham.rutThamTrungThuong());
			} else if (luaChon == 7) {
				System.out.println("Tất cả thăm trúng thưởng: ");
				rutTham.inTatCa();
			}
		}while(luaChon != 0);
	}
}
