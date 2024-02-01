// hóa đơn cà phê
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg, khoiLuong;
	
	public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
		this.giaTien1Kg = giaTien1Kg;
		this.khoiLuong = khoiLuong;
	}
	
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}
	
	public boolean kiemTraKhoiLuongLonHon(double khoiLuong) {
		return khoiLuong < this.khoiLuong;
	}
}
