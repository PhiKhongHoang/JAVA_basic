package test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
		int[] b = new int[15];
		System.out.println("a ban đầu: " + Arrays.toString(a));
		
//		hàm sắp xếp
		Arrays.sort(a);
		System.out.println("a sort: " + Arrays.toString(a));
		
//		hàm tìm kiếm (chỉ dùng được khi mảng đã sắp xếp từ bé đến lớn)
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1)); 
		
//		hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
	}
}
