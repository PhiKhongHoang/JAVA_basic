package test;

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toán Lý Hóa");
		ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Văn Sử Địa");
		ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Lý Hóa Sinh");
		ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday, "Toán Văn Anh");
		
		System.out.println(tkb_t5.toString());
		
		int x = Month.thang_1.soNgay();
		System.out.println("Số ngày: " + x);
	}	
}
