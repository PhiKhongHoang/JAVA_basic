import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
//		kiểu nguyên thủy
		int[] arr1 = {1, 2, 3};
		
//		copy mảng cách 1
		int[] arr1_a = arr1;
		arr1_a[0] = 100;
//		kiểu nguyên thủy thì thay đổi cả 2 mảng
		System.out.println(Arrays.toString(arr1));	
		System.out.println(Arrays.toString(arr1_a));
		
//		copy mảng cách 2 - dùng hàm clone()
		int[] arr1_b = arr1.clone();
		arr1_b[0] = 50;
		System.out.println(Arrays.toString(arr1));	
		System.out.println(Arrays.toString(arr1_b));
		
//		copy mảng cách 3 - dùng System.arraycopy()
		int[] arr1_c = new int[arr1.length];
		System.arraycopy(arr1, 0, arr1_c, 0, arr1.length);
		arr1_c[0] = 80;
		System.out.println(Arrays.toString(arr1));	
		System.out.println(Arrays.toString(arr1_c));
		
//		=======================================
		System.out.println("=======================================");
//		kiểu đối tượng
		
		String[] mang_doi_tuong = {"phk", ".vn"};
//		copy mảng cách 1
		String[] mang_doi_tuong_a = mang_doi_tuong;
		mang_doi_tuong_a[0] = "100";
//		kiểu nguyên thủy thì thay đổi cả 2 mảng
		System.out.println(Arrays.toString(mang_doi_tuong));	
		System.out.println(Arrays.toString(mang_doi_tuong_a));
		
//		copy mảng cách 2 - dùng hàm clone()
		String[] mang_doi_tuong_b = mang_doi_tuong.clone();
		mang_doi_tuong_b[0] = "50";
		System.out.println(Arrays.toString(mang_doi_tuong));	
		System.out.println(Arrays.toString(mang_doi_tuong_b));
		
//		copy mảng cách 3 - dùng System.arraycopy()
		String[] mang_doi_tuong_c = new String[mang_doi_tuong.length];
		System.arraycopy(mang_doi_tuong, 0, mang_doi_tuong_c, 0, mang_doi_tuong.length);
		mang_doi_tuong_c[0] = "80";
		System.out.println(Arrays.toString(mang_doi_tuong));	
		System.out.println(Arrays.toString(mang_doi_tuong_c));
		
		
		
	}
}
