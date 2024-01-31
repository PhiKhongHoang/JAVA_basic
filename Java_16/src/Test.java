/*
 * Lớp Math
 * 		ceil: trả về số nguyên nhỏ nhất >= giá trị tuyệt đối số đó
 * 		pow(a, b): a^b
 * 		abs: trị tuyệt đối
 * 		sqrt: căn 2
 */

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		System.out.println("Nhập a: ");
		a = sc.nextDouble();
		System.out.println("Nhập b: ");
		b = sc.nextDouble();
		
		System.out.println("Trị tuyệt đối a = " + Math.abs(a));		
		System.out.println("Min(a, b) = " + Math.min(a, b));		
		System.out.println("Căn bậc 2 a = " + Math.sqrt(a));
	}
}
