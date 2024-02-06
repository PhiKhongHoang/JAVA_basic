import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxExam extends JFrame {
	public JComboBoxExam() {
		super("JComboBox Exam");
		JLabel j1 = new JLabel("Choose your class");
		Object[] obj = {"vn-01", "vn-02", "vn-03", "vn-04" };
		JComboBox jcom = new JComboBox(obj);
		add(j1);
		add(jcom);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JComboBoxExam();
	}
}
