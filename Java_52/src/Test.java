// phương thức chuyển đổi lớp String
public class Test {
	public static void main(String[] args) {
		 String s1 = "pKh";
		 String s2 = ".Vn";
		 String s3 = s1 + s2;
		 
//		 hàm concat => nối chuỗi
		 String s4 = s1.concat(s2); 
		 System.out.println("s3 = " + s3);
		 System.out.println("s4 = " + s4);
		 
//		 hàm replace => thay thế
		 String s5 = "phi";
		 String s6 = s5.replaceAll("i", "k");
		 System.out.println("s5 = " + s5);
		 System.out.println("s6 = " + s6);
		 
//		 hàm toLowerCase => chuyển về chữ thường
//		 hàm toUpperCase => chuyển về chữ thường
		 String s7 = s3.toLowerCase();
		 String s8 = s3.toUpperCase();
		 System.out.println(s7);
		 System.out.println(s8);
		 
//		 hàm trim => xóa bỏ khoảng trắng dư thừa 2 đầu chuỗi
		 String s9 = " Xin chào!         ";
		 String s10 = s9.trim();
		 System.out.println(s10);
		 
//		 hàm toCharArray => chuyển string thành array chứa từng kí tự
		 
//		 hàm subString => cắt chuỗi con
		 String s11 = "Phi Hoàng Khổng";
		 String s12 = s11.substring(4);
		 String s13 = s11.substring(4, 10);
		 System.out.println(s12);
		 System.out.println(s13);
		 
		 
		 
		 
		 
	}
}
