import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListenerExam extends JFrame implements ActionListener, MouseMotionListener {
	private JTextField jt;
	
	public ListenerExam() {
		super("Listener example");
		JLabel j1 = new JLabel("Email address");
		jt = new JTextField(25);
		JButton send = new JButton("Send");
		
//		đăng kí lắng nghe sự kiện click lên nút send
		send.addActionListener(this);
//		đăng kí lắng nghe sự kiện rê chuột tới send
		send.addMouseMotionListener(this);
		
		add(j1);
		add(jt);
		add(send);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new ListenerExam();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		jt.setBackground(Color.white);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		jt.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(rootPane, "Email address: " + jt.getText(), "Notification", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}
