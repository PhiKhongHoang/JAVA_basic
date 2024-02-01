
public class Main {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(1, 2, 2024);
		MyDate md2 = new MyDate(2, 2, 2024);
		MyDate md3 = new MyDate(1, 2, 2024);
		
//		System.out.println("Day: " + md1.getDay());
//		md1.setDay(10);
//		System.out.println("Day: " + md1.getDay());		
//		System.out.println("Date: " + md1);
		
		if(md1.equals(md3)) {
			System.out.println("md1 == md3");
		} else {
			System.out.println("md1 != md3");
		}
	}
}
