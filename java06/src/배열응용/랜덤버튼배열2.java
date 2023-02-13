package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 만들자 	
		// 2. 프레임을 설정하고 실행하자 (눈으로 확인)
		// 	  레이아웃 부품 설정하지 않음! 
		// 3. 버튼을 넣을 배열을 만들자 
		// 4. 버튼을 500개 만들어서 배열에 넣자 
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙이자 
		// 심화1) 버튼 색을 몇가지 지정해서 임의로 설정 
		// 심화2) f에 배경색으로 넣자 
		
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setLayout(null);
		
		JButton[] button = new JButton[500];
		// colors[r.nextInt(colors.length)] // 0 ~ 5 
		Random r = new Random(42);
		Color[] colors = {Color.red, Color.blue, Color.gray, Color.green, Color.orange};
		
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼이당" + i);
			int x = r.nextInt(900); // 가로위치 
			int y = r.nextInt(900); // 세로위치 
			button[i].setBounds(x, y, 100, 50);
			button[i].setBackground(Color.pink);

			button[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(button[i]);
			
		}

	
		
		f.setVisible(true);
	}

}
