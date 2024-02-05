//dùng khi có giới hạn giá trị: thứ, tháng trong năm, giới tính, mùa trong năm
package test;

public enum Month {
	thang_1(31),
	thang_2(29),
	thang_3(31),
	thang_4(30),
	thang_5(31),
	thang_6(30),
	thang_7(31),
	thang_8(31),
	thang_9(30),
	thang_10(31),
	thang_11(30),
	thang_12(31);
	
	private final int soNgay;
	
	Month(int soNgay) {
		this.soNgay = soNgay;
	}
	
	public int soNgay() {
		return soNgay;
	}
}
