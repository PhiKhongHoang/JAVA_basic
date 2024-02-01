
public class Main {
	public static void main(String[] args) {
		MyDate mydate = new MyDate(1, 2, 2024);
		System.out.println("Day: " + mydate.getDay());
		mydate.setDay(52);
		System.out.println("Day: " + mydate.getDay());
	}
}
