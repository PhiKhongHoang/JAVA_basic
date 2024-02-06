package view;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
//		set title
		jf.setTitle("Ví dụ JFrame");
		
//		set size
		jf.setSize(600, 400);	
		
//		gán vị trí hiển thị
		jf.setLocation(300, 300);
		
//		thoát chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
//		hiển thị 
		jf.setVisible(true); 
	}
}
