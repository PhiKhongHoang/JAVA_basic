
public class Test {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
		
		System.out.println("5 + 4 = " + mfx500.cong(5, 4));
		System.out.println("5 * 4 = " + mvn500.nhan(5, 4));

		System.out.println("Test câu b: ");
		double[] arr = new double[] {1, 5, 2, 4, 3};
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		sxchen.sapXepTang(arr);
		for (double d : arr) {
			System.out.print(d + " ");
		}
		System.out.println();
		sxchon.sapXepGiam(arr);	
		for (double d : arr) {
			System.out.print(d + " ");
		}	

		System.out.println();
		System.out.println("Test câu c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println(pmmt.chia(5, 2));
	}
}
