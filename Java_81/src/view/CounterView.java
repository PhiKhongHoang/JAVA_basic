package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value;
	
	public CounterView() {
		counterModel = new CounterModel();
		init();
		setVisible(true);
	}
	
	public void init() {
		setTitle("Counter");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		jButton_up = new JButton("Up");
		jButton_up.addActionListener(ac); // khi người ta nhấn nút này thì mình sẽ đi đến controller quản lí nút này
		
		jButton_down = new JButton("Down");
		jButton_down.addActionListener(ac);
		
		jLabel_value = new JLabel(counterModel.getValue() + "", JLabel.CENTER); // + "" để chuyển int về String
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		
		setLayout(new BorderLayout());
		add(jPanel, BorderLayout.CENTER);
	}
	
	public void tang() {
		counterModel.tang();
		jLabel_value.setText(counterModel.getValue() + ""); // gán lại giá trị cho jLabel_value
	}
	
	public void giam() {
		counterModel.giam();
		jLabel_value.setText(counterModel.getValue() + ""); // gán lại giá trị cho jLabel_value
	}
}
