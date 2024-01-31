//toán tử điều kiện

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a = ");
		int a = sc.nextInt();
		
		String result = (a %2 == 0) ? "Số chẵn" : "Số lẻ";
		System.out.println(a + " là " + result);
	}
}
