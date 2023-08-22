package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(400, 500);
		f.setLayout(new FlowLayout());

		Font font = new Font("Noto Sans", Font.BOLD, 30);

		JLabel label = new JLabel("문장을 넣으세요");
		JTextArea area = new JTextArea(5, 12);
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색바꾸기");
		JButton b3 = new JButton("글자색바꾸기");

		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
				area.setText("");

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
			}
		});

		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setVisible(true);

	}

}
