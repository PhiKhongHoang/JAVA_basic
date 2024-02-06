package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class TestBorderLayout extends JFrame{
	public TestBorderLayout() {
		setTitle("Border layout");
		setSize(600, 400);
		
//		hiển thị giữa của sổ chương trình
		setLocationRelativeTo(null); 
		
//		set layout
		BorderLayout borderLayout = new BorderLayout();
//		BorderLayout borderLayout = new BorderLayout(15, 15);
		setLayout(borderLayout);
		
//		create button
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		
//		add thành phần
		add(jb1, borderLayout.NORTH);
		add(jb2, borderLayout.SOUTH);
		add(jb3, borderLayout.WEST);
		add(jb4, borderLayout.EAST);
		add(jb5, borderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestBorderLayout();
		System.out.println("hiih");
	}
}
