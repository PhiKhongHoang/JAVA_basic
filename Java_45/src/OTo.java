
public class OTo extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	
	public OTo (String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public double layVanToc() {
		return 0;
	}
}	
