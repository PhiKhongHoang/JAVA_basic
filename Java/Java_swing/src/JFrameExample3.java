//JPanel là thành phần được sử dụng 
// để nhóm các thành phần lại với nhau
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExample3 extends JFrame {
	public JFrameExample3() {
		super("JFrameExample3");
		
//		tạo JPanel
		JPanel jp = new JPanel();
		
//		tạo JLabel
		JLabel jl = new JLabel("Username");		
//		thêm JLabel vào JPanel
		jp.add(jl);
		
//		tạo JTextField
		JTextField jf = new JTextField(20);
//		thêm JTextField vào JPanel
		jp.add(jf);
		
//		thêm JPanel vào JFrame
		add(jp);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JFrameExample3();
	}
}
