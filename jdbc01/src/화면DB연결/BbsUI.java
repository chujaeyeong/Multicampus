package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		
		JButton b1 = new JButton("게시물 글쓰기 처리");
		JButton b2 = new JButton("게시물 지우기 처리");
		JButton b3 = new JButton("게시물 수 정 처리");
		JButton b4 = new JButton("게시물 삭 제 처리");
		
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
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
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
		
		
		
		
		// 조립 시작 
		
		// 맨 끝으로 
		f.setVisible(true);

	}

}
