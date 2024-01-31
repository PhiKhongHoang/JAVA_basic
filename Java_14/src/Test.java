//phép toán so sánh - phép toán điều kiện

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("a = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		
		System.out.println("a == b => " + (a == b));
		System.out.println("a > b => " + (a > b));
		System.out.println("a >= b => " + (a >= b));
		System.out.println("a < b => " + (a < b));
		System.out.println("a <= b => " + (a <= b));
		System.out.println("a != b => " + (a != b));
		System.out.println("a % 2 == 0 && b % 2 == 0 => " + (a % 2 == 0 && b % 2 == 0));
		System.out.println("a % 2 == 0 || b % 2 == 0 => " + (a % 2 == 0 || b % 2 == 0));
	}
}
