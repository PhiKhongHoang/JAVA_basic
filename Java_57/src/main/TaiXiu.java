/**
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt số tiền <= số tiền đang có.
 * Luật chơi:
 * 		- có 3 viên xúc xắc, mỗi viên có 6 mặt có giá trị từ 1->6. 
 * 		- mỗi lần lắc sẽ ra 1 kết quả. Kết quả = tổng 3 lần 
 * Tình huống:
 * 		- nếu tổng = 3 hoặc 18 => cái ăn hết, người chơi thua.
 * 		- nếu tổng từ 4->10 => xỉu
 * 		- nếu tổng từ 11->17 => tài
 */

package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 1000000;
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi", "VN"); // định dạng việt nam
//		NumberFormat numf = NumberFormat.getInstance(); // tạo số ngăn cách 3 số 0
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc); // tạo kí hiệu 'đ' của tiền VN
		
		int luaChon = 1;
		do {
			System.out.println("----------- Mời bạn lựa chọn -----------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Nhấn phím bất kì để thoát.");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("*** Bắt đầu chơi ***");
				
//				đặt cược
				System.out.println("****** Tài khoản của bạn: " +  numf.format(taiKhoanNguoiChoi) + " bạn muốn cược bao nhiêu?");
				double datCuoc = 0;
				do {
					System.out.println("Đặt cược (0 < số tiền cược <= " + numf.format(taiKhoanNguoiChoi) + "): ");
					datCuoc = sc.nextDouble();
				}while(datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
				
//				chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("**** Chọn (1) <-> Xỉu ****");
					System.out.println("**** Chọn (2) <-> Tài ****");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
//				tung xúc xắc
				Random xx1 = new Random();
				Random xx2 = new Random();
				Random xx3 = new Random();				
				int giaTri1 = xx1.nextInt(5) + 1; // rand từ 0->5
				int giaTri2 = xx2.nextInt(5) + 1; // rand từ 0->5
				int giaTri3 = xx3.nextInt(5) + 1; // rand từ 0->5
				
//				tính toán kết quả
				int tong = giaTri1 + giaTri2 + giaTri3;
				System.out.println("Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				if(tong == 3 || tong == 18) {
					System.out.println("Kết quả: " + tong);
					System.out.println("Cái ăn!");
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("**** Số dư: " + numf.format(taiKhoanNguoiChoi) + " ****");
				} else if (tong > 3 && tong < 11) {
					System.out.println("Kết quả: Xỉu");
					if(luaChonTaiXiu == 1) {
						System.out.println("Bạn thắng!");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("**** Số dư: " + numf.format(taiKhoanNguoiChoi) + " ****");
					} else {
						System.out.println("Bạn thua!");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("**** Số dư: " + numf.format(taiKhoanNguoiChoi) + " ****");						
					}
				} else if (tong > 10 && tong < 18) {
					System.out.println("Kết quả: Tài");
					if(luaChonTaiXiu == 2) {
						System.out.println("Bạn thắng!");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("**** Số dư: " + numf.format(taiKhoanNguoiChoi) + " ****");
					} else {
						System.out.println("Bạn thua!");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("**** Số dư: " + numf.format(taiKhoanNguoiChoi) + " ****");						
					}					
				}	
			}
		}while(luaChon == 1);
		
	}
}
