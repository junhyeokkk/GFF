package Wook;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Category extends JFrame {
	private JScrollPane scrollPane;
	private JPanel pnl;
	int y = 120;
	int z = 80;

	public Category() {
		pnl = new JPanel();
		pnl.setBackground(new Color(198, 239, 206));
		getContentPane().add(pnl);
		pnl.setLayout(null);

		scrollPane = new JScrollPane(pnl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(327, 0, 17, 601);
		getContentPane().add(scrollPane);

		JButton Back = new JButton("<- 뒤로");
		Back.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Back.setBounds(0, 0, 75, 30);
		pnl.add(Back);
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FoodCategory().setVisible(true);
				dispose();
			}
		});

		JButton HomeBtn = new JButton("home");
		HomeBtn.setBounds(290, -1, 30, 30);
		pnl.add(HomeBtn);

		JPanel restPnl = new JPanel();
		restPnl.setBounds(0, 120, 318, 76);
		pnl.add(restPnl);
		restPnl.setLayout(null);

		JLabel restImg = new JLabel("가게 이미지");
		restImg.setBounds(12, 10, 57, 56);
		restPnl.add(restImg);

		JLabel restName = new JLabel("존나맛있다람이");
		restName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		restName.setBounds(81, 10, 170, 32);
		restPnl.add(restName);

		JLabel minOrder = new JLabel("New label");
		minOrder.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		minOrder.setBounds(81, 43, 99, 23);
		minOrder.setText("최소주문");
		restPnl.add(minOrder);

		JLabel star = new JLabel("");
		star.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		star.setBounds(263, 16, 39, 23);
		star.setText("★ 5.0");
		restPnl.add(star);

		JLabel riderTip = new JLabel("배달팁");
		riderTip.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		riderTip.setBounds(203, 43, 99, 23);
		restPnl.add(riderTip);

		//////////////////////////////////////////////
		
		JButton btnNewButton = new JButton("메소드 ox?");
		btnNewButton.setBounds(12, 566, 97, 23);
		pnl.add(btnNewButton);
		addPnl();
		addPnl();
		addPnl();
		
//		btnNewButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				addPnl();
//				System.out.println("작동함");
//			}
//		});


		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void addPnl() {
		y += z;
		
		JPanel restPnl = new JPanel();
		restPnl.setBounds(0, y, 318, 76);
		pnl.add(restPnl);
		restPnl.setLayout(null);

		JLabel restImg = new JLabel("가게 이미지");
		restImg.setBounds(12, 10, 57, 56);
		restPnl.add(restImg);

		JLabel restName = new JLabel("존나맛있다람이");
		restName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		restName.setBounds(81, 10, 170, 32);
		restPnl.add(restName);

		JLabel minOrder = new JLabel("New label");
		minOrder.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		minOrder.setBounds(81, 43, 99, 23);
		minOrder.setText("최소주문");
		restPnl.add(minOrder);

		JLabel star = new JLabel("");
		star.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		star.setBounds(263, 16, 39, 23);
		star.setText("★ 5.0");
		restPnl.add(star);

		JLabel riderTip = new JLabel("배달팁");
		riderTip.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		riderTip.setBounds(203, 43, 99, 23);
		restPnl.add(riderTip);
	}

	public static void main(String[] args) {
		new Category().setVisible(true);
	}
}