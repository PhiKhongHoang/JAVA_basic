/*
 * do - while 
 * 		- luôn chạy lần đầu tiên
 * 		- từ lần 2 mới check điều kiện
 */

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập 0 để thoát!"); 
			System.out.println("Nhập i: ");
			i = sc.nextInt();
		} while (i != 0);
	}
}
