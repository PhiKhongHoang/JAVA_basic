import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonExam extends JFrame {
	public JRadioButtonExam() {
		super("JRadioButton Exam");
		/**
		 * JRadioButton là lớp đối tượng thành phần kết hợp 
		 * với đối tượng Button Group cho phép chọn hoặc 
		 * hủy chọn 1 tùy chọn trong nhóm nhiều tùy chọn
		 */
		ButtonGroup bg = new ButtonGroup();
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		bg.add(male);
		bg.add(female);
		JPanel jp = new JPanel();
		jp.setPreferredSize(new Dimension(160, 100));
		jp.setBorder(
				BorderFactory.createTitledBorder("Male or Female?")
				);
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		jp.add(male);
		jp.add(female);
		add(jp);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JRadioButtonExam();
	}
}
