
public class Main {
	public static void main(String[] args) {
		Ngay ngay = new Ngay(1, 2, 2024);
		TacGia tacGia = new TacGia("Phi Khong Hoang", ngay);
		Sach sach = new Sach("Java", 9.5f, 2024, tacGia);
		Sach sach1 = new Sach("PHP", 9.5f, 2023, tacGia);
		
		sach.inTenSach();
		System.out.println("Kiểm tra cùng năm: " + sach.kiemTraCungNam(sach1));
		System.out.println("Giá sách sau khi giảm: " + sach.giaSachSauKhiGiam(5.5f));
	}
}
