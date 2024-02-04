
public class HinhChuNhat extends Hinh {
	private double chieuDai, chieuRong;
	
	public HinhChuNhat(ToaDo toaDo, double chieuDai, double chieuRong) {
		super(toaDo);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}
}
