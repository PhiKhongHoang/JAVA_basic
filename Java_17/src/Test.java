//if-else

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		
		if(a > 0) {
			System.out.println(a + " là số dương!");
		} else {
			System.out.println(a + " là số âm!");
		}
	}
}
