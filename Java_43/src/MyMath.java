
public class MyMath {
	protected int timMin(int a, int b) {
		return (a <= b) ? a : b;
	}

	protected double timMin(double a, double b) {
		return (a <= b) ? a : b;
	}
	
	protected int tinhTong(int a, int b) {
		return a+b;
	}
	
	protected int tinhTong(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
