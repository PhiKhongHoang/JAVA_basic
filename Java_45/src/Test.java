
public class Test {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Hãng 1", "vn");
		HangSanXuat hsx2 = new HangSanXuat("Hãng 2", "vn");
		
		MayBay pt1 = new MayBay("Loại 1", hsx1, "Xăng");
		OTo pt2 = new OTo("Ô tô", hsx2, "Dầu");
		XeDap pt3 = new XeDap("Xe đạp", hsx2);
		
		System.out.println(pt1.layTenHangSanXuat());
		pt1.batDau();
		pt1.catCanh();
		
		System.out.println(pt2.layVanToc());
		
		System.out.println(pt3.layVanToc());
	}
}
