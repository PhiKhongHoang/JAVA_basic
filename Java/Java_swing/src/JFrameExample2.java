//tạo JFrame trực tiếp từ lớp JFrame

import javax.swing.JFrame;

public class JFrameExample2 {
	public static void main(String[] args) {
//		tạo JFrame
		JFrame f = new JFrame("JFrameExample2");

//		thiết lập kích thước Frame
		f.setSize(300, 300);
		
//		cho phép Frame hiển thị
		f.setVisible(true);
		
//		thoát chương trình khi tắt giao diện
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
