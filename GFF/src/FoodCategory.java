
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Button;

public class FoodCategory extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;

	
	public FoodCategory() {
		Category cate = new Category();
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(198, 239, 206));
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		
		JLabel FoodCategory = new JLabel("FoodCategory");
		FoodCategory.setBounds(12, 59, 320, 65);
		FoodCategory.setFont(new Font("휴먼모음T", Font.BOLD, 45));
		FoodCategory.setHorizontalAlignment(SwingConstants.CENTER);
		pnl.add(FoodCategory);
		
		JButton Category1 = new JButton("한식");
		Category1.setIcon(new ImageIcon("D:\\WookEc\\GreenFoodFighter\\src\\foodCategory\\한식.png"));
		Category1.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category1.setBounds(22, 195, 50, 50);
		pnl.add(Category1);
		// 
		
		Category1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cate.setVisible(true);
				dispose();
			}
		});
		
		JButton Category2 = new JButton("중식");
		Category2.setIcon(new ImageIcon("D:\\WookEc\\GreenFoodFighter\\src\\foodCategory\\중식.png"));
		Category2.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category2.setBounds(84, 195, 50, 50);
		pnl.add(Category2);
		
		JButton Category3 = new JButton("양식");
		Category3.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category3.setBounds(146, 195, 50, 50);
		pnl.add(Category3);
		
		JButton Category4 = new JButton("일식");
		Category4.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category4.setBounds(208, 195, 50, 50);
		pnl.add(Category4);
		
		JButton Category5 = new JButton("고기");
		Category5.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category5.setBounds(270, 195, 50, 50);
		pnl.add(Category5);
		
		JButton Category6 = new JButton("야식");
		Category6.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category6.setBounds(22, 255, 50, 50);
		pnl.add(Category6);
		
		JButton Category7 = new JButton("치킨");
		Category7.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category7.setBounds(84, 255, 50, 50);
		pnl.add(Category7);
		
		JButton Category8 = new JButton("피자");
		Category8.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category8.setBounds(146, 255, 50, 50);
		pnl.add(Category8);
		
		JButton Category9 = new JButton("분식");
		Category9.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category9.setBounds(208, 255, 50, 50);
		pnl.add(Category9);
		
		JButton Category10 = new JButton("국물");
		Category10.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Category10.setBounds(270, 255, 50, 50);
		pnl.add(Category10);
		
		JButton Back = new JButton("<- 뒤로");
		Back.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		Back.setBounds(0, 0, 75, 30);
		pnl.add(Back);
		
		JButton FoodRandom = new JButton("FoodRandom");
		FoodRandom.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		FoodRandom.setBounds(12, 401, 320, 65);
		pnl.add(FoodRandom);
		
		JLabel FoodSearch = new JLabel("검색");
		FoodSearch.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		FoodSearch.setHorizontalAlignment(SwingConstants.CENTER);
		FoodSearch.setBounds(0, 551, 57, 50);
		pnl.add(FoodSearch);
		
		JLabel FoodPick = new JLabel("찜");
		FoodPick.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		FoodPick.setHorizontalAlignment(SwingConstants.CENTER);
		FoodPick.setBounds(69, 551, 57, 50);
		pnl.add(FoodPick);
		
		JLabel MainPage = new JLabel("그푸파");
		MainPage.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		MainPage.setHorizontalAlignment(SwingConstants.CENTER);
		MainPage.setBounds(138, 551, 68, 50);
		pnl.add(MainPage);
		
		JLabel OrderList = new JLabel("주문내역");
		OrderList.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		OrderList.setHorizontalAlignment(SwingConstants.CENTER);
		OrderList.setBounds(218, 551, 57, 50);
		pnl.add(OrderList);
		
		JLabel MyPage = new JLabel("my그푸파");
		MyPage.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		MyPage.setBounds(287, 551, 57, 50);
		pnl.add(MyPage);
		
		JButton HomeBtn = new JButton("home");
		HomeBtn.setBounds(314, -1, 30, 30);
		pnl.add(HomeBtn);
		
//		JLabel backgroundImg = new JLabel("");
//		backgroundImg.setBackground(Color.WHITE);
//		backgroundImg.setIcon(new ImageIcon(SellerSignUp.class.getResource("/resource/배달부.png")));
//		backgroundImg.setBounds(0, 0, 344, 601);
//		pnl.add(backgroundImg);
		
		
		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FoodCategory().setVisible(true);
	}
}