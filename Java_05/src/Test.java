/* có 2 kiểu dữ liệu:
	- Nguyên thủy: 
		byte
		short
		int
		long
		double
		boolean 
		char
	- Đối tượng: 
		String
		Array
		Double
*/
public class Test {
	public static void main(String[] args) {
		String course = "Lập trình Java";
		int year = 2024;
		double price = 10.5;
		boolean yes_no = true;
		char source = 'J';
		
		System.out.println("Tên sách: " + course);
		System.out.println("Năm xuất bản: " + year);
		System.out.println("Giá: " + price);
		System.out.println("Còn/hết: " + yes_no);
		System.out.println("Mã sách: " + source);
	}
}
