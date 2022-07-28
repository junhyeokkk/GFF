import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




// 검사 메소드
public class CheckMethod {
	
	// 문자열이 문자인지 메소드
	public static boolean NameAlphabetCheck(String NameTxt) {

		boolean AlpaCheck = true;

		for (int i = 0; i < NameTxt.length(); i++) {

			if (!(Character.isAlphabetic(NameTxt.charAt(i)))) {
				AlpaCheck = false;
			} 
		}	

		return AlpaCheck;
	}
	
	// 이름 검사
	public static void nameCheck(JTextField SignUpNameTxt, String nameText, JPanel pnl) {
		
            if (NameAlphabetCheck(nameText) == false) { // 텍스트 하나하나를 분석해서 문자가아닐때 
            	
            	  JOptionPane.showMessageDialog(pnl, "문자만 입력 가능");
            	  String a;
            	  a = nameText;           
                  SignUpNameTxt.setText(a.replaceAll("[^a-zA-Zㄱ-ㅎ가-힣]", ""));// 네임텍스트에 영어나 한글빼고는 전부 삭제

               } 
		}

	// ID 검사
	public static String IdCheck(String IdText, JPanel pnl) {

		 for (int i = 0; i < IdText.length(); i++) {
             String a;
             a = IdText;
             String b = String.valueOf(a.charAt(i)); // 아이디 텍스트를 한글자씩 쪼개서 비교

             if (b.matches("^[a-zA-Z0-9]")) { 

             } else {
                JOptionPane.showMessageDialog(pnl, "영어, 숫자만 입력가능");
                return IdText.replaceAll("[^a-zA-Z0-9]", "");  // 비교해서 영어와 숫자뺴고는 다 지운다
             }
          }

		 return IdText;
	}

	// PW 검사
	public static void PwCheck(String PwText, String PwText2, JLabel PwCheck) {

		PwCheck.show(false);
		String valiTxt = "";

		if (PwText.length() < 8 && PwText.length() > 0) {
			valiTxt = "PW는 8문자 이상"; // pwText 8문자 미만일때
			PwCheck.setForeground(Color.RED);
		} else if (PwText.length() <= 0) {
			valiTxt = ""; // pwText 값 길이가 0일때 (칸이 비어있을때)
		} else if (!(PwText).equals(PwText2)) {
			valiTxt = "불일치"; // pwTex값이 8문자 이상이지만 pwText, pwText2 값이 다를때
			PwCheck.setForeground(Color.RED);
		} else if (PwText.equals(PwText2)) {
			valiTxt = "일치"; // pwText 값이 8문자 이상이고 pwText, pwText2 값이 같을때 (일치할때)
			PwCheck.setForeground(Color.GREEN);
		}
		PwCheck.setText(valiTxt); // 앞의 조건을 설정하고 맞는조건의 valiTxt를 pwValidation 에 설정한후
		PwCheck.show(true); // 보이게한다. 
	}

	// 문자열이 숫자인지 boolean 메소드
	public static boolean PhoneDigitCheck(String PhoneNum) {

		boolean DigitCheck = true;

		for (int i = 0; i < PhoneNum.length(); i++) {

			if (!(Character.isDigit(PhoneNum.charAt(i)))) {
				DigitCheck = false;
			} 
		}	
		return DigitCheck;
	}
	

	// 숫자만 입력해야할때
	public static void OnlyNum (String NumTxt, JTextField PhoneText, JPanel pnl) {

		if (PhoneDigitCheck(NumTxt) == false) {
			String a;
			a = NumTxt;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");
		} 
	}	


	// Time 검사
	public static void TimeCheck (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

//		if (PhoneDigitCheck(PhoneNum) == false) {
//			String a;
//			a = PhoneNum;
//			PhoneText.setText(a.replaceAll("[^0-9]", ""));
//			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");
//
//		} 
//		else 
			if (PhoneNum.length() >= 2 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 2));
	//			PhoneText.transferFocus();
		}
	}	
	
	// PhoneNum1 검사
	public static void PhoneCheck1 (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

		if (PhoneDigitCheck(PhoneNum) == false) {
			String a;
			a = PhoneNum;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");

		} 
		else
			if (PhoneNum.length() >= 3 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 3));
				PhoneText.transferFocus();
		}
	}	



	// phoneNum2 검사
	public static void PhoneCheck2 (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

		if (PhoneDigitCheck(PhoneNum) == false) {
			String a;
			a = PhoneNum;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");

		} 
		else 
			if (PhoneNum.length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 4));
				PhoneText.transferFocus();
		}
	}	

	// phoneNum3 검사
	public static void PhoneCheck3 (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

		if (PhoneDigitCheck(PhoneNum) == false) {
			String a;
			a = PhoneNum;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");

		} 
		else 
			if (PhoneNum.length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 4));
		}
	}
	
	// PhoneNum1 검사
	public static void SellPhoneCheck1 (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

//		if (PhoneDigitCheck(PhoneNum) == false) {
//			String a;
//			a = PhoneNum;
//			PhoneText.setText(a.replaceAll("[^0-9]", ""));
//			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");
//
//		} 
//		else
			if (PhoneNum.length() >= 3 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 3));
				PhoneText.transferFocus();
		}
	}	



	// phoneNum2 검사
	public static void SellPhoneCheck2 (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

//		if (PhoneDigitCheck(PhoneNum) == false) {
//			String a;
//			a = PhoneNum;
//			PhoneText.setText(a.replaceAll("[^0-9]", ""));
//			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");
//
//		} 
//		else 
			if (PhoneNum.length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 4));
				PhoneText.transferFocus();
		}
	}	

	// phoneNum3 검사
	public static void SellPhoneCheck3 (String PhoneNum, JTextField PhoneText, KeyEvent e, JPanel pnl) {

//		if (PhoneDigitCheck(PhoneNum) == false) {
//			String a;
//			a = PhoneNum;
//			PhoneText.setText(a.replaceAll("[^0-9]", ""));
//			JOptionPane.showMessageDialog(pnl, "숫자만 입력해주세요.");
//
//		} 
//		else 
			if (PhoneNum.length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 4));
		}
	}
	
	// 중복확인
	public static boolean IdDoubleCheck(ArrayList<String> IdList, boolean doubleCheckOk, JButton OverlapBtn, JTextField IdTxt, String IdText, JPanel pnl) {
		boolean sameId = false;
		
		if (!(doubleCheckOk == true)) {
			if (IdText.length() >= 7) {
				
				for (int i = 0; i < IdList.size(); i++) {
					if (IdList.get(i).equals(IdText)) {
						sameId = true;
					}
				}
				
				if (sameId == true) {
					JOptionPane.showMessageDialog(pnl, "이미 존재하는 ID 입니다.");
					return false;
				}
				else {
					
					int result = JOptionPane.showConfirmDialog(pnl, "사용가능한 ID입니다. 사용하시겠습니까?",
							"Confirm", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.CLOSED_OPTION) {
						return false;
					}
					else if (result == JOptionPane.YES_OPTION) {
						IdTxt.setEnabled(false);
						OverlapBtn.setText("ID수정하기");
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				
				JOptionPane.showMessageDialog(pnl, "ID를 7문자 이상 작성해 주세요.");
				return false;
			}
		}
		else  {
			OverlapBtn.setText("중복");
			IdTxt.setEnabled(true);
			return false;
		}
	}
	
	






} 