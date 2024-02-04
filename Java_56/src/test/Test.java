package test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chào các bạn, tôi là PHK!";
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		

		String s1 = "Xin chào các bạn, tôi là PHK. Tôi là coder!";
		String[] arr1 = s1.split("\\.|\\,"); // lấy dấu . và dấu , làm phần tử ngăn cách để cắt
		System.out.println(Arrays.toString(arr1));
	}
}
