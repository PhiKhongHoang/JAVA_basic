
public class HocSinh extends ConNguoi{
	private String tenLop;
	
	public HocSinh(String hoVaTen, int namSinh, String tenLop) {
		super(hoVaTen, namSinh);
		this.tenLop = tenLop;
	}
	
	public void lamBaiTap() {
		System.out.println("... ... ...");
	}
}
