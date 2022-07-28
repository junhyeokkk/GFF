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

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class UserSignUp extends JDialog {
	private JTextField textField;
	private JTextField SignUpNameTxt;
	private JTextField SignUpTelTxt;
	private JTextField SignUpIDTxt;
	private JPasswordField SignUpPWTxt;
	private JPasswordField SignUpPW2Txt;
	private JTextField SignUpAddress2Txt;
	private JTextField SignUpTelTxt2;
	private JTextField SignUpTelTxt3;
	private JLabel PwCheck;
	private JButton OverlapBtn;
	private JButton SignUpComplete;
	private JButton SignUpBackWard;
	private JComboBox SignUpAddressCom;
	private JPanel pnl;
	private boolean doubleCheckOk;

	private String userId;
	private String userpw;
	private int userAddress;
	private String userName;
	private String userPhone;
	private String userDetailAddress;
	
	private ArrayList<String> IDlist;
	private HashMap<String, Integer> AreaKey;
	

	public UserSignUp() {
		DoubleCheckIdList();
		CheckArea();
		
		Member member;
		
		showView();
		addListener();

	}
	
	// db에 정보 넣기
	private static void InsertMember(String userId ,String userPw, int userAdrres, String userName, String userPhone, String userDetailAdrres) {
	
	      Connection conn  = null;
	      PreparedStatement stmt = null;
	      try {   
	         conn = DBUtil.getConnection();
	
	         String s = "INSERT INTO member_t(login_id, password, busan_add_id , name, phone ,current_address) values";
	         s += "('" +  userId + "','" + userPw + "','" + userAdrres + "','" + userName + "','" + userPhone + "','" + userDetailAdrres + "')";
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
   
	
	// 지역 번호 db 불러오기
   private void CheckArea() {
	   
	      Connection conn  = null;
	      PreparedStatement stmt = null;
	      try {   
	    	 conn = DBUtil.getConnection();

	         String s = "Select gu_name, busan_add_id From busan_add_t";
	         System.out.println(s);
	         stmt = conn.prepareStatement(s);
	         ResultSet rs = stmt.executeQuery(s);
	         
	         AreaKey = new HashMap<>();
	         while(rs.next()) {
	        	 AreaKey.put(rs.getString("gu_name"), rs.getInt("busan_add_id"));  
	         }
//
	         System.out.println(AreaKey);
	         
//			         int i = stmt.executeUpdate(s);
//			         if(i == 1) {
//			            System.out.println("레코드 추가 성공");
//			         }
//			         else {
//			            System.out.println("레코드 추가 실패");
//			         }
	      }  catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         DBUtil.close(conn, stmt);
	      }
	   }
	
	// db에 회원 id목록 불러오기
   private void DoubleCheckIdList() {
	   
	      Connection conn  = null;
	      PreparedStatement stmt = null;
	      try {   
	    	 conn = DBUtil.getConnection();

	         String s = "Select login_id From member_t";
	         System.out.println(s);
	         stmt = conn.prepareStatement(s);
	         ResultSet rs = stmt.executeQuery(s);
	         
	         IDlist = new ArrayList<>();
	         while(rs.next()) {
	        	 IDlist.add(rs.getString("login_id"));      
	         }
//
	         System.out.println(IDlist);
	         
//		         int i = stmt.executeUpdate(s);
//		         if(i == 1) {
//		            System.out.println("레코드 추가 성공");
//		         }
//		         else {
//		            System.out.println("레코드 추가 실패");
//		         }
	      }  catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         DBUtil.close(conn, stmt);
	      }
	   }
	
	
	
//   private void CheckMember() {
//	   	String id = "aaaa1111";
//	      Connection conn  = null;
//	      PreparedStatement stmt = null;
//	      try {   
//	    	 conn = DBUtil.getConnection();
//
//	         String s = "Select login_id, password From member_t where login_id = ";
//	         s +=  "'" +id + "'" ;
//	         System.out.println(s);
//	         stmt = conn.prepareStatement(s);
//	         ResultSet rs = stmt.executeQuery(s);
//	         
//	         ArrayList<String> list = new ArrayList<>();
//	         while(rs.next()) {
//	            list.add(rs.getString("login_id"));
//	            list.add(rs.getString("password"));         
//	         }
//
//	         System.out.println(list);
//	         
////	         int i = stmt.executeUpdate(s);
////	         if(i == 1) {
////	            System.out.println("레코드 추가 성공");
////	         }
////	         else {
////	            System.out.println("레코드 추가 실패");
////	         }
//	      }  catch (Exception e) {
//	         e.printStackTrace();
//	      } finally {
//	         DBUtil.close(conn, stmt);
//	      }
//	   }

	private void showView() {

			pnl = new JPanel();
	      pnl.setBackground(new Color(198, 239, 206));

	      getContentPane().add(pnl);
	      pnl.setLayout(null);

	      JLabel SignUp = new JLabel("SignUp");
	      SignUp.setFont(new Font("휴먼모음T", Font.BOLD, 45));
	      SignUp.setHorizontalAlignment(SwingConstants.CENTER);
	      SignUp.setBounds(12, 10, 320, 65);
	      pnl.add(SignUp);

	      JLabel SignUpName = new JLabel("SignUpName");
	      SignUpName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpName.setBounds(12, 260, 97, 40);
	      pnl.add(SignUpName);

	      JLabel SignUpTel = new JLabel("SignUpTel");
	      SignUpTel.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpTel.setBounds(12, 310, 97, 40);
	      pnl.add(SignUpTel);

	      JLabel SignUpID = new JLabel("SignUpID");
	      SignUpID.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpID.setBounds(12, 110, 97, 40);
	      pnl.add(SignUpID);

	      JLabel SignUpPW = new JLabel("SignUpPW");
	      SignUpPW.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpPW.setBounds(12, 160, 97, 40);
	      pnl.add(SignUpPW);

	      JLabel SignUpPW2 = new JLabel("SignUpPW2");
	      SignUpPW2.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpPW2.setBounds(12, 210, 97, 40);
	      pnl.add(SignUpPW2);

	      JLabel SignUpAdress = new JLabel("SignUpAdress");
	      SignUpAdress.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpAdress.setBounds(12, 360, 97, 40);
	      pnl.add(SignUpAdress);

	      JLabel SignUpAdress2 = new JLabel("SignUpAdress2");
	      SignUpAdress2.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpAdress2.setBounds(12, 410, 97, 40);
	      pnl.add(SignUpAdress2);

	      SignUpNameTxt = new JTextField();
	      SignUpNameTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpNameTxt.setBounds(110, 260, 180, 40);
	      pnl.add(SignUpNameTxt);
	      SignUpNameTxt.setColumns(10);

	      SignUpTelTxt = new JTextField();
	      SignUpTelTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpTelTxt.setColumns(10);
	      SignUpTelTxt.setBounds(110, 310, 50, 40);
	      pnl.add(SignUpTelTxt);

	      SignUpIDTxt = new JTextField();
	      SignUpIDTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpIDTxt.setColumns(10);
	      SignUpIDTxt.setBounds(110, 110, 102, 40);
	      pnl.add(SignUpIDTxt);

	      SignUpTelTxt2 = new JTextField();
	      SignUpTelTxt2.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpTelTxt2.setColumns(10);
	      SignUpTelTxt2.setBounds(178, 310, 50, 40);
	      pnl.add(SignUpTelTxt2);

	      SignUpTelTxt3 = new JTextField();
	      SignUpTelTxt3.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpTelTxt3.setColumns(10);
	      SignUpTelTxt3.setBounds(240, 310, 50, 40);
	      pnl.add(SignUpTelTxt3);

	      SignUpPWTxt = new JPasswordField();
	      SignUpPWTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpPWTxt.setColumns(10);
	      SignUpPWTxt.setBounds(110, 160, 180, 40);
	      pnl.add(SignUpPWTxt);

	      SignUpPW2Txt = new JPasswordField();
	      SignUpPW2Txt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpPW2Txt.setColumns(10);
	      SignUpPW2Txt.setBounds(110, 210, 180, 40);
	      pnl.add(SignUpPW2Txt);

	      SignUpAddress2Txt = new JTextField();
	      SignUpAddress2Txt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpAddress2Txt.setColumns(10);
	      SignUpAddress2Txt.setBounds(110, 410, 180, 40);
	      pnl.add(SignUpAddress2Txt);

	      PwCheck = new JLabel("");
	      PwCheck.setBounds(294, 220, 50, 30);
	      pnl.add(PwCheck);

	      SignUpComplete = new JButton("가입완료");
	      SignUpComplete.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpComplete.setBounds(40, 520, 97, 40);
	      pnl.add(SignUpComplete);

	      SignUpBackWard = new JButton("닫기");
	      SignUpBackWard.setFont(new Font("휴먼모음T", Font.BOLD, 15));
	      SignUpBackWard.setBounds(205, 520, 97, 40);
	      pnl.add(SignUpBackWard);


	      JLabel hyphen = new JLabel("-");
	      hyphen.setBounds(163, 310, 19, 40);
	      pnl.add(hyphen);

	      JLabel hyphen_1 = new JLabel("-");
	      hyphen_1.setBounds(231, 310, 19, 40);
	      pnl.add(hyphen_1);

	      SignUpAddressCom = new JComboBox();
	      SignUpAddressCom.setModel(new DefaultComboBoxModel
	            (new String[] {"기장군", "금정구", "해운대구", "북구", "동래구"
	                      , "연제구", "수영구", "부산진구", "남구", "사상구"
	                      , "사하구", "강서구", "서구", "동구", "중구", "영도구"}));
	      SignUpAddressCom.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
	      SignUpAddressCom.setBounds(110, 365, 180, 30);
	      pnl.add(SignUpAddressCom);

	      OverlapBtn = new JButton("중복");
	      OverlapBtn.setBounds(224, 110, 108, 40);
	      pnl.add(OverlapBtn);

	      setSize(360, 640);
	}

	private void addListener() {
		// 이름 체크
		SignUpNameTxt.addKeyListener(new KeyAdapter() {
	          @Override //네임텍스트에 키를누르고 땟을때 이벤트 발생
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
					JOptionPane.showMessageDialog(UserSignUp.this, "ID를 확인해주세요.");
				}
				// 중복확인을 안눌었을때
				else if (doubleCheckOk == false) {
					JOptionPane.showMessageDialog(UserSignUp.this, "ID 중복확인을 해주세요.");
				}
				// 비밀번호 길이가 8보다 작고, pw, pw2가 다를때
				else if (!(SignUpPWTxt.getText().length() >= 8) || !(SignUpPWTxt.getText().equals(SignUpPW2Txt.getText()))) {
					JOptionPane.showMessageDialog(UserSignUp.this, "PW를 확인해주세요.");
				}
				// 이름 입력창이 비어있을때
				else if (SignUpNameTxt.getText().length() <= 0) {
					JOptionPane.showMessageDialog(UserSignUp.this, "이름을 확인해주세요.");
				}
				// 전화번호 형식이 안맞을때 
				else if (!((SignUpTelTxt.getText().length() == 3 || SignUpTelTxt2.getText().length() == 4)
						&& (SignUpTelTxt3.getText().length() == 4))) {
					JOptionPane.showMessageDialog(UserSignUp.this, "전화번호를 확인해주세요.");
				}
				// 상세주소 입력창이 비어있을때
				else if (SignUpAddress2Txt.getText().length() <= 0) {
					JOptionPane.showMessageDialog(UserSignUp.this, "상세주소를 확인해주세요.");
				}
				else {
					String a = SignUpAddressCom.getSelectedItem().toString();
					userId = SignUpIDTxt.getText();
					userpw = SignUpPWTxt.getText();
					userAddress = AreaKey.get(a);
					userName = SignUpNameTxt.getText();
					userPhone = Method.PhoneNumSum(SignUpTelTxt.getText(), SignUpTelTxt2.getText(), SignUpTelTxt3.getText());
					userDetailAddress = SignUpAddress2Txt.getText();
					JOptionPane.showMessageDialog(UserSignUp.this, "가입이 완료되었습니다.");
					
					InsertMember(userId ,userpw, userAddress, userName, userPhone, userDetailAddress);
					setVisible(false);

				}
			}
		});

		// 닫기 버튼 액션
		SignUpBackWard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});

	}


	public static void main(String[] args) {
		new UserSignUp().setVisible(true);
	}
}  