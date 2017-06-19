package Base;

import java.util.Scanner;

public class TimSoNguyenTo {
	public static int soNT(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		System.out.println("moi nhap mot so: ");
		int n = s.nextInt();
		if (soNT(n) == 1) {
			System.out.println(n + " la so nguyen to");
		} else
			System.out.println(n + " khong la so nguyen to");
	}
}
