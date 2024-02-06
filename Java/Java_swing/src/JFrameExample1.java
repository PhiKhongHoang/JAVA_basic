//tạo ra 1 lớp kế thừa lớp JFrame
import javax.swing.JFrame;

public class JFrameExample1 extends JFrame {
	
	public JFrameExample1() {
//		thiết lập Frame có tiêu đề JFrameExample1
		super("JFrameExample1");
		
//		thiết lập kích thước Frame
		setSize(300, 300);
		
//		cho phép Frame hiển thị
		setVisible(true);
		
//		thoát chương trình khi tắt giao diện
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JFrameExample1();
	}
	
}
