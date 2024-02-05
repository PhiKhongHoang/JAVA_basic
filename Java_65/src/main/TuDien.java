package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

public class TuDien {
//	private Map<String, String> duLieu = new TreeMap<String, String>(); // có thứ tự
	private Map<String, String> duLieu = new HashMap<String, String>(); // không thứ tự
	
//	1. Thêm từ (Từ khóa - Ý nghĩa)
	public String themTu(String tuKhoa, String yNghia) {
		return duLieu.put(tuKhoa, yNghia);
	}
	
//	2. Xóa từ
	public String xoaTu(String tuKhoa) {
		return duLieu.remove(tuKhoa); // sẽ xóa cả key lẫn value
	}
	
//	3. Tìm ý nghĩa từ khóa => tra từ
	public String traTu(String tuKhoa) {
		String yNghia = duLieu.get(tuKhoa);
		return yNghia;
	}
	
//	4. In danh sách từ khóa
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
//	5. In số lượng từ
	public int laySoLuongTuKhoa() {
		return duLieu.size();
	}
	
//	6. Xóa tất cả từ khóa
	public void xoatatCaTuKhoa() {
		duLieu.clear();
	}
	
	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------- Menu ----------");
			System.out.println("1. Thêm từ (Từ khóa - Ý nghĩa)");
			System.out.println("2. Xóa từ");
			System.out.println("3. Tìm ý nghĩa từ khóa => tra từ");
			System.out.println("4. In danh sách từ khóa");
			System.out.println("5. In số lượng từ");
			System.out.println("6. Xóa tất cả từ khóa");
			System.out.println("0. Thoát");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1) {
				String tuKhoa, yNghia;
				System.out.println("Nhập từ khóa: ");
				tuKhoa = sc.nextLine();
				System.out.println("Nhập ý nghĩa: ");
				yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
			} else if (luaChon == 2 || luaChon == 3) {
				String tuKhoa;
				System.out.println("Nhập từ khóa: ");
				tuKhoa = sc.nextLine();
				if(luaChon == 2)
					tuDien.xoaTu(tuKhoa);
				else
					System.out.println("Ý nghĩa: " + tuDien.traTu(tuKhoa));
			} else if (luaChon == 4) {
				tuDien.inTuKhoa();
			} else if (luaChon == 5) {
				System.out.println("Số lượng từ khóa: " + tuDien.laySoLuongTuKhoa());
			} else if (luaChon == 6) {
				tuDien.xoatatCaTuKhoa();
			}
		}while(luaChon != 0);
		
		
	}
}
