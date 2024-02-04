// phương thức so sánh lớp String
public class Test {
	public static void main(String[] args) {
		String s1 = "PKH";
		String s2 = "pkh";
		String s3 = "PKH";

//		hàm equals => kiểm tra 2 chuỗi giống nhau (phân biệt hoa thường)
		System.err.println(s1.equals(s2));
		System.err.println(s1.equals(s3));
		
//		hàm equalsIgnoreCase => kiểm tra 2 chuỗi giống nhau (không phân biệt hoa thường)
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
//		hàm compareTo => so sánh (chuỗi, đối tượng, ....) > < =
		String sv1 = "Nguyễn văn a";
		String sv2 = "Nguyễn văn b";
		String sv3 = "Nguyễn văn";
		String sv4 = "Nguyễn văn A";
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
//		hàm compareToIgnoreCase => so sánh (chuỗi, đối tượng, ....) > < = (Không pb hoa thường)
		
//		hàm regionMatches => so sánh 1 đoạn
		String r1 = "titv.vn";
		String r2 = "tv.v";
		boolean check = r1.regionMatches(2, r2, 0, 4); // so sánh từ kí tự thứ 2 ở r1 với 4 kí tự ở r2 từ 0->4
		System.out.println(check);

//		hàm regionMatchesIgnoreCase => so sánh 1 đoạn (Không phân biệt hoa thường)
		
//		hàm startsWith => hàm kiểm tra chuỗi bắt đầu bằng .....
		String sdt = "0962 653 118";;
		System.out.println(sdt.startsWith("0962"));
		System.out.println(sdt.startsWith("0985"));

//		hàm endsWith => hàm kiểm tra chuỗi kết thúc bằng .....
		String fileName = "love.pdf";;
		if(fileName.endsWith(".pdf"))
			System.out.println("Đây là file pdf!");
		else
			System.out.println("Không phải file pdf!");

	}
}
