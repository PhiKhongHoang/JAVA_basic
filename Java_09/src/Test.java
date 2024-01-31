/* 
Nhập dữ liệu từ bàn phím: Scanner
 	nextBoolean()
 	nextByte()
 	nextDouble()
 	nextFloat()
 	nextInt()
 	nextLine(): đọc 1 String 
 	nextLong()
 	nextShort()
*/

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Full name: ");
		String fullName = sc.nextLine();
		
		System.out.println("MSSV: ");
		long mssv = sc.nextLong();
		
		System.out.println("Thông tin sinh viên: " + fullName + " - " + mssv);
	}
}
