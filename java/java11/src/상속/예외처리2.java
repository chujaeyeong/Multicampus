package 상속;

import java.io.FileWriter;

public class 예외처리2 {

	public static void main(String[] args) {
		FileWriter file = new FileWriter("test.txt");
		try {
			file.write("안녕\n");
			file.write("바이바이\n");
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
