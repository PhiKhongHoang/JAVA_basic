package test;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(20205012, "khong hoang phi", "vn-02", 8.5);
		SinhVien sv2 = new SinhVien(2020, "tran thi b", "vn-02", 9.5);
		SinhVien sv3 = new SinhVien(5012, "Nguyen van a", "vn-02", 7.5);
		
		System.out.println(sv3.compareTo(sv2));
	}
}
