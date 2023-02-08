package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문버튼 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 버튼 3개");
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 버튼 4개 만들기
		JButton b1 = new JButton();
		b1.setText("별10개");
		JButton b2 = new JButton();
		b2.setText("커피*5");
		JButton b3 = new JButton();
		b3.setText("커피*우유3개");
		JButton b4 = new JButton();
		b4.setText("1:짱!");
		
		Font font = new Font("D2Coding", 1, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		// 1. 버튼에 액션 기능을 추가하겠다고 설정
		// 2. 클릭액션이 있을 때, 어떤 부품이 액션 처리를 어떻게 할 지 코딩해주면됨
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 처리 내용을 여기에 써주세요!
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " : 짱!"); 
				}
				
			}
		});
		
		
		
		
		
		
		// 버튼 배경, 글자색, 폰트 지정
		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		
		
		
		f.setVisible(true);
		
	}

}
