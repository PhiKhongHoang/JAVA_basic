
public class HinhTron extends Hinh {
	private double r;
	
	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}
	
	public double tinhDienTich() {
		return Math.PI * Math.pow(r, 2);
	}
}
