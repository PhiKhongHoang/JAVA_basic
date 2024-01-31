/*
 * try - catch - finally (bắt ngoại lệ)
 	
		try {
			// khối lện có thể ném ngoại lệ
		} catch (Exception e) {
			// khối lệnh sẽ thực hiện nếu ngoại lệ xảy ra
		}catch (Exception e) {
			// khối lệnh sẽ thực hiện nếu ngoại lệ xảy ra
		} finally { // có thể có hoặc không
			// khối lệnh sẽ thực hiện bất chấp ngoại lệ xảy ra hay không
		}
 */

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		try {
			System.out.println("Nhập n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Giá trị không đúng!");
		} finally {
			System.out.println("Finally!");
		}
		System.out.println("n = " + n);
		System.out.println("Kết thúc!");
	}
}
