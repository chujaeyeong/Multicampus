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
		f.setSize(550, 720);

		JLabel l1 = new JLabel("내 책을 등록하세요!");
		JLabel l11 = new JLabel("✱*.｡:｡✱*.:｡✧*.｡✰*.:｡✧*.｡:｡*.｡✱");
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
		JButton b4 = new JButton("책 등록여부 검색");

		JLabel l77 = new JLabel("=========================");

		JButton b5 = new JButton(" 저장된 전체 책 리스트 보기 ");

		FlowLayout flow = new FlowLayout();

		Font font = new Font("Noto Sans", Font.BOLD, 35);
		Color c1 = new Color(255, 217, 204); // 배경색 (연한 코랄색)
		Color c2 = new Color(153, 38, 0); // l1색 
		Color c3 = new Color(204, 153, 255); // l11, l66, l77

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
		f.add(l77);
		f.add(b5);

		l1.setFont(font);
		l11.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l66.setFont(font);
		l77.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		l1.setForeground(c2);
		l11.setForeground(c3);
		l66.setForeground(c3);
		l77.setForeground(c3);

		t1.setBackground(Color.pink);
		t1.setForeground(Color.magenta);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.magenta);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.magenta);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.magenta);

		b1.setForeground(Color.ORANGE);
		b2.setForeground(Color.RED);
		b3.setForeground(Color.PINK);
		b4.setForeground(Color.cyan);
		b5.setForeground(Color.blue);

		f.getContentPane().setBackground(c1);

		// 책 정보 추가 (insert)
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
			} // action
		}); // b1

		// 책 정보 수정 (update)
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("책 정보 수정");

				String bookId = t1.getText();
				int bookId2 = Integer.parseInt(bookId); // 업데이트할 때 넣어야하는 조건 1
				String bookOwner = t4.getText(); // 업데이트할 때 넣어야하는 조건 2

				String bookTitle = t2.getText(); // 업데이트해야하는 데이터 1
				String bookAuthor = t3.getText(); // 업데이트해야하는 데이터 2

				BookDAO dao = new BookDAO();

				// 1. 가방 만들기
				BookVO bag = new BookVO();

				// 2. 가방에 값 넣기
				bag.setBookId(bookId2);
				bag.setBookTitle(bookTitle);
				bag.setBookAuthor(bookAuthor);
				bag.setBookOwner(bookOwner);

				// 3. 가방을 전달하자
				int result = dao.update(bag);
				if (result == 1) {
					t2.setBackground(Color.lightGray);
					t3.setBackground(Color.lightGray);
					JOptionPane.showMessageDialog(f, "책 정보 수정 성공! ");
				} else {
					JOptionPane.showMessageDialog(f, "책 정보 수정 실패, 재입력해주세요.");
				}

			} // action
		}); // b2

		// 책 정보 삭제
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("책 정보 삭제 처리");

				String bookId = t1.getText();
				int bookId2 = Integer.parseInt(bookId); // 삭제할 때 넣어야하는 조건 1
				String bookOwner = t4.getText(); // 삭제할 때 넣어야하는 조건 2

				BookDAO dao = new BookDAO();

				// 1. 가방 만들기
				BookVO bag = new BookVO();

				// 2. 가방에 값 넣기
				bag.setBookId(bookId2);
				bag.setBookOwner(bookOwner);

				// 3. 가방을 전달하자
				int result = dao.delete(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "책 정보 삭제 성공! ");
				} else {
					JOptionPane.showMessageDialog(f, "책 정보 삭제 실패, 책 ID를 정확하게 입력하세요. ");
				}

			} // action
		}); // b3

		// 책ID로 책 등록여부 검색
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("책 정보 검색 처리");
				String bookId = t1.getText();
				int bookId2 = Integer.parseInt(bookId);

				BookDAO dao = new BookDAO();
				BookVO bag = dao.one(bookId2);
				if (bag != null) {
					t2.setText(bag.getBookTitle());
					t3.setText(bag.getBookAuthor());
					t4.setText(bag.getBookOwner());
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
		
		// 저장된 전체 책 리스트 보기
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BookListUI list = new BookListUI();
				list.open();
				f.setVisible(false);
			}
		});

		f.setVisible(true);

	}

}
