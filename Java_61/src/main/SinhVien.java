package main;

public class SinhVien implements Comparable<SinhVien> {
	private String mssv, hoVaTen;
	private int namSinh;
	private float diemTrungBinh;
	
	public SinhVien(String mssv) {
		this.mssv = mssv;
	}

	public SinhVien(String mssv, String hoVaTen, int namSinh, float diemTrungBinh) {
		this.mssv = mssv;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getMssv() {
		return mssv;
	}
	
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.mssv.compareTo(o.mssv);
	}

	@Override
	public boolean equals(Object obj) { // phải viết để kiểm tra chức năng 6, 7
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;		
		if (mssv == null) {
			if (other.mssv != null)
				return false;
		} else if (!mssv.equals(other.mssv))
			return false;
		return true;
	}	
	
}
