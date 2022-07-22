package Wook;
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

public class SellerSignUp extends JFrame{
	private JTextField textField;
	private JTextField SignUpNameTxt;
	private JTextField SignUpTelTxt;
	private JTextField SignUpIDTxt;
	private JPasswordField SignUpPWTxt;
	private JPasswordField SignUpPW2Txt;
	private JTextField SignUpTelTxt2;
	private JTextField SignUpTelTxt3;

	
	public SellerSignUp() {
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(198, 239, 206));
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		
		JLabel SellerSignUp = new JLabel("SellerSignUp");
		SellerSignUp.setFont(new Font("휴먼모음T", Font.BOLD, 45));
		SellerSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		SellerSignUp.setBounds(12, 10, 320, 65);
		pnl.add(SellerSignUp);
		
		JLabel SignUpName = new JLabel("SignUpName");
		SignUpName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpName.setBounds(12, 110, 97, 40);
		pnl.add(SignUpName);
		
		JLabel SignUpTel = new JLabel("SignUpTel");
		SignUpTel.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpTel.setBounds(12, 160, 97, 40);
		pnl.add(SignUpTel);
		
		JLabel SignUpID = new JLabel("SignUpID");
		SignUpID.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpID.setBounds(12, 210, 97, 40);
		pnl.add(SignUpID);
		
		JLabel SignUpPW = new JLabel("SignUpPW");
		SignUpPW.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpPW.setBounds(12, 260, 97, 40);
		pnl.add(SignUpPW);
		
		JLabel SignUpPW2 = new JLabel("SignUpPW2");
		SignUpPW2.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpPW2.setBounds(12, 310, 97, 40);
		pnl.add(SignUpPW2);
		
		SignUpNameTxt = new JTextField();
		SignUpNameTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpNameTxt.setBounds(110, 110, 180, 40);
		pnl.add(SignUpNameTxt);
		SignUpNameTxt.setColumns(10);
		
		SignUpTelTxt = new JTextField();
		SignUpTelTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpTelTxt.setColumns(10);
		SignUpTelTxt.setBounds(110, 160, 50, 40);
		pnl.add(SignUpTelTxt);
		
		SignUpIDTxt = new JTextField();
		SignUpIDTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpIDTxt.setColumns(10);
		SignUpIDTxt.setBounds(110, 210, 180, 40);
		pnl.add(SignUpIDTxt);
		
		SignUpTelTxt2 = new JTextField();
		SignUpTelTxt2.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpTelTxt2.setColumns(10);
		SignUpTelTxt2.setBounds(178, 160, 50, 40);
		pnl.add(SignUpTelTxt2);
		
		SignUpTelTxt3 = new JTextField();
		SignUpTelTxt3.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpTelTxt3.setColumns(10);
		SignUpTelTxt3.setBounds(240, 160, 50, 40);
		pnl.add(SignUpTelTxt3);
		
		SignUpPWTxt = new JPasswordField();
		SignUpPWTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpPWTxt.setColumns(10);
		SignUpPWTxt.setBounds(110, 260, 180, 40);
		pnl.add(SignUpPWTxt);
		
		SignUpPW2Txt = new JPasswordField();
		SignUpPW2Txt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpPW2Txt.setColumns(10);
		SignUpPW2Txt.setBounds(110, 310, 180, 40);
		pnl.add(SignUpPW2Txt);
		
		JLabel PwCheck = new JLabel("일치, 불일치");
		PwCheck.setBounds(294, 320, 50, 30);
		pnl.add(PwCheck);
		
		JButton SignUpComplete = new JButton("가입완료");
		SignUpComplete.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpComplete.setBounds(40, 520, 97, 40);
		pnl.add(SignUpComplete);
		
		JButton SignUpBackWard = new JButton("뒤로가기");
		SignUpBackWard.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpBackWard.setBounds(205, 520, 97, 40);
		pnl.add(SignUpBackWard);
		
		
		JLabel hyphen = new JLabel("-");
		hyphen.setBounds(163, 160, 19, 40);
		pnl.add(hyphen);
		
		JLabel hyphen_1 = new JLabel("-");
		hyphen_1.setBounds(231, 160, 19, 40);
		pnl.add(hyphen_1);
		
		JButton OverlapBtn = new JButton("중복");
		OverlapBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		OverlapBtn.setBounds(294, 210, 38, 40);
		pnl.add(OverlapBtn);
		
		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SellerSignUp().setVisible(true);
	}
}