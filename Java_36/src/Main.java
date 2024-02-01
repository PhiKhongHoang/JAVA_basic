
public class Main {
	public static void main(String[] args) {
		NgayChieu ngayChieu = new NgayChieu(2, 2, 2024);
		HangSanXuat hangSanXuat = new HangSanXuat("MeNu NoAi", "VN");
		NgayChieu ngayChieu1 = new NgayChieu(2, 3, 2024);
		HangSanXuat hangSanXuat1 = new HangSanXuat("Tobii", "VN");
		Phim phim = new Phim("Doraemon", 1965, hangSanXuat, 10, ngayChieu);
		Phim phim1 = new Phim("Conan", 2000, hangSanXuat1, 5.5f, ngayChieu1);
		
		System.out.println("Kiểm tra giá vé: " + phim.kiemTraGiaVeReHon(phim1));
		System.out.println("Tên hãng sản xuất: " + phim.tenHangSanXuat());
		System.out.println("Giá vé sau khi giảm: " + phim.giaVeKhiKhuyenMai(10));
	}
}
