package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView ctv;
	
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	
//	lắng nghe thao tác người dùng
	@Override
	public void actionPerformed(ActionEvent e) { 
		String src = e.getActionCommand(); // lấy tên nút được ấn
		System.out.println("Bạn đã nhấn: " + src);
		
		if(src.equals("Up")) {
			ctv.tang();
		} else if(src.equals("Down")) {
			ctv.giam();
		}
	}

}
