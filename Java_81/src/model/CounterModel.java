package model;

public class CounterModel {
	private int value;
	
	public CounterModel() {
		value = 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void tang() {
		value++;
	}
	
	public void giam() {
		value--;
	}
	
	public void reset() {
		value = 0;
	}
}
