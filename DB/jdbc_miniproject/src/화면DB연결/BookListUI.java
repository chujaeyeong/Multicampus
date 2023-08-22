package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.xml.ws.handler.MessageContext.Scope;

import 자바DB연결.BookDAO;

public class BookListUI {

	// 계속 검색하고 새로운 테이블을 불러올거라 밖에다가 스테틱 변수로 scroll을 선언해줌
	public static JScrollPane scroll;

	public void open() {
		// 프로그램 시작하자 마자 db에서 데이터를 가지고 와서
		// 화면을 만들어주고 싶음.
		JFrame f = new JFrame();
		f.setTitle("등록한 책 검색화면");
		f.setSize(550, 780);

		JTextField t1 = new JTextField(14);
		JTextField t2 = new JTextField(14);
		JTextField t3 = new JTextField(14);

		JButton b1 = new JButton("회원 ID로 검색");
		JButton b2 = new JButton("책 이름으로 검색");
		JButton b3 = new JButton("저자명으로 검색");

		JLabel l11 = new JLabel("=============================");
		
		JButton b4 = new JButton("책 전체 리스트 다시 보기");
		JButton b5 = new JButton("<< 책 등록화면으로 돌아가기");

		
		// 전체 테이블 데이터를 먼저 불러와줌 (list)
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> list = dao.list();

		String[] header = { "책 ID", "책 제목", "저자", "회원 ID" };
		Object[][] all = new String[list.size()][4];

		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) {

				all[i][0] = String.valueOf(list.get(i).getBookId());
				all[i][1] = list.get(i).getBookTitle();
				all[i][2] = list.get(i).getBookAuthor();
				all[i][3] = list.get(i).getBookOwner();
			}
		} // else

		// scroll 끼워넣기
		JTable table = new JTable(all, header);
		scroll = new JScrollPane(table);
		JPanel panel = new JPanel();
		
		// 폰트 설정해주기 
		Font font = new Font("Noto Sans", Font.BOLD, 21);
		Font font2 = new Font("Noto Sans", Font.BOLD, 30);

		f.setLayout(new FlowLayout());
		
		panel.add(scroll);
		f.add(panel);
		f.add(t1);
		f.add(b1);
		f.add(t2);
		f.add(b2);
		f.add(t3);
		f.add(b3);
		f.add(l11);
		f.add(b4);
		f.add(b5);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font2);
		b5.setFont(font2);
		l11.setFont(font2);

		b4.setForeground(Color.blue);
		b5.setForeground(Color.magenta);

		// 회원 ID로 검색 (bookOwner)
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원 ID로 책 정보 검색 처리");
				String bookOwner = t1.getText(); // 검색할 때 넣어야 하는 조건 (회원ID)

				BookDAO dao = new BookDAO();

				// 1. 가방 만들기
				ArrayList<BookVO> list2 = dao.list2(bookOwner);

				// 2. 가방에 값 넣고 전달하기 (값을 list2로 넣은거임)
				if (list2.size() != 0) {
					String[] header = { "책 ID", "책 제목", "저자", "회원 ID" };
					Object[][] all = new String[list2.size()][4];

					System.out.println("검색결과는 전체 " + list2.size() + "개 입니다.");
					for (int i = 0; i < all.length; i++) {

						all[i][0] = String.valueOf(list2.get(i).getBookId());
						all[i][1] = list2.get(i).getBookTitle();
						all[i][2] = list2.get(i).getBookAuthor();
						all[i][3] = list2.get(i).getBookOwner();
					}
					panel.remove(scroll);

					JTable table = new JTable(all, header);
					scroll = new JScrollPane(table);
					panel.add(scroll);
					panel.updateUI();
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 없음!");
					t1.setText("");
				}

			}
		});

		// 책 이름으로 검색 (bookTitle)
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("책 이름으로 책 정보 검색 처리");
				String bookTitle = t2.getText(); // 검색할 때 넣어야 하는 조건 (책 이름)

				BookDAO dao = new BookDAO();

				// 1. 가방 만들기
				ArrayList<BookVO> list3 = dao.list3(bookTitle);

				// 2. 가방에 값 넣고 전달하기 (값을 list3로 넣은거임)
				if (list3.size() != 0) {
					String[] header = { "책 ID", "책 제목", "저자", "회원 ID" };
					Object[][] all = new String[list3.size()][4];

					System.out.println("검색결과는 전체 " + list3.size() + "개 입니다.");
					for (int i = 0; i < all.length; i++) {

						all[i][0] = String.valueOf(list3.get(i).getBookId());
						all[i][1] = list3.get(i).getBookTitle();
						all[i][2] = list3.get(i).getBookAuthor();
						all[i][3] = list3.get(i).getBookOwner();
					}
					panel.remove(scroll);

					JTable table = new JTable(all, header);
					scroll = new JScrollPane(table);
					panel.add(scroll);
					panel.updateUI();
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 없음!");
					t2.setText("");
				}

			}
		});

		// 저자명으로 검색 (bookAuthor)
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("저자명으로 책 정보 검색 처리");
				String bookAuthor = t3.getText(); // 검색할 때 넣어야 하는 조건 (책 이름)

				BookDAO dao = new BookDAO();

				// 1. 가방 만들기
				ArrayList<BookVO> list4 = dao.list4(bookAuthor);

				// 2. 가방에 값 넣고 전달하기 (값을 list4로 넣은거임)
				if (list4.size() != 0) {
					String[] header = { "책 ID", "책 제목", "저자", "회원 ID" };
					Object[][] all = new String[list4.size()][4];

					System.out.println("검색결과는 전체 " + list4.size() + "개 입니다.");
					for (int i = 0; i < all.length; i++) {

						all[i][0] = String.valueOf(list4.get(i).getBookId());
						all[i][1] = list4.get(i).getBookTitle();
						all[i][2] = list4.get(i).getBookAuthor();
						all[i][3] = list4.get(i).getBookOwner();
					}
					panel.remove(scroll);

					JTable table = new JTable(all, header);
					scroll = new JScrollPane(table);
					panel.add(scroll);
					panel.updateUI();
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 없음!");
					t3.setText("");
				}

			}
		});
		
		// 전체 리스트를 다시 보여주기 (list)
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원 ID로 책 정보 검색 처리");
				
				BookDAO dao = new BookDAO();
				
				// 1. 가방 만들기
				ArrayList<BookVO> list = dao.list();
				
				// 2. 가방에 값 넣고 전달하기 (값을 list4로 넣은거임)
				if (list.size() != 0) {
					String[] header = { "책 ID", "책 제목", "저자", "회원 ID" };
					Object[][] all = new String[list.size()][4];
					
					System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
					for (int i = 0; i < all.length; i++) {
						
						all[i][0] = String.valueOf(list.get(i).getBookId());
						all[i][1] = list.get(i).getBookTitle();
						all[i][2] = list.get(i).getBookAuthor();
						all[i][3] = list.get(i).getBookOwner();
					}
					panel.remove(scroll);
					
					JTable table = new JTable(all, header);
					scroll = new JScrollPane(table);
					panel.add(scroll);
					panel.updateUI();
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 없음!");
				}
				
			}
		});
		
		
		// 내 책 등록화면으로 돌아가기
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BookUI.main(null);
				f.setVisible(false);
			}
		});

		f.setVisible(true);

	} // list
}