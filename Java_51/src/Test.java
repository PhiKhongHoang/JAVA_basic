//phương thức lập chỉ mục lớp String
public class Test {
	public static void main(String[] args) {
		String s1 = "Xin chào, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c = 'à';
		
//		hàm indexOf => trả về vị trí lần đầu xuất hiện (phân biệt hoa thường)
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf(s3));		
		System.out.println(s1.indexOf(s2, 2)); // tìm bắt đầu từ vị trí số 2
		System.out.println(s1.indexOf(c));	
		
//		hàm lastIndexOf => tìm kiếm từ phải sang trái
		System.out.println(s1.lastIndexOf(s2));
		System.out.println(s1.lastIndexOf(s3));	
		
	}
}
