/*
 * phép toán 1 ngôi
 * 		+ : giá trị dương
 * 		- : giá trị âm
 * 		++ : tăng 1 giá trị
 * 		-- : giảm 1 giá trị
 * 		! : nghịch đảo
 */
public class Test {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("Số âm: " + (-a));
		System.out.println("Số dương: " + (+a));
		System.out.println("---------");
		System.out.println("a = " + a);
		System.out.println("Số tăng 1 giá trị (thay đổi trước khi thực hiện): " + (++a));
		System.out.println("Số giảm 1 giá trị (thay đổi trước khi thực hiện): " + (--a));
		System.out.println("---------");	
		System.out.println("a = " + a);
		System.out.println("Số tăng 1 giá trị (thay đổi sau khi thực hiện): " + (a++));
		System.out.println("a = " + a);
		System.out.println("Số giảm 1 giá trị (thay đổi sau khi thực hiện): " + (a--));
		System.out.println("---------");		
		boolean b = false;
		System.out.println("Phủ định: " + (!b));
	}
}
