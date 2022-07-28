import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SellerSignUp extends JDialog{
	private JTextField textField;
	private JTextField SignUpNameTxt;
	private JTextField SignUpTelTxt;
	private JTextField SignUpIDTxt;
	private JTextField SignUpPWTxt;
	private JTextField SignUpPW2Txt;
	private JTextField SignUpTelTxt2;
	private JTextField SignUpTelTxt3;
	private JLabel PwCheck;
	private boolean doubleCheckOk;
	private JButton OverlapBtn;
	private JButton SignUpComplete;
	private JButton SignUpBackWard;
	private JPasswordField passwordField;
	private ArrayList<String> IDlist;
	
	private JPanel pnl;
	
	private String userId;
	private String userpw;
	private String userName;
	private String userPhone;


	public SellerSignUp() {
		
		DoubleCheckIdList();
		ShowView();
		Listener();
	}
	
	// db에 판매자 정보 넣기
	private static void InsertMember(String userId ,String userPw, String userName, String userPhone) {
		
	      Connection conn  = null;
	      PreparedStatement stmt = null;
	      try {   
	         conn = DBUtil.getConnection();
	
	         String s = "INSERT INTO seller_t(sel_log_id, sel_pw, sel_name , sel_tel) values";
	         s += "('" +  userId + "','" + userPw + "','" + userName + "','" + userPhone + "')";
	         System.out.println(s);
	         stmt = conn.prepareStatement(s);
	         int i = stmt.executeUpdate(s);
	         if(i == 1) {
	            System.out.println("레코드 추가 성공");
	         }
	         else {
	            System.out.println("레코드 추가 실패");
	         }
	      }  catch (Exception e) {
	         // TODO Auto-generated catch block
	         System.out.println(e.getMessage());
	         System.exit(0);
	      } finally {
	         DBUtil.close(conn, stmt);
	      }
	   }
 
	
	// db에 판매자 id목록 불러오기
	 private void DoubleCheckIdList() {
		   
		      Connection conn  = null;
		      PreparedStatement stmt = null;
		      try {   
		    	 conn = DBUtil.getConnection();
	
		         String s = "Select sel_log_id From seller_t";
		         System.out.println(s);
		         stmt = conn.prepareStatement(s);
		         ResultSet rs = stmt.executeQuery(s);
		         
		         IDlist = new ArrayList<>();
		         while(rs.next()) {
		        	 IDlist.add(rs.getString("sel_log_id"));      
		         }
		         System.out.println(IDlist);
		         
	
		      }  catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         DBUtil.close(conn, stmt);
		      }
		   }

	private void ShowView() {
		pnl = new JPanel();
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
		SignUpIDTxt.setBounds(110, 210, 134, 40);
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

		PwCheck = new JLabel("");
		PwCheck.setBounds(294, 320, 50, 30);
		pnl.add(PwCheck);

		SignUpComplete = new JButton("가입완료");
		SignUpComplete.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpComplete.setBounds(40, 520, 97, 40);
		pnl.add(SignUpComplete);

		SignUpBackWard = new JButton("뒤로가기");
		SignUpBackWard.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpBackWard.setBounds(205, 520, 97, 40);
		pnl.add(SignUpBackWard);
		
		OverlapBtn = new JButton("중복");
		OverlapBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		OverlapBtn.setBounds(250, 210, 82, 40);
		pnl.add(OverlapBtn);


		JLabel hyphen = new JLabel("-");
		hyphen.setBounds(163, 160, 19, 40);
		pnl.add(hyphen);

		JLabel hyphen_1 = new JLabel("-");
		hyphen_1.setBounds(231, 160, 19, 40);
		pnl.add(hyphen_1);

		setSize(360, 640);

	}

	private void Listener() {
		
		
		// 이름 체크
		SignUpNameTxt.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				CheckMethod.nameCheck(SignUpNameTxt ,SignUpNameTxt.getText(), pnl);
			}
		});

		// 아이디 체크
		SignUpIDTxt.addKeyListener(new KeyAdapter() {
			@Override // 
			public void keyReleased(KeyEvent e) {
				SignUpIDTxt.setText(CheckMethod.IdCheck(SignUpIDTxt.getText(), pnl));

			}
		});

		// 비밀번호 체크
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				CheckMethod.PwCheck(SignUpPWTxt.getText(), SignUpPW2Txt.getText(), PwCheck);

			}
		};
		SignUpPWTxt.addKeyListener(adapter);
		SignUpPW2Txt.addKeyListener(adapter);

		// 전화번호1 체크
		SignUpTelTxt.addKeyListener(new KeyAdapter() {

			@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
			public void keyReleased(KeyEvent e) {
				CheckMethod.PhoneCheck1(SignUpTelTxt.getText(), SignUpTelTxt, e, pnl);
			}
		});

		// 전화번호2 체크
		SignUpTelTxt2.addKeyListener(new KeyAdapter() {

			@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
			public void keyReleased(KeyEvent e) {
				CheckMethod.PhoneCheck2(SignUpTelTxt2.getText(), SignUpTelTxt2, e, pnl);
			}
		});

		// 전화번호3 체크
		SignUpTelTxt3.addKeyListener(new KeyAdapter() {

			@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
			public void keyReleased(KeyEvent e) {
				CheckMethod.PhoneCheck3(SignUpTelTxt3.getText(), SignUpTelTxt3, e, pnl);
			}
		});
		
		
		// 중복확인 버튼 액션
		OverlapBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				doubleCheckOk = CheckMethod.IdDoubleCheck(IDlist, doubleCheckOk, OverlapBtn, SignUpIDTxt, SignUpIDTxt.getText(), pnl);
				
			}
		});
		
		// 가입완료 버튼 액션
				SignUpComplete.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.out.println("확인" + IDlist);
						// ID 입력창이 비어있을때
						if (SignUpIDTxt.getText().length() <= 0 ) {
							JOptionPane.showMessageDialog(SellerSignUp.this, "ID를 확인해주세요.");
						}
						// 중복확인을 안눌었을때
						else if (doubleCheckOk == false) {
							JOptionPane.showMessageDialog(SellerSignUp.this, "ID 중복확인을 해주세요.");
						}
						// 비밀번호 길이가 8보다 작고, pw, pw2가 다를때
						else if (!(SignUpPWTxt.getText().length() >= 8) || !(SignUpPWTxt.getText().equals(SignUpPW2Txt.getText()))) {
							JOptionPane.showMessageDialog(SellerSignUp.this, "PW를 확인해주세요.");
						}
						// 이름 입력창이 비어있을때
						else if (SignUpNameTxt.getText().length() <= 0) {
							JOptionPane.showMessageDialog(SellerSignUp.this, "이름을 확인해주세요.");
						}
						// 전화번호 형식이 안맞을때 
						else if (!((SignUpTelTxt.getText().length() == 3 || SignUpTelTxt2.getText().length() == 4)
								&& (SignUpTelTxt3.getText().length() == 4))) {
							JOptionPane.showMessageDialog(SellerSignUp.this, "전화번호를 확인해주세요.");
						}
						else {

							userId = SignUpIDTxt.getText();
							userpw = SignUpPWTxt.getText();
							userName = SignUpNameTxt.getText();
							userPhone = Method.PhoneNumSum(SignUpTelTxt.getText(), SignUpTelTxt2.getText(), SignUpTelTxt3.getText());
							JOptionPane.showMessageDialog(SellerSignUp.this, "가입이 완료되었습니다.");
							
							InsertMember(userId ,userpw, userName, userPhone);
							setVisible(false);
							

						}
					}
				});
		
	}

	public static void main(String[] args) {
		new SellerSignUp().setVisible(true);
	}
} 