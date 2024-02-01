
public class Main {
	public static void main(String[] args) {
		HoaDonCaPhe hoaDon = new HoaDonCaPhe("Cà phê trung nguyên", 1.5, 10);
		System.out.println("Tổng tiền: " + hoaDon.tinhTongTien());
		System.out.println("Kiểm tra khối lượng: " + hoaDon.kiemTraKhoiLuongLonHon(15));
	}
}
