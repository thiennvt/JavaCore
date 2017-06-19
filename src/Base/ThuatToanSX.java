package Base;

public class ThuatToanSX {
	public static void luachon(int a[], int n) {
		int m;
		for (int i = 0; i < n - 1; i++) {
			m = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[m])
					m = j;
				if (m != i) {
					int tg = a[i];
					a[i] = a[m];
					a[m] = tg;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void noibot(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[j] > a[i]) 
				{
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

	public static void main(String[] agrs) {
		int[] b = { 12, 4, 5, 8, 23, 67, 43, 2, 89, 5 };
		System.out.println("sap xep theo thuat toan lua chon");
		luachon(b, 10);
		System.out.println();
		System.out.println("sap xep theo thuat toan noi bot");
		noibot(b, 10);
	}
}
