
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(1, 2);
		ToaDo td2 = new ToaDo(2, 2);
		ToaDo td3 = new ToaDo(3, 2);
		
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2, 10);
		Hinh h3 = new HinhChuNhat(td3, 2, 5);
		System.out.println(h1.tinhDienTich());;
		System.out.println(h2.tinhDienTich());;
		System.out.println(h3.tinhDienTich());;
	}
}
