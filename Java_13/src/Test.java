//gán dữ liệu

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a;
		System.out.println("Nhập a: ");
		a = sc.nextFloat();
		
		System.out.println("a = " + a);
		System.out.println("a += 3 => " + (a+=3));
		System.out.println("a -= 3 => " + (a-=3));
		System.out.println("a *= 3 => " + (a*=3));
		System.out.println("a /= 3 => " + (a/=3));
		System.out.println("a %= 3 => " + (a%=3));
	}
}
