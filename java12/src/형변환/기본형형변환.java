package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128~127 
		int i1 = 200; // 4바이트, -21억~21억 
		
		i1 = b1; // 큰 <- 작, 자동으로 형변환 (자동 형변환)
		b1 = (byte)i1; // 작 <- 큰, 강제로 형변환 (강제형변환)
		
		// 

	}

}
