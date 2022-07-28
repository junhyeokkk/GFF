
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {
	private JTextField textField;
	private JTextField SignINIDTxt;
	private JTextField SignINPWTxt;
	private JPasswordField passwordField;
	private JButton SignUpBtn;
	private JRadioButton UserRad;
	private JRadioButton SellerRad;
	private JButton SignINButton;
	private JPanel pnl;
	static boolean check = true;
	
	

	
	public JPanel getPnl() {
		return pnl;
	}

	public void setPnl(JPanel pnl) {
		this.pnl = pnl;
	}

	public Login() {
		showView();
		listener();

	}

	private void showView() {

		pnl = new JPanel();
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

		SignINButton = new JButton("로그인");
		SignINButton.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignINButton.setBounds(12, 277, 320, 40);
		pnl.add(SignINButton);

		JLabel SignINInfo = new JLabel("혹시, 그푸파가 처음이신가요?");
		SignINInfo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		SignINInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		SignINInfo.setBounds(12, 566, 188, 25);
		pnl.add(SignINInfo);

		SignUpBtn = new JButton("회원가입");
		SignUpBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		SignUpBtn.setBounds(212, 567, 97, 23);
		pnl.add(SignUpBtn);

		UserRad = new JRadioButton("회원");
		UserRad.setBounds(95, 323, 62, 23);
		pnl.add(UserRad);

		SellerRad = new JRadioButton("판매자");
		SellerRad.setBounds(187, 323, 67, 23);
		pnl.add(SellerRad);

		ButtonGroup group = new ButtonGroup();
		group.add(UserRad);
		group.add(SellerRad);

//	      JLabel backgroundImg = new JLabel("");
//	      backgroundImg.setBackground(Color.WHITE);
//	      backgroundImg.setIcon(new ImageIcon(SellerSignUp.class.getResource("/resource/배달부.png")));
//	      backgroundImg.setBounds(0, 0, 344, 601);
//	      pnl.add(backgroundImg);

		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void listener() {

		// 회원가입 눌렀을때
		SignUpBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SellerSignUp ssu = new SellerSignUp();
				UserSignUp usu = new UserSignUp();

				Object[] options = { "회원", "판매자" };
				int result = JOptionPane.showOptionDialog(Login.this, "가입 유형", "선택하세요.", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, null);

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {

					usu.setVisible(true);

				} else {

					ssu.setVisible(true);

				}

			}
		});

		SignINButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (UserRad.isSelected() == true) {
					String loginid = SignINIDTxt.getText();
					String password = SignINPWTxt.getText();
					System.out.println(loginid + password);
					Method.CheckMember(pnl, loginid, password);
					if (check == false) {
						dispose();
					}

				} else if (SellerRad.isSelected() == true) {
					
					String loginid = SignINIDTxt.getText();
					String password = SignINPWTxt.getText();
					System.out.println(loginid + password);
					Method.CheckSeller(pnl, loginid, password);
					
					if (check == false) {
						dispose();
					}

				} else {
					JOptionPane.showMessageDialog(Login.this, "로그인 유형을 선택하세요.");
				}

			}
		});

	}

	public static void main(String[] args) {
		new Login().setVisible(true);
	}
}