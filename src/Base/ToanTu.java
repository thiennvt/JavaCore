package Base;

import java.util.Calendar;

public class ToanTu {

	public static void main(String[] args) {
		/*postfix và prefix
		 * postfix: ++ hoặc -- nằm đằng sau 
		 * prefix: ++ hoặc -- nằm trước 
		 * ví dụ : x=5; y=7
		 * int z = x++ + ++y - 8   
		 * các buớc sử lí:
		 * Buớc 1: Ưu tiên xử lí prefix truớc (vị trí ++ or -- nằm phía trước)
		 * Buớc 2: Xử lí các phép toán còn lại
		 * Buớc 3: gán giá trị cho vế trái dấu đằng trước 
		 * Buớc 4: sau đó mới làm postfix
		 * kq: y=8;x=6;z=5
		 * */
		int x=5, y=7;
		int z = x++ + ++y -8;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
