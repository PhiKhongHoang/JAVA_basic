package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
//	1. Thêm sinh viên vào danh sách!
	public void themSinhVien(SinhVien sv) {
		danhSach.add(sv); // thêm vào cuối
	}
	
//	2. In danh sách sinh viên!
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
//	3. Kiểm tra danh sách có rỗng hay không!
	public boolean kiemTraDanhSachRong() {
		return danhSach.isEmpty();
	}
	
//	4. Lấy số lượng sinh viên trong danh sách!
	public int laySoLuongSinhVien() {
		return danhSach.size();
	}
	
//	5. Làm rỗng danh sách!
	public void lamRongDanhSach() {
		danhSach.removeAll(danhSach);
	}
	
//	6. Kiểm tra sinh viên có trong danh sách hay không (theo mssv)!
	public boolean kiemTraSinhVienTheoMSSV(SinhVien sv) {
		return danhSach.contains(sv);
	}
	
//	7. Xóa sinh viên theo mssv!
	public boolean xoaSinhVienTheoMSSV(SinhVien sv) {
		return danhSach.remove(sv);
	}
	
//	8. Tìm kiếm sinh viên theo tên!
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
//	9. Xuất danh sách sinh viên theo điểm từ cao xuống thấp!
	public void  sapXepSinhVienTheoDiemGiamDan() {
		Collections.sort(danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) { // trả về < > = 0
				if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh())
					return -1;
				else {
					if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh())
						return 1;
					else 
						return 0;
				}
			}
			
		});
	}
	
}
