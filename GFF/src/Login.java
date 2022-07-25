

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame{
	private JTextField textField;
	private JTextField SignINIDTxt;
	private JTextField SignINPWTxt;
	private JPasswordField passwordField;
	static boolean check = true;
	
	public Login() {
		
				
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(198, 239, 206));
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		
		JLabel SignIN = new JLabel("SingIN");
		SignIN.setBounds(12, 10, 320, 65);
		SignIN.setFont(new Font("휴먼모음T", Font.BOLD, 45));
		SignIN.setHorizontalAlignment(SwingConstants.CENTER);
		pnl.add(SignIN);
		
		JLabel SignINID = new JLabel("SignINID");
		SignINID.setBounds(12, 161, 97, 40);
		SignINID.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		pnl.add(SignINID);
		
		JLabel SignINPW = new JLabel("SignINPW");
		SignINPW.setBounds(12, 211, 97, 40);
		SignINPW.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		pnl.add(SignINPW);
		
		SignINIDTxt = new JTextField();
		SignINIDTxt.setBounds(110, 161, 222, 40);
		SignINIDTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignINIDTxt.setColumns(10);
		pnl.add(SignINIDTxt);
		
		SignINPWTxt = new JPasswordField();
		SignINPWTxt.setBounds(110, 211, 222, 40);
		SignINPWTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignINPWTxt.setColumns(10);
		pnl.add(SignINPWTxt);
		
	
		JButton SignINButton = new JButton("로그인");
		SignINButton.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignINButton.setBounds(12, 277, 320, 40);
		pnl.add(SignINButton);
		
		SignINButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String loginid = SignINIDTxt.getText();
				String password = SignINPWTxt.getText();
				System.out.println(loginid+ password);
				Method.CheckMember(loginid, password);
				if(check == false) {
					dispose();
				}
			}
		});
		
		JLabel SignINInfo = new JLabel("혹시, 그푸파가 처음이신가요?");
		SignINInfo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		SignINInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		SignINInfo.setBounds(12, 566, 188, 25);
		pnl.add(SignINInfo);
		
		JButton SignUpBtn = new JButton("회원가입");
		SignUpBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		SignUpBtn.setBounds(212, 567, 97, 23);
		pnl.add(SignUpBtn);
		
		  SignUpBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               UserSignUp usu = new UserSignUp();
	               usu.setVisible(true);
	            }
	         });

		
		
//		JLabel backgroundImg = new JLabel("");
//		backgroundImg.setBackground(Color.WHITE);
//		backgroundImg.setIcon(new ImageIcon(SellerSignUp.class.getResource("/resource/배달부.png")));
//		backgroundImg.setBounds(0, 0, 344, 601);
//		pnl.add(backgroundImg);

		
		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		new Login().setVisible(true);
	}
}