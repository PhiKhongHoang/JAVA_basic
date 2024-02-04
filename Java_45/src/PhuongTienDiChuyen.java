
public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;
	
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	
	public String layTenHangSanXuat() {
		return hangSanXuat.getTenHangSanXuat();
	}
	
	public void batDau() {
		System.out.println("Start!");
	}
	
	public void tangToc() {
		System.out.println("Tăng tốc!");
	}
	
	public void dungLai() {
		System.out.println("Stop!");
	}
	
	public abstract double layVanToc();
}
