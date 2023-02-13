package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		f.setSize(500, 500);
//		String header[] = { "a", "b", "c" };
//		String contents[][] = { 
//				{ "1", "2", "3" }, 
//				{ "1", "2", "3" }, 
//				{ "1", "2", "3" }
//				};
//		
//		JTable table = new JTable(contents, header);
//		JScrollPane scroll = new JScrollPane(table);
//		f.add(scroll);		
//		
//		f.setVisible(true);
		
		JFrame f = new JFrame();
		f.setSize(600, 300);
		String header[] = { "컴퓨터", "영어", "수학", "체육" };
		String contents[][] = {
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"},
			{"100", "90", "80", "70"}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		
		
		f.setVisible(true);
		
	}

}
