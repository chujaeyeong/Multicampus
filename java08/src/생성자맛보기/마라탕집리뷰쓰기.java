package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 마라탕집리뷰쓰기 {

	public void open() {
		
		JFrame f = new JFrame();
		f.setTitle("최고의마라탕집 리뷰 작성화면");
		f.setSize(660, 667);
		f.getContentPane().setBackground(Color.lightGray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", Font.BOLD, 25);
		Font font2 = new Font("D2Coding", Font.ITALIC, 30);

		JLabel date = new JLabel("주문 날짜 : ");
		JLabel menu = new JLabel("주문 음식 : ");
		JLabel content = new JLabel("리뷰 내용 : ");
		date.setFont(font);
		menu.setFont(font);
		content.setFont(font);
		
		JTextField dateText = new JTextField(34);
		나만의마라탕집3 place = new 나만의마라탕집3();
		JTextField menuText = new JTextField("마라탕: " + place.count1 + ", 마라샹궈: " + place.count2 + ", 꿔바로우: " + place.count3);
		dateText.setHorizontalAlignment(JTextField.CENTER);
		menuText.setHorizontalAlignment(JTextField.CENTER);
		dateText.setFont(font);
		menuText.setFont(font);
		
		JTextArea contentText = new JTextArea(14, 34);
		contentText.setFont(font);
		
		JButton btn = new JButton("리뷰 저장하기");
		btn.setFont(font2);
		btn.setForeground(Color.magenta);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String date2 = dateText.getText();
				String menu2 = menuText.getText();
				String content2 = contentText.getText();
				System.out.println(date2 + " " + menu2 + " " + content2);
				try {
					FileWriter file = new FileWriter(date2 + ".txt");
					file.write(date2 + "\n");
					file.write(menu2 + "\n");
					file.write(content2 + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "다음에도 또 주문해주세요 >_<");
					f.setVisible(false);
					
				} catch (IOException e1) {
					System.out.println("리뷰 저장에 문제가 발생했습니다.");
				}
			}
		});
		
		f.add(date); f.add(dateText);
		f.add(menu); f.add(menuText);
		f.add(content); f.add(contentText);
		f.add(btn);
		
		f.setVisible(true);
		
	}

}
