//phương thức kiểm tra lớp String
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		System.out.println("Nhập chuỗi: ");
		s = sc.nextLine();
		System.out.println("s: " + s);
		
//		hàm length() => lấy độ dài chuỗi
		System.out.println("độ dài chuỗi: " + s.length());
		
//		hàm charAt() => lấy 1 kí tự tại 1 vị trí bất kì
		int doDai = s.length();
		for(int i=0; i<doDai; i++)
			System.out.println("Kí tự ở vị trí " + i + ": " + s.charAt(i));
		
//		hàm getChars(start, end, newArr, vị trí bắt đầu lưu của mảng) => lấy hàng loạt kí tự
		char[] arrChar = new char[10];  // mảng char 100 kí tự
		s.getChars(doDai, doDai, arrChar, doDai);
		s.getChars(0, 2, arrChar, 0);
		for(int i=0; i<arrChar.length; i++) { // chú ý: length
			System.out.println("Vị trí arrChar tại vị trí " + i + ": " + arrChar[i]);
		}
		
//		hàm getBytes() => có 3 cách lấy ra giá trị (bảng ascii) của các kí tự thành 1 mảng
		byte[] arrBytes = s.getBytes();
		for (byte b : arrBytes) {
			System.out.println(b);
		}
	}
}
