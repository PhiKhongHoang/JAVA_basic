package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class TestFlowLayout extends JFrame{
	public TestFlowLayout() {
		setTitle("Flow layout");
		setSize(600, 400);
		
//		hiển thị giữa của sổ chương trình
		setLocationRelativeTo(null); 
		
//		set layout
//		FlowLayout flowLayout = new FlowLayout();
//		FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
//		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 50, 100);
		setLayout(flowLayout);
		
//		create button
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		
//		add thành phần
		add(jb1);
		add(jb2);
		add(jb3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFlowLayout();
	}
}
