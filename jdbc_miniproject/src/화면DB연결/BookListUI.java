package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.ws.handler.MessageContext.Scope;

import 자바DB연결.BookDAO;

public class BookListUI {

	public void open() {
		// 프로그램 시작하자 마자 db에서 데이터를 가지고 와서
		// 화면을 만들어주고 싶음.
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> list = dao.list(); 
		
		String[] header = {"책 ID", "책 제목", "저자", "회원 ID"};
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
		}//else  
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		
		JButton b1 = new JButton("내 책 등록화면으로 돌아가기");
		Font font = new Font("Noto Sans", Font.BOLD, 35);
		
		
		f.setLayout(new FlowLayout());
		f.add(scroll);
		f.add(b1);
		
		b1.setFont(font);
		b1.setForeground(Color.blue);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BookUI.main(null);
				f.setVisible(false);
			}
		});

		
		f.setVisible(true);
		
	} // list 
}