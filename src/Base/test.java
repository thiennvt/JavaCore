package Base;

import java.util.Scanner;

public class test {
	public static void noibot(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[j] > a[i]) {
					int tg = a[j];
					a[j] = a[i];
					a[i] = tg;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void luachon(int a[], int n) {
		int m;
		for (int i = 0; i < n - 1; i++) {
			m = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[m]) {
					m = j;
					if (m != i) {
						int tg = a[m];
						a[m] = a[i];
						a[i] = tg;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// tim uclln
	public static int ucln(int a, int b) {
		if (b == 0) {
			return a;
		} else
			return ucln(b, a % b);
	}

	// cachs khac
	public static int ucln_loop(int a, int b) {
		int c;
		while (b != 0) {
			c = a%b;
			a = b;
			b = c;
		}
		return a;
	}

	//tim so nguyen to
	public static int sont(int a){
		for(int i = 2;i<=Math.sqrt(a);i++){
			if(a%i==0){
				return 0;
			}
		}
		return 1;
	}
	//tim boi chung nho nhat cua 2 so
	public static int bcnn(int a,int b){
		int x = a;
		int y = b;
		while(a!=b){
			if(a<=b){
				a +=x;
			}
			else 
				b+=y;
		}
		return a;
	}
	public static void main(String[] ages) {
		System.out.println("sap xep noi bot: ");
		int[] a = { 10, 32, 123, 4, 3, 6, 67, 7, 543, 34, 3 };
		noibot(a, 10);
		System.out.println();
		luachon(a, 10);
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("nhap so a: ");
		int b = s.nextInt();
		System.out.println("nhap so b: ");
		int c = s.nextInt();

		System.out.println("ucln " + ucln(b, c));

		System.out.println();System.out.println("ucln bang vong lap la:"+ucln_loop(b, c));
		
		System.out.println("kiem tra so nguyen to");
		if(sont(b)==1){
			System.out.println(b+" la so nguyen to");
		}
		else 
		System.out.println("so "+b+" khong la so nguyen to");
		System.out.println("boi chung nho nhat cua  hai so a["+b+","+c+"]"+bcnn(b, c));
	}
}
