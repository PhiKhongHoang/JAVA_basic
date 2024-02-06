//không dùng tên phương thức là show vì nó trùng tên với 1 phương thức trong JF
package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // thoát chương trình khi ấn x ở giao diện
	}
	
	public void showIt() { 
		setVisible(true); // là this.setVisible(true);
	}
	
	public void showIt(String title) {
		setTitle(title);
		setVisible(true);
	}
	
	public void showIt(String title, int x, int y) {
		setTitle(title);
		setSize(x ,y);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
//		m1.showIt();
//		m1.showIt("test");
		m1.showIt("test", 300, 300);
	}
}
