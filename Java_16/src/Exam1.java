//tính chu vi - diện tích hình tròn

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập r: ");
		double r = sc.nextDouble();
		double chuVi, dienTich; 
		
		chuVi = 2 * Math.PI * r;
		dienTich = Math.PI * Math.pow(r, 2);
		
		System.out.println("Chu vi: " + chuVi);
		System.out.println("Diện tích: " + dienTich);
	}
}
