//controller: nơi lắng nghe sự kiện

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView ctv;
	
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand(); // lấy tên nút được ấn
		if(src.equals("UP")) {
			ctv.tang();
		} else if(src.equals("DOWN")) {
			ctv.giam();
		} else if(src.equals("RESET")) {
			ctv.reset();
		}
	}
	
}
