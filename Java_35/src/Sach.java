
public class Sach {
	private String tenSach;
	private float giaSach;
	private int namXuatBan;
	private TacGia tacGia;

	public Sach(String tenSach, float giaSach, int namXuatBan, TacGia tacGia) {
		this.tenSach = tenSach;
		this.giaSach = giaSach;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}

	public void inTenSach() {
		System.out.println("Tên sách: " + tenSach);
	}

	public boolean kiemTraCungNam(Sach sachKhac) {
		return (namXuatBan == sachKhac.namXuatBan);
	}

	public double giaSachSauKhiGiam(float x) {
		return giaSach * (100 - x) / 100;
	}
}
