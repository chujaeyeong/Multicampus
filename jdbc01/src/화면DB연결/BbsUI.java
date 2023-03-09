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

import 자바DB연결.BbsDAO;
import 자바DB연결.MemberDAO3;

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(560, 700);

		JLabel l1 = new JLabel("<<<<< 나의 게시판 >>>>>");
		JLabel l11 = new JLabel("============================");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 글쓴이");

		JTextField t1 = new JTextField(18);
		JTextField t2 = new JTextField(18);
		JTextField t3 = new JTextField(18);
		JTextField t4 = new JTextField(18);

		JButton b1 = new JButton("게시물 글쓰기처리");
		JButton b2 = new JButton("게시물 삭제 처리");
		JButton b3 = new JButton("게시물 수정 처리");
		JButton b4 = new JButton("게시물 검색 처리");

		// f에 위에 있는 요소들을 add로 붙여주자
		// 붙이는 순서대로 물 흐르듯이 붙여주고싶다!
		// 물 흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트 설정하기 위해서 font 부품 필요
		Font font = new Font("Noto Sans", Font.BOLD, 30);

		/////////////// 필요한 부품(객체, Object)을 ram에 갖다놓고, 준비 끝 /////////////////
		// 조립을 시작해보자! //
		f.setLayout(flow);

		f.add(l1);
		f.add(l11);
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
		l11.setFont(font);
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
		b1.setForeground(Color.cyan);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setForeground(Color.cyan);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.cyan);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setForeground(Color.cyan);

		f.getContentPane().setBackground(Color.green);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 글쓰기처리");
				String no = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText(); // ""
				if (no.equals("")) { // 기본형 4가지만 == 로 값을 비교 가능!
					JOptionPane.showMessageDialog(f, "게시판 번호는 필수입력항목입니다.");
				}
				BbsDAO dao = new BbsDAO();
				
				// 1. 가방 만들기 
				BbsVO bag = new BbsVO();
				
				// 2. 가방에 값 넣기 
				bag.setNo(0);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				// 3. 값들이 들어있는 가방을 전달하자. 
				int result = dao.insert(bag);// 1 or 0
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "게시판 글쓰기 성공");
				} else {
					JOptionPane.showMessageDialog(f, "글쓰기 실패, 재입력해주세요.");
				}
			}// action
		}); // b1

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시판검색처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				
				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.one(no2);
				if (bag != null) {
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
					t2.setBackground(Color.lightGray);
					t3.setBackground(Color.lightGray);
					t4.setBackground(Color.lightGray);
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 없음!");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}

			}
		});

		// 조립 시작

		// 맨 끝으로
		f.setVisible(true);

	}

}
