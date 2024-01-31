/*
 * giải pt bậc 1: ax + b = 0
 * a = 0 
 * 		b = 0 => vsn
 * 		b != 0 => vn
 * a != 0 => x = -b/a	
 * 	
 */

import java.util.Scanner;

public class PTBacNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		double x;
		
		System.out.println("Nhập a: ");
		a = sc.nextInt();
		System.out.println("Nhập b: ");
		b = sc.nextInt();
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Vô số nghiệm!");
			}
			else {
				System.out.println("Vô nghiệm!");
			}
		} else {
			System.out.println("x = " + (-(float)b / a));
		}
	}
}
