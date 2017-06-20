package Base;

import java.util.Scanner;

public class UocChungLonNhat {
	//tim uoc cung lon nhat dung de quy
	public static int ucln_dequy(int x, int y) {
		if (y == 0) {
			return x;
		} else
			return ucln_dequy(y, x % y);
	}

	//tim uoc chung lon nhat bang vong lap
	public static int ucln_loop(int a, int b){
		int c;
		while(b!=0){
			c = a%b;
			a = b;
			b = c;
		}
		return a;
	}
	public static void main(String[] agrs) {
		// chương trình tìm ước chung lớn nhất
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = s.nextInt();
		System.out.println("Nhap so b: ");
		b = s.nextInt();

		System.out.println("ucln dung vong lap la:"+ucln_loop(a, b));

		System.out.println("ucln dung de quy la: " + ucln_dequy(a, b));
	}
}
