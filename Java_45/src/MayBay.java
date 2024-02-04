
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	
	public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhieuLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhieuLieu;
	}
	
	public void catCanh() {
		System.out.println("Cất cánh!");
	}
	
	public void haCanh() {
		System.out.println("Hạ cánh!");
	}
	
	public double layVanToc() {
		return 1;
	}
}
