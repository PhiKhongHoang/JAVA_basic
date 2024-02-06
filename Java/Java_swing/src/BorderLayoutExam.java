import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BorderLayoutExam extends JFrame {
	public BorderLayoutExam() {
		super("BorderLayout Exam");
		this.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l1 = 
				new JLabel("please enter the sentence");
		JTextField jt = new JTextField(20);
		p1.add(l1);
		p1.add(jt);
		this.add(p1, BorderLayout.NORTH);
		
		JTextArea ta = new JTextArea(10, 10);
		this.add(ta, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton b2 = new JButton("Ok");
		p2.add(b2);
		this.add(p2, BorderLayout.SOUTH);
		
		this.setSize(500, 400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutExam();
	}
} 
