
public class Test {
	public static void main(String[] args) {
		MyMath myMath = new MyMath();
		
		System.out.println("Min(5, 6): " + myMath.timMin(5, 6));
		System.out.println("Min(5.5, 6.5): " + myMath.timMin(5.5, 6.5));
		System.out.println("Sum(5, 6): " + myMath.tinhTong(5, 6));
		int[] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println("Sum(5, 6): " + myMath.tinhTong(arr));		
	}
}
