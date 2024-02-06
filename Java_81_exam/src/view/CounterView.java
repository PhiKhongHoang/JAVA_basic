//view: hiển thị giao diện người dùng có thể thực thi (di chuột, ấn, điền...)

package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel ctm;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel_value;
	
	public CounterView() {
		ctm = new CounterModel();
		init();
		setVisible(true);
	}
	
	public void init() {
		setTitle("Counter");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this); // nghe sự kiện 
		
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);
		
		jButton_reset = new JButton("RESET");
		jButton_reset.addActionListener(ac);
		
		jLabel_value = new JLabel(ctm.getValue() + "", JLabel.CENTER);
		
//		phần trên
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jButton_down, BorderLayout.EAST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		
//		phần reset
		JPanel jPanel_reset = new JPanel();
		jPanel_reset.setLayout(new FlowLayout());
		jPanel_reset.add(jButton_reset);
		
//		set chung
		setLayout(new BorderLayout());
		add(jPanel, BorderLayout.CENTER);
		add(jPanel_reset, BorderLayout.SOUTH);
	}
	
	public void tang() {
		ctm.tang();
		jLabel_value.setText(ctm.getValue() + "");
	}

	public void giam() {
		ctm.giam();
		jLabel_value.setText(ctm.getValue() + "");
	}

	public void reset() {
		ctm.reset();
		jLabel_value.setText(ctm.getValue() + "");
	}
}
