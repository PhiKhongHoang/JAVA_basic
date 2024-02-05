package main;

import java.io.File;
import java.io.IOException;

public class TestCreateFileAndFolder {
	public static void main(String[] args) {
//		Lưu ý: 
//			- win: dùng \\ => ex: "C:\\Thư mục 1\\thư mục 2\\tệp tin.xxx";
//			- mac: dùng /
		
//		kiểm tra file/folder tồn tại không
		File folder1 = new File("D:\\PKH\\JAVA_basic\\Java_67");
		File folder2 = new File("D:\\PKH\\JAVA_basic\\Java_68");
		System.out.println("Kiểm tra folder1 tồn tại hay không: " + folder1.exists());
		System.out.println("Kiểm tra folder2 tồn tại hay không: " + folder2.exists());
		
//		tạo folder
//		phương thức mkdir(): tạo 1 folder
		File d1 = new File("D:\\PKH\\JAVA_basic\\Java_67\\Directory_1");
		d1.mkdir();
//		phương thức mkdirs(): tạo nhiều folder cùng lúc
		File d2 = new File("D:\\PKH\\JAVA_basic\\Java_67\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
		d2.mkdirs();
		
		
//		tạo file (có phần mở rộng: .exe, .txt, .doc, ...)
		File file1 = new File("D:\\PKH\\JAVA_basic\\Java_67\\Directory_1\\vidu1.txt");
//		lí do phải try catch vì để kiểm tra quyền tạo file
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// không có quyền tạo file
			// full bộ nhớ
			// sai đường dẫn
			e.printStackTrace();
		}
		
		
		
	}
}
