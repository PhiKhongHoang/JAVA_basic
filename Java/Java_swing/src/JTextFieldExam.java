import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldExam extends JFrame {
	public JTextFieldExam() {
		super("JTextField Exam");
//		Tạo JLabel user 
		JLabel userLabel = new JLabel("Username");
//		tạo JTextField user 
		JTextField userText = new JTextField(20);
//		tạo label pass
		JLabel passLabel = new JLabel("Passwork");
//		tạo JPassworkField pass
		JPasswordField passText = new JPasswordField(20);
//		tạo image icon
		ImageIcon icon = new ImageIcon("D:\\PKH\\Java\\Java_swing\\helloKitty.png");
//		tạo JButton
		JButton login = new JButton(icon);
		
		add(userLabel);
		add(userText);
		add(passLabel);
		add(passText);
		add(login);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JTextFieldExam();
	}
}
