package main;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class TestFile {
	File file;
	public TestFile (String tenFile) {
		file = new File(tenFile);
	}
	
//	1. Kiểm tra file có thể thực thi.
	public boolean kiemTraThucThi() {
		return file.canExecute();
	}
	
//	2. Kiểm tra file có thể đọc.
	public boolean kiemTraDoc() {
		return file.canRead();
	}
	
//	3. Kiểm tra file có thể ghi.
	public boolean kiemTraGhi() {
		return file.canWrite();
	}
	
//	4. In đường dẫn.
	public void inDuongDan() {
		System.out.println(file.getAbsolutePath());
	}
	
//	5. In tên file.
	public void inTenFile() {
		System.out.println(file.getName());
	}
	
//	6. Kiểm tra file thư mục hoặc tập tin.
	public void kiemTraLaThuMucHayTepTin() {
		if(file.isDirectory()) {
			System.out.println("Folder");
		} else if(file.isFile()) {
			System.out.println("File");
		}
	}
	
//	7. In ra danh sách file con.
	public void inDanhSachFileCon() {
		if(file.isDirectory()) {
			System.out.println("Các tệp tin con: ");
			File mangCon[] = file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if(file.isFile()) {
			System.out.println("Đây là tệp tin không có dữ liệu bên trong!");
		}
	}
	
//	8. In cây thư mục. (dùng đệ quy)
	public void inCayThuMuc() {
		inChiTietCayThuMuc(file, 1);
	}
	
	public void inChiTietCayThuMuc(File f, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if(f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên file: ");
		String tenFile = sc.nextLine();
		TestFile testFile = new TestFile(tenFile);
		do {
			System.out.println("---------- Menu ----------");
			System.out.println("1. Kiểm tra file có thể thực thi.");
			System.out.println("2. Kiểm tra file có thể đọc.");
			System.out.println("3. Kiểm tra file có thể ghi.");
			System.out.println("4. In đường dẫn.");
			System.out.println("5. In tên file.");
			System.out.println("6. Kiểm tra file thư mục hoặc tập tin.");
			System.out.println("7. In ra danh sách file con.");
			System.out.println("8. In cây thư mục.");
			System.out.println("0. Thoát.");
			
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1: {
				System.out.println(testFile.kiemTraThucThi());
				break;
			}
			case 2: {
				System.out.println(testFile.kiemTraDoc());
				break;
			}
			case 3: {
				System.out.println(testFile.kiemTraGhi());
				break;
			}
			case 4: {
				testFile.inDuongDan();
				break;
			}
			case 5: {
				testFile.inTenFile();
				break;
			}
			case 6: {
				testFile.kiemTraLaThuMucHayTepTin();
				break;
			}
			case 7: {
				testFile.inDanhSachFileCon();
				break;
			}
			case 8: {
				testFile.inCayThuMuc();
				break;
			}
			default:
				break;
			}
		}while(luaChon != 0);
	}
}
