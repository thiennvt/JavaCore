package Base;

import java.util.Scanner;

public class BoiChungNhoNhat {
	public static int bcnn(int a, int b){
		int x = a;
		int y = b;
		while(a!=b){
			if(a<=b){
				a+=x;
			}
			else
			{
				b+=y;
			}
		}
		return a;
	}
	
	public static void main(String[] agrs){
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = s.nextInt();
		System.out.println("Nhap so b: ");
		int b = s.nextInt();
		System.out.println("boi chung nho nhat cua hai so: a["+a+ ","+ b+"] la: "+bcnn(a, b));
	}
}
