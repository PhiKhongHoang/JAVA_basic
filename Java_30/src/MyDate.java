/*
 * OOP
 * Phải có phương thức constructor
 * 		- tên phương thức giống tên lớp
 * 		- nhận hoặc không nhận đối số
 * 		- không có giá trị trả về (không return)
 */
public class MyDate {
	private int day, month, year;
	
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void printDay() {
		System.out.println("Ngày: " + this.day);
	}
	
	public void printMonth() {
		System.out.println("Tháng: " + this.month);
	}
	
	public void printYear() {
		System.out.println("Năm: " + this.year);
	}
	
	public void printDate() {
		System.out.println("Ngày - tháng - năm: " + this.day + " - " + this.month + " - " + this.year);
	}
}
