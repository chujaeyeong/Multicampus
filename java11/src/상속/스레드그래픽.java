package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	
	JLabel count, image, time; // 전역변수 선언 
	
	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽(); // 1
		// 객체생성시 클래스 이름과 동일한 메서드를 자동호출 
		// ==> 생성자 메서드를 자동 호출 
	}
	
	public 스레드그래픽() { // 2
		setTitle("내 스레드 그래픽");
		setSize(500, 250);
		getContentPane().setBackground(Color.pink);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("D2Coding", Font.BOLD, 30);
		count = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		count.setFont(font);
		time.setFont(font);
		add(count);
		add(image);
		add(time);
		
		// 스레드 객체 3개 만들어서 스타트 
		카운트스레드2 count2 = new 카운트스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2();
		
		count2.start();
		image2.start();
		time2.start();
		
		setVisible(true);
	}
	
	// 내부클레스 (inner class) ==> 전역변수를 공유할 목적으로 사용함 
	// 
	public class 카운트스레드2 extends Thread { //run()

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>> " + i);
				try {
					Thread.sleep(2000); //2초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText(date + "");
				try {
					Thread.sleep(1000); //1초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] images = { "1.png", "2.png", "3.png", "4.png", "5.png", "1.png", "2.png", "3.png", "4.png",
					"5.png", "1.png", "2.png", "3.png", "4.png", "5.png", "1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); // 5초재워라! //ms(밀리세컨즈)
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	
} // class
