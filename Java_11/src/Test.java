// các phép toán

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("a: ");
		a = sc.nextInt();
		System.out.println("b: ");
		b = sc.nextInt();
		
		int tong = a+b;
		System.out.println("a + b = " + tong);

		int hieu = a-b;
		System.out.println("a - b = " + hieu);

		int tich = a*b;
		System.out.println("a * b = " + tich);

		float thuong = (float)a / b;
		System.out.println("a / b = " + thuong);

		int chiaDu = a%b;
		System.out.println("a % b = " + chiaDu);
	}
}
