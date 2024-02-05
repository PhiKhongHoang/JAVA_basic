package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("---------- Menu ----------");
			System.out.println("1. Thêm sinh viên vào danh sách! ");
			System.out.println("2. In danh sách sinh viên! ");
			System.out.println("3. Kiểm tra danh sách có rỗng hay không! ");
			System.out.println("4. Lấy số lượng sinh viên trong danh sách! ");
			System.out.println("5. Làm rỗng danh sách! ");
			System.out.println("6. Kiểm tra sinh viên có trong danh sách hay không (theo mssv)! ");
			System.out.println("7. Xóa sinh viên theo mssv! ");
			System.out.println("8. Tìm kiếm sinh viên theo tên! ");
			System.out.println("9. Xuất danh sách sinh viên theo điểm từ cao xuống thấp! ");
			System.out.println("0. Thoát! ");
			System.out.println("**** Vui lòng lựa chọn chức năng: ");
			luaChon = sc.nextInt();
			sc.nextLine(); // do luaChon = sc.nextInt(); có ấn phím enter nên sẽ nhận enter là mssv luôn. nên phải có dòng này để nhận mssv
			if(luaChon == 1) {
				System.out.println("Nhập mssv: ");
				String mssv = sc.nextLine();
				System.out.println("Nhập họ và tên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: ");
				float diemTrungBinh = sc.nextFloat();				
				SinhVien sv = new SinhVien(mssv, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
			} else if(luaChon == 2) {
				dssv.inDanhSachSinhVien();
			} else if(luaChon == 3) {
				System.out.println("Kiểm tra danh sách rỗng: " + dssv.kiemTraDanhSachRong());
			} else if(luaChon == 4) {
				System.out.println("Số lượng sinh viên: " + dssv.laySoLuongSinhVien());
			} else if(luaChon == 5) {
				dssv.lamRongDanhSach();
			} else if(luaChon == 6) {
				System.out.println("Nhập mssv: ");
				String mssv = sc.nextLine();
				SinhVien sv = new SinhVien(mssv);
				System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraSinhVienTheoMSSV(sv));
			} else if(luaChon == 7) {
				System.out.println("Nhập mssv: ");
				String mssv = sc.nextLine();
				SinhVien sv = new SinhVien(mssv);
				System.out.println("Xóa sinh viên trong danh sách: " + dssv.xoaSinhVienTheoMSSV(sv));
			} else if(luaChon == 8) {
				System.out.println("Nhập họ và tên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.timSinhVien(hoVaTen);
			} else if(luaChon == 9) {
				dssv.sapXepSinhVienTheoDiemGiamDan();
				dssv.inDanhSachSinhVien();
			}
		}while(luaChon != 0);
		
	}
}
