import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelExam extends JFrame {
	public JLabelExam() {
		super("JLabelExam");
		
//		tạo Label
		JLabel l1 = new JLabel("Hello kitty");
//		canh Lable: top, center, bottom
		l1.setVerticalAlignment(JLabel.TOP);
//		thiết lập chiều dài, chiều cao
		l1.setPreferredSize(new Dimension(60, 100));
		add(l1);
		
//		tạo imageIcon
		ImageIcon icon = new ImageIcon("D:\\PKH\\Java\\Java_swing\\helloKitty.png");
//		tạo JLabel có chuỗi và ảnh
		JLabel l2 = 
				new JLabel("Hello Kitty", icon, JLabel.LEFT);
		add(l2);
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JLabelExam();
	}
}