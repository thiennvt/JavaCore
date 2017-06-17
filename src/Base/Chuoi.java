package Base;

public class Chuoi {

	public static void main(String[] args) {
		// xử lí chuỗi họ tên
		String hoten = "    Nguyễn     Văn     Thiện    ";
		System.out.println("Chuỗi chưa xử lí : " + hoten);

		// loại bỏ kí tự khoảng trằng ở hai đầu
		hoten = hoten.trim();
		System.out.println("Loại bỏ kí tự khoảng trắng ở hai đầu : " + hoten);

		// loại bỏ kí tự khoảng trắng
		String ch[] = hoten.split(" ");
		String result = "";
		for (String tu : ch) {
			if (tu.trim().length() != 0) {
				result += tu + " ";
			}

		}
		result = result.trim();
		// đếm số kí tự có trong chuỗi
		String chuoi = "Nguyễn Văn Thiện 140796";
		System.out.println("số kí tự có trong chuỗi là: " + chuoi.length());

		System.out.println("Họ tên sau khi chuẩn hóa : " + result);

		// đếm số kí tự hoa, thường , chữ số , có trong chuỗi
		char arr[] = chuoi.toCharArray();
		int chuso = 0;
		int chuhoa = 0;
		int chuthuong = 0;
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (Character.isUpperCase(c)) {
				chuhoa++;
			}
			if (Character.isLowerCase(c)) {
				chuthuong++;
			}
			if (Character.isDigit(c)) {
				chuso++;
			}

		}
		System.out.println("co " + chuso + " chu so trong mang");
		System.out.println("co " + chuhoa + " ki tu in hoa trong mang");
		System.out.println("co " + chuthuong + " ki tu thuong trong mang");

		// xử lí chuỗi
		String baihat = "d:/music/nhacvang/riengmotgoctroi.mp3";

		// chỉ lấy kí tự sau dấu /
		int vtchuoi = baihat.lastIndexOf("/");
		String tenbaihat = baihat.substring(vtchuoi + 1);
		System.out.println("Tên bài hát là: " + tenbaihat);

		// lấy tên bài hát khi loại bỏ đuôi .mp3
		int vtchuoidaucham = baihat.lastIndexOf(".");
		tenbaihat = baihat.substring(vtchuoi + 1, vtchuoidaucham);
		System.out.println("Tên bài hát khi loại bỏ đuôi .mp3 là : " + tenbaihat);
	}

}
