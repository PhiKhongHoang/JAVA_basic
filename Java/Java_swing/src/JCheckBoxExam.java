import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCheckBoxExam extends JFrame{
	public JCheckBoxExam() {
		super("JCheckBox Exam");
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		JLabel j1 = new JLabel("Your hobby");
		jp2.add(j1);
		
//		JCheckBox
		JCheckBox jch1 = new JCheckBox("Listen classic music");
		JCheckBox jch2 = new JCheckBox("Play football");
		JCheckBox jch3 = new JCheckBox("Travel");
		jp2.add(jch1);
		jp2.add(jch2);
		jp2.add(jch3);
		
		add(jp2);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JCheckBoxExam();
	}
}
