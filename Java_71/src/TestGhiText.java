import java.io.PrintWriter;

public class TestGhiText {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:\\PKH\\JAVA_basic\\Java_71\\file.txt", "UTF-8");
			pw.println("Xin chào, tôi là PKH");
			pw.print("Dữ liệu: ");
			pw.println(3.14);
			
			Student st = new Student(100, "Phi Khong Hoang");
			pw.println(st);
			
			pw.flush(); // đẩy dữ liệu xuống file
			pw.close(); // đóng file
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
