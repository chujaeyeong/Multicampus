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

import 자바DB연결.BookDAO;

public class BookUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("책 등록 화면");
		f.setSize(550, 700);

		JLabel l1 = new JLabel("★ 내 책을 등록하세요! ★");
		JLabel l11 = new JLabel("=========================");
		JLabel l2 = new JLabel("책 ID");
		JLabel l3 = new JLabel("책 제목");
		JLabel l4 = new JLabel("책 저자");
		JLabel l5 = new JLabel("회원ID");
		JLabel l66 = new JLabel("=========================");

		JTextField t1 = new JTextField(12);
		JTextField t2 = new JTextField(12);
		JTextField t3 = new JTextField(12);
		JTextField t4 = new JTextField(12);

		JButton b1 = new JButton("책 정보 추가");
		JButton b2 = new JButton("책 정보 수정");
		JButton b3 = new JButton("책 정보 삭제");
		JButton b4 = new JButton("책 정보 검색");

		FlowLayout flow = new FlowLayout();

		Font font = new Font("Noto Sans", Font.BOLD, 35);

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
		f.add(l66);
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
		l66.setFont(font);
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

		// 책 정보 추가
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("책 정보를 등록 중입니다... ");
				String bookId = t1.getText();
				int bookId2 = Integer.parseInt(bookId);
				
				String bookTitle = t2.getText();
				String bookAuthor = t3.getText();
				String bookOwner = t4.getText(); // ""
				if (bookId.equals("")) { 
					JOptionPane.showMessageDialog(f, "책 ID는 필수입력 항목입니다.");
				}
				BookDAO dao = new BookDAO();

				// 1. 가방 만들기
				BookVO bag = new BookVO();

				// 2. 가방에 값 넣기
				bag.setBookId(bookId2);
				bag.setBookTitle(bookTitle);
				bag.setBookAuthor(bookAuthor);
				bag.setBookOwner(bookOwner);
				
				// 3. 값들이 들어있는 가방 전달 
				int result = dao.insert(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "책 등록 완료! ");
				} else {
					JOptionPane.showMessageDialog(f, "책 등록 실패, 값을 정확히 입력하세요! ");
				}
			}// action
		}); // b1

//				// 회원탈퇴처리
//				b2.addActionListener(new ActionListener() {
		//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						System.out.println("회원탈퇴 처리");
//						String id = t1.getText();
		//
//						BookDAO dao = new BookDAO();
//						int result = dao.delete(id);
//						if (result == 1) {
//							JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
//						} else {
//							JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
//						}
		//
//					} // action
//				}); // b2
		//
//				// 회원수정처리
//				b3.addActionListener(new ActionListener() {
		//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						System.out.println("회원수정 처리");
//						String id = t1.getText(); // 조건
//						String tel = t4.getText(); // 바뀌는 항목
		//
//						BookDAO dao = new BookDAO();
//						// 1. 가방을 만들자 
//						BookVO bag = new BookVO();
//						// 2. 가방에 값을 넣자
//						bag.setId(id);
//						bag.setTel(tel);
//						// 3. 가방을 전달하자 
//						int result = dao.update(bag);
//						if (result == 1) {
//							JOptionPane.showMessageDialog(f, "회원수정 성공");
//						} else {
//							JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
//						}
		//
//					} // action
//				}); // b3
//				
//				// MemberVO bag = new MemberVO();
//				// 벽돌 돌1 = new 벽돌틀()
//				// 벽돌 돌2 = new 벽돌틀()
//				
//				// 회원검색처리
//						b4.addActionListener(new ActionListener() {
		//
//							@Override
//							public void actionPerformed(ActionEvent e) {
//								System.out.println("회원탈퇴 처리");
//								String id = t1.getText();
		//
//								BookDAO dao = new BookDAO();
//								BookVO bag = dao.one(id); // MemberVO
//								if (bag != null) {
//									t2.setText(bag.getPw());
//									t3.setText(bag.getName());
//									t4.setText(bag.getTel());
//									t2.setBackground(Color.lightGray);
//									t3.setBackground(Color.lightGray);
//									t4.setBackground(Color.lightGray);
//								} else {
//									JOptionPane.showMessageDialog(f, "검색결과 없음!");
//									t2.setText("");
//									t3.setText("");
//									t4.setText("");
//								}
//								
		//
//							} // action
//						}); // b4

		
		
		f.setVisible(true);

	}

}
