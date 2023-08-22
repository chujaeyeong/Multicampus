package 생성자맛보기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나만의마라탕집 {

	static int count; //0으로 초기화, 전역변수!
	final static int PRICE = 10000; //final은 변경불가, 상수
	//상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!

	public static void main(String[] args) {

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("최고로맛있는마라탕집");
		f.setSize(660, 667);
		f.getContentPane().setBackground(Color.pink);

		JButton b1 = new JButton("마라탕");
		JButton b2 = new JButton("마라샹궈");
		JButton b3 = new JButton("꿔바로우");
		Font font = new Font("D2Coding", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		JLabel textLabel = new JLabel("개수 : ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.jpeg");
		imgLabel.setIcon(icon);

		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("006.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 : " + (count * PRICE) + "원");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("007.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 : " + (count * PRICE) + "원");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("008.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 : " + (count * PRICE) + "원");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
