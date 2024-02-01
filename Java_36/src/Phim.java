
public class Phim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private float giaVe;
	private NgayChieu ngayChieu;
	
	public Phim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, float giaVe, NgayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	
	public boolean kiemTraGiaVeReHon(Phim phimKhac) {
		return (giaVe < phimKhac.giaVe);
	}
	
	public String tenHangSanXuat() {
		return hangSanXuat.getTenHangSanXuat();
	}
	
	public float giaVeKhiKhuyenMai(float x) {
		return giaVe * (1 - x / 100);
	}
}
