import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutExam extends JFrame {
	public GridLayoutExam() {
		super("GridLayout Exam");
		JTextField jtext = new JTextField(25);
		add(jtext);
		
		JPanel jp = new JPanel(new GridLayout(5, 4, 5, 5));
		String[] buttons = {
				"Cls", "Bck", "", "Close", 
				"7", "8", "9", "/", 
				"4", "5", "6", "*", 
				"1", "2", "3", "-", 
				"0", ".", "=", "+"
		};
		for(int i=0; i<buttons.length; i++) {
			if(i == 2) {
				jp.add(new JLabel());
			} else {
				jp.add(new JButton(buttons[i]));
			}
		}
		add(jp);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutExam();
	}
}
