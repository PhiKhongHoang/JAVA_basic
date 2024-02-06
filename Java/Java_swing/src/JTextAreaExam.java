import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaExam extends JFrame {
	public JTextAreaExam() {
		super("JTextArea Exam");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l1 = new JLabel("Email");
		add(l1);
		JTextField jText = new JTextField(25);
		add(jText);
		JLabel l2 = new JLabel("Message");
		add(l2);
		
//		tạo JTextArea
		JTextArea jtextArea = new JTextArea(20, 25);
//		đưa JTextArea vào khung trượt
		JScrollPane jscroll = new JScrollPane(jtextArea);
		add(jscroll);
		JButton send = new JButton("Send");
		add(send);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JTextAreaExam();
	}
}
