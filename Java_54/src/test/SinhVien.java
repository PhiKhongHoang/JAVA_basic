package test;

public class SinhVien implements Comparable<SinhVien> {
	private int mssv;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	
	public SinhVien(int mssv, String hoVaTen, String tenLop, double diemTrungBinh) {
		super();
		this.mssv = mssv;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getTen() {
		String s;
		int index = hoVaTen.lastIndexOf(" ");
		if(index >= 0) {
			s = hoVaTen.substring(index + 1);
		}
		else 
			s = hoVaTen;
		return s;
	}

	@Override
	public int compareTo(SinhVien o) {
		// < 0
		// = 0
		// > 0
		return (this.getTen()).compareTo(o.getTen());
	}
	
}
