package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO2;
import 자바DB연결.MemberDAO3;

public class MemberUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(570, 600);

		JLabel l1 = new JLabel("<<<<< 회원가입화면 >>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이 름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");


		// 회원가입처리
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText(); // ""
				if (id.equals("")) { // 기본형 4가지만 == 로 값을 비교 가능!
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				MemberDAO3 dao = new MemberDAO3();
				
				// 1. 가방 만들기 
				MemberVO bag = new MemberVO();
				
				// 2. 가방에 값 넣기 
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
				// 3. 값들이 들어있는 가방을 전달하자. 
				int result = dao.insert(bag);// 1 or 0
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요.");
				}
			}// action
		}); // b1

		// 회원탈퇴처리
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴 처리");
				String id = t1.getText();

				MemberDAO3 dao = new MemberDAO3();
				int result = dao.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
				}

			} // action
		}); // b2

		// 회원수정처리
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정 처리");
				String id = t1.getText(); // 조건
				String tel = t4.getText(); // 바뀌는 항목

				MemberDAO3 dao = new MemberDAO3();
				// 1. 가방을 만들자 
				MemberVO bag = new MemberVO();
				// 2. 가방에 값을 넣자
				bag.setId(id);
				bag.setTel(tel);
				// 3. 가방을 전달하자 
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
				}

			} // action
		}); // b3

		// f에 위에 있는 요소들을 add로 붙여주자
		// 붙이는 순서대로 물 흐르듯이 붙여주고싶다!
		// 물 흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트 설정하기 위해서 font 부품 필요
		Font font = new Font("Noto Sans", Font.BOLD, 40);

		/////////////// 필요한 부품(객체, Object)을 ram에 갖다놓고, 준비 끝 /////////////////
		// 조립을 시작해보자! //
		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.pink);
		t1.setForeground(Color.magenta);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.magenta);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.magenta);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.magenta);

		b1.setBackground(Color.LIGHT_GRAY);
		b1.setForeground(Color.ORANGE);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setForeground(Color.RED);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.PINK);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setForeground(Color.cyan);

		f.getContentPane().setBackground(Color.green);

		// 조립 시작

		// 맨 끝으로
		f.setVisible(true);

	}

}
