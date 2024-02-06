package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestXoaFile {
	public static void xoaFile(File fx) {
		if(fx.isFile()) {// nếu là file thì xóa
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			fx.delete();
		}
		else if(fx.isDirectory()) { 
			File[] mangCon = fx.listFiles(); // lấy các file con
			for (File file : mangCon) {
				xoaFile(file); // xóa các file con
			}
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			fx.delete(); // xóa bản thân thư mục sau khi đaã xóa các file con
		}
	}

	public static void xoaFile2(File fx) {
		Path p = fx.toPath();
		if(fx.isFile()) {// nếu là file thì xóa
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			try {
				Files.delete(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(fx.isDirectory()) { 
			File[] mangCon = fx.listFiles(); // lấy các file con
			for (File file : mangCon) {
				xoaFile2(file); // xóa các file con
			}
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			try {
				Files.delete(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
//		sử dụng class File xóa tệp tin or thư mục
		File f0 = new File("D:\\PKH\\JAVA_basic\\Java_69\\F0");
		File f0_1 = new File("D:\\PKH\\JAVA_basic\\Java_69\\F0_1");
		File f_vidu = new File("D:\\PKH\\JAVA_basic\\Java_69\\vidu.txt");
//		
//		f0.deleteOnExit(); // không xóa được vì folder không rỗng
//		f0_1.deleteOnExit(); // Phải là folder rỗng mới xóa được
//		f_vidu.deleteOnExit(); // nếu file đang mở thì không xóa được
//		TestXoaFile.xoaFile(f0);
		

//		sử dụng class Files xóa tệp tin or thư mục
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f_vidu.toPath();
		try {
//			Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestXoaFile.xoaFile2(f0);
	}
}
