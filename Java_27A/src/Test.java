//mảng

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int arr1[];
		int []arr2;
		
		arr = new int[5]; // tạo mảng int có 5 phần tử
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhập phần tử thứ " + (i+1) + ": ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Sum = " + sum);
		
		arr1 = new int[] {1, 2, 3, 4, 5};
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
