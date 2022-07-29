package hanjoo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
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
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class AddRest extends JDialog {
   private JTextField textField;
   private JTextField AddRestNameTxt;
   private JTextField AddRestTelTxt1;
   private JTextField AddRestTelTxt2;
   private JTextField AddRestTelTxt3;
   private JTextField AddMinAmountTxt;
   private JTextField AddDelivaryTipTxt;
   private JButton AddComplete;
   private JPanel pnl;
   private JComboBox AddAdressCom;
   private JButton AddBackWard;
   private JButton addCategoryBtn;
   private JComboBox AddCategoryCom;
   private JButton RemoveCtg1;
   
   
   private HashMap<String, Integer> AreaKey;
   
   private int shopUniqueNumber;

   private JButton RemoveCtg3;
   private JButton RemoveCtg2;
   private JLabel LabelCtg0;
   private JLabel LabelCtg1;
   private JLabel LabelCtg2;
   private JTextField DuringTime1;
   private JTextField DuringTime2;
   private JTextField DuringTime4;
   private JTextField DuringTime3;
   private JLabel lblNewLabel_1;
   private JLabel lblNewLabel_2;

   
   public AddRest() {
      ShowView();
      Listener();
   }

   private void ShowView() {

      pnl = new JPanel();
      pnl.setBackground(new Color(198, 239, 206));

      getContentPane().add(pnl);
      pnl.setLayout(null);

      JLabel AddRestaurant = new JLabel("가게추가");
      AddRestaurant.setFont(new Font("휴먼모음T", Font.BOLD, 45));
      AddRestaurant.setHorizontalAlignment(SwingConstants.CENTER);
      AddRestaurant.setBounds(12, 10, 320, 65);
      pnl.add(AddRestaurant);

      JLabel AddRestName = new JLabel("가게이름");
      AddRestName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddRestName.setBounds(12, 110, 97, 40);
      pnl.add(AddRestName);

      JLabel AddRestTel = new JLabel("전화번호");
      AddRestTel.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddRestTel.setBounds(12, 350, 97, 40);
      pnl.add(AddRestTel);

      AddRestNameTxt = new JTextField();
      AddRestNameTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      AddRestNameTxt.setBounds(110, 111, 180, 40);
      pnl.add(AddRestNameTxt);
      AddRestNameTxt.setColumns(10);

      AddRestTelTxt1 = new JTextField();
      AddRestTelTxt1.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      AddRestTelTxt1.setColumns(10);
      AddRestTelTxt1.setBounds(110, 350, 50, 40);
      pnl.add(AddRestTelTxt1);

      AddRestTelTxt2 = new JTextField();
      AddRestTelTxt2.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      AddRestTelTxt2.setColumns(10);
      AddRestTelTxt2.setBounds(178, 350, 50, 40);
      pnl.add(AddRestTelTxt2);

      AddRestTelTxt3 = new JTextField();
      AddRestTelTxt3.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      AddRestTelTxt3.setColumns(10);
      AddRestTelTxt3.setBounds(240, 350, 50, 40);
      pnl.add(AddRestTelTxt3);

      AddComplete = new JButton("추가완료");
      AddComplete.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddComplete.setBounds(40, 551, 97, 40);
      pnl.add(AddComplete);

      AddBackWard = new JButton("닫기");
      AddBackWard.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddBackWard.setBounds(205, 551, 97, 40);
      pnl.add(AddBackWard);

      JLabel hyphen = new JLabel("-");
      hyphen.setBounds(163, 350, 19, 40);
      pnl.add(hyphen);

      JLabel hyphen_1 = new JLabel("-");
      hyphen_1.setBounds(231, 343, 19, 40);
      pnl.add(hyphen_1);

      JLabel AddFoodCategory = new JLabel("음식카테고리");
      AddFoodCategory.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddFoodCategory.setBounds(12, 152, 97, 40);
      pnl.add(AddFoodCategory);

      JLabel AddSelID = new JLabel("고유번호");
      AddSelID.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddSelID.setBounds(12, 250, 97, 40);
      pnl.add(AddSelID);

      JLabel AddAdress = new JLabel("주소");
      AddAdress.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddAdress.setBounds(12, 300, 97, 40);
      pnl.add(AddAdress);

      AddAdressCom = new JComboBox();
      AddAdressCom.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      AddAdressCom.setModel(new DefaultComboBoxModel(new String[] { "지역을 선택해주세요", "기장군", "금정구", "해운대구", "북구", "동래구",
            "연제구", "수영구", "부산진구", "남구", "사상구", "사하구", "강서구", "서구", "동구", "중구", "영도구" }));
      AddAdressCom.setBounds(110, 300, 180, 40);
      pnl.add(AddAdressCom);

      JLabel AddMinAmount = new JLabel("최소주문금액");
      AddMinAmount.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddMinAmount.setBounds(12, 400, 97, 40);
      pnl.add(AddMinAmount);

      AddMinAmountTxt = new JTextField();
      AddMinAmountTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      AddMinAmountTxt.setColumns(10);
      AddMinAmountTxt.setBounds(110, 401, 180, 40);
      pnl.add(AddMinAmountTxt);

      JLabel AddDelivaryTip = new JLabel("배달팁");
      AddDelivaryTip.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddDelivaryTip.setBounds(12, 450, 97, 40);
      pnl.add(AddDelivaryTip);

      AddDelivaryTipTxt = new JTextField();
      AddDelivaryTipTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      AddDelivaryTipTxt.setColumns(10);
      AddDelivaryTipTxt.setBounds(110, 451, 180, 40);
      pnl.add(AddDelivaryTipTxt);

      AddCategoryCom = new JComboBox();
      AddCategoryCom.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      AddCategoryCom.setModel(new DefaultComboBoxModel(new String[] { "카테고리를 선택해주세요", "야식", "고기", "국물",
            "치킨&피자", "패스트푸드", "양식", "중식", "일식", "한식", "분식" }));
      AddCategoryCom.setBounds(110, 160, 180, 25);
      pnl.add(AddCategoryCom);

      JLabel AddOperatintTime = new JLabel("운영시간");
      AddOperatintTime.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      AddOperatintTime.setBounds(12, 500, 97, 40);
      pnl.add(AddOperatintTime);

      addCategoryBtn = new JButton("추가");
      addCategoryBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 7));
      addCategoryBtn.setBounds(294, 160, 50, 25);
      pnl.add(addCategoryBtn);

      JLabel ChooseCategory = new JLabel("(최대 3개)");
      ChooseCategory.setFont(new Font("휴먼모음T", Font.BOLD, 13));
      ChooseCategory.setBounds(12, 198, 97, 32);
      pnl.add(ChooseCategory);

      RemoveCtg1 = new JButton("삭제");
      RemoveCtg1.setFont(new Font("휴먼모음T", Font.PLAIN, 7));
      RemoveCtg1.setBounds(294, 192, 50, 15);
      pnl.add(RemoveCtg1);

      LabelCtg0 = new JLabel("");
      LabelCtg0.setBackground(Color.WHITE);
      LabelCtg0.setBounds(110, 192, 180, 15);
      LabelCtg0.setOpaque(true);
      pnl.add(LabelCtg0);

      LabelCtg1 = new JLabel("");
      LabelCtg1.setBackground(Color.WHITE);
      LabelCtg1.setBounds(110, 210, 180, 15);
      LabelCtg1.setOpaque(true);
      pnl.add(LabelCtg1);

      LabelCtg2 = new JLabel("");
      LabelCtg2.setBackground(Color.WHITE);
      LabelCtg2.setBounds(110, 227, 180, 15);
      LabelCtg2.setOpaque(true);
      pnl.add(LabelCtg2);

      RemoveCtg3 = new JButton("삭제");
      RemoveCtg3.setFont(new Font("휴먼모음T", Font.PLAIN, 7));
      RemoveCtg3.setBounds(294, 227, 50, 15);
      pnl.add(RemoveCtg3);

      RemoveCtg2 = new JButton("삭제");
      RemoveCtg2.setFont(new Font("휴먼모음T", Font.PLAIN, 7));
      RemoveCtg2.setBounds(294, 210, 50, 15);
      pnl.add(RemoveCtg2);

      DuringTime1 = new JTextField();
      DuringTime1.setHorizontalAlignment(SwingConstants.CENTER);
      DuringTime1.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      DuringTime1.setColumns(10);
      DuringTime1.setBounds(110, 500, 31, 40);
      pnl.add(DuringTime1);

      DuringTime2 = new JTextField();
      DuringTime2.setHorizontalAlignment(SwingConstants.CENTER);
      DuringTime2.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      DuringTime2.setColumns(10);
      DuringTime2.setBounds(153, 500, 31, 40);
      pnl.add(DuringTime2);

      DuringTime4 = new JTextField();
      DuringTime4.setHorizontalAlignment(SwingConstants.CENTER);
      DuringTime4.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      DuringTime4.setColumns(10);
      DuringTime4.setBounds(259, 500, 31, 40);
      pnl.add(DuringTime4);

      DuringTime3 = new JTextField();
      DuringTime3.setHorizontalAlignment(SwingConstants.CENTER);
      DuringTime3.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      DuringTime3.setColumns(10);
      DuringTime3.setBounds(219, 500, 31, 40);
      pnl.add(DuringTime3);

      JLabel lblNewLabel = new JLabel(":");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(140, 501, 13, 40);
      pnl.add(lblNewLabel);

      lblNewLabel_1 = new JLabel(":");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setBounds(248, 501, 13, 40);
      pnl.add(lblNewLabel_1);

      lblNewLabel_2 = new JLabel("~");
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2.setBounds(183, 501, 34, 40);
      pnl.add(lblNewLabel_2);

      JLabel AddSellerIDTxt = new JLabel(Integer.toString(LoginCenter.getInstance().getSelInfo().getSel_id()));
      AddSellerIDTxt.setForeground(Color.BLACK);
      AddSellerIDTxt.setBackground(Color.WHITE);
      AddSellerIDTxt.setHorizontalAlignment(SwingConstants.CENTER);
      AddSellerIDTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      AddSellerIDTxt.setBounds(110, 250, 180, 40);
      AddSellerIDTxt.setOpaque(true);
      pnl.add(AddSellerIDTxt);

      setResizable(false);
      setSize(360, 640);


   }

   private void Listener() {

      // 카테고리 리스트 추가
      addCategoryBtn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            String a = AddCategoryCom.getSelectedItem().toString();

            if (!(LabelCtg0.getText() == "") && !(LabelCtg1.getText() == "") && !(LabelCtg2.getText() == "")) {
               JOptionPane.showMessageDialog(AddRest.this, "더이상 추가할 수 없습니다.");
            } else {

               if (AddCategoryCom.getSelectedItem().toString().equals("카테고리를 선택해주세요")) {

                  JOptionPane.showMessageDialog(AddRest.this, "카테고리를 선택해주세요");
               } else if (LabelCtg0.getText().equals(a) || LabelCtg1.getText().equals(a)
                     || LabelCtg2.getText().equals(a)) {
                  JOptionPane.showMessageDialog(AddRest.this, "해당 카테고리를 이미 선택하셨습니다.");
               } else {

                  if (LabelCtg0.getText().equals("")) {
                     LabelCtg0.setText(a);
                  } else if (LabelCtg1.getText().equals("")) {
                     LabelCtg1.setText(a);
                  } else if (LabelCtg2.getText().equals("")) {
                     LabelCtg2.setText(a);
                  }
               }
            }
         }
      });

      // 카테고리 삭제
      RemoveCtg1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            LabelCtg0.setText("");
         }
      });
      RemoveCtg2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            LabelCtg1.setText("");
         }
      });
      RemoveCtg3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            LabelCtg2.setText("");
         }
      });
      //전화번호 1 체크
      AddRestTelTxt1.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.SellPhoneCheck1(AddRestTelTxt1.getText(), AddRestTelTxt1, e, pnl);
         }
      });
      // 전화번호 2 체크
      AddRestTelTxt2.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.SellPhoneCheck2(AddRestTelTxt2.getText(), AddRestTelTxt2, e, pnl);
         }
      });
      // 전화번호 3 체크
      AddRestTelTxt3.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.SellPhoneCheck2(AddRestTelTxt3.getText(), AddRestTelTxt3, e, pnl);
         }
      });

      DuringTime1.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.TimeCheck(DuringTime1.getText(), DuringTime1, e, pnl);

            if ((Integer.parseInt(DuringTime1.getText())) > 23) {
               JOptionPane.showMessageDialog(pnl, "24시 이상 설정 불가능합니다.");
               DuringTime1.setText("");

            }

         }

      });

      DuringTime1.addFocusListener(new FocusAdapter() {

         @Override
         public void focusLost(FocusEvent e) {
            String result = String.format("%02d", (Integer.parseInt(DuringTime1.getText())));
            DuringTime1.setText(result);

         }

      });

      DuringTime2.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.TimeCheck(DuringTime2.getText(), DuringTime2, e, pnl);
            if ((Integer.parseInt(DuringTime2.getText())) > 59) {
               JOptionPane.showMessageDialog(pnl, "60분 이상 설정 불가능합니다.");
               DuringTime2.setText("");
  
            }
         }

      });

      DuringTime2.addFocusListener(new FocusAdapter() {

         @Override
         public void focusLost(FocusEvent e) {
            String result = String.format("%02d", (Integer.parseInt(DuringTime2.getText())));
            DuringTime2.setText(result);

         }

      });

      DuringTime3.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.TimeCheck(DuringTime3.getText(), DuringTime3, e, pnl);
            if ((Integer.parseInt(DuringTime3.getText())) > 23) {
               JOptionPane.showMessageDialog(pnl, "24시 이상 설정 불가능합니다.");
               DuringTime3.setText("");

            }
         }

      });

      DuringTime3.addFocusListener(new FocusAdapter() {

         @Override
         public void focusLost(FocusEvent e) {
            String result = String.format("%02d", (Integer.parseInt(DuringTime3.getText())));
            DuringTime3.setText(result);

         }

      });

      DuringTime4.addKeyListener(new KeyAdapter() {

         @Override
         public void keyReleased(KeyEvent e) {
            CheckMethod.TimeCheck(DuringTime4.getText(), DuringTime4, e, pnl);
            if ((Integer.parseInt(DuringTime4.getText())) > 59) {
               JOptionPane.showMessageDialog(pnl, "60분 이상 설정 불가능합니다.");
               DuringTime4.setText("");

            }
         }

      });

      DuringTime4.addFocusListener(new FocusAdapter() {

         @Override
         public void focusLost(FocusEvent e) {
            String result = String.format("%02d", (Integer.parseInt(DuringTime4.getText())));
            DuringTime4.setText(result);

         }

      });

      AddComplete.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
        	 
            if (AddRestNameTxt.getText().equals("")) {
               JOptionPane.showMessageDialog(pnl, "가게명을 입력해 주세요.");
            }
            else if (LabelCtg0.getText().equals("") && LabelCtg1.getText().equals("")
                  && LabelCtg2.getText().equals("")) {
               JOptionPane.showMessageDialog(pnl, "카테고리를 설정해 주세요.");
            } 
            else if (AddAdressCom.getSelectedItem().toString().equals("지역을 선택해주세요")) {
               JOptionPane.showMessageDialog(pnl, "주소를 설정해 주세요.");
            } 
            else if (AddRestTelTxt1.getText().length() < 3 || AddRestTelTxt2.getText().length() < 3
                  || AddRestTelTxt3.getText().length() < 4) {
               JOptionPane.showMessageDialog(pnl, "전화번호를 확인해 주세요.");
            } 
            else if (CheckMethod.PhoneDigitCheck(AddRestTelTxt1.getText()) == false ||
            		CheckMethod.PhoneDigitCheck(AddRestTelTxt2.getText()) == false ||
            				CheckMethod.PhoneDigitCheck(AddRestTelTxt3.getText()) == false) {
            	JOptionPane.showMessageDialog(pnl, "전화번호를 확인해 주세요(숫자만 입력가능).");
            }
            else if (AddMinAmountTxt.getText().equals("")) {
               JOptionPane.showMessageDialog(pnl, "최소주문금액을 설정해 주세요.");
            } 
            else if (CheckMethod.PhoneDigitCheck(AddMinAmountTxt.getText()) == false) {
            	JOptionPane.showMessageDialog(pnl, "최소주문금액을 확인해주세요(숫자만 입력가능)");
            }
            else if (AddDelivaryTipTxt.getText().equals("")) {
               JOptionPane.showMessageDialog(pnl, "배달팁을 설정해 주세요.");
            } 
            else if (CheckMethod.PhoneDigitCheck(AddDelivaryTipTxt.getText()) == false) {
        		JOptionPane.showMessageDialog(pnl, "배달팁을 확인해주세요(숫자만 입력가능)");
        	}
            else if (DuringTime1.getText().equals("") || DuringTime2.getText().equals("")
                  || DuringTime3.getText().equals("") || DuringTime4.getText().equals("")) {
               JOptionPane.showMessageDialog(pnl, "운영시간을 설정해 주세요.");
            }
            else if (CheckMethod.PhoneDigitCheck(DuringTime1.getText()) == false ||
        			CheckMethod.PhoneDigitCheck(DuringTime2.getText()) == false ||
        			CheckMethod.PhoneDigitCheck(DuringTime3.getText()) == false ||
        			CheckMethod.PhoneDigitCheck(DuringTime4.getText()) == false
        			) {
        		JOptionPane.showMessageDialog(pnl, "운영시간을 확인해주세요(숫자만 입력가능)");
        	}

            else {
               
               // 가입완료 조건 달성시
               
               
               
               String num = Method.PhoneNumSum(AddRestTelTxt1.getText(), AddRestTelTxt2.getText(),
                     AddRestTelTxt3.getText());
               String openTime = Method.OpenTime(DuringTime1.getText(), DuringTime2.getText(),
                     DuringTime3.getText(), DuringTime4.getText());
               Method.InsertShop(

                     AddRestNameTxt.getText(), LoginCenter.getInstance().getSelInfo().getSel_id(),
                     Method.CheckArea().get(AddAdressCom.getSelectedItem().toString()),
                     AddAdressCom.getSelectedItem().toString(), num, Integer.parseInt(AddMinAmountTxt.getText()),
                     Integer.parseInt(AddDelivaryTipTxt.getText()), openTime

               );
 
               if (!(LabelCtg0.getText().equals(""))) {
                  Method.InsertCat(Method.CheckCategory().get(LabelCtg0.getText()),
                		  Method.shopUniqueNumber());
               }
               if (!(LabelCtg1.getText().equals(""))) {
                  Method.InsertCat(Method.CheckCategory().get(LabelCtg1.getText()),
                		  Method.shopUniqueNumber());
               }
               if (!(LabelCtg2.getText().equals(""))) {
                  Method.InsertCat(Method.CheckCategory().get(LabelCtg2.getText()),
                		  Method.shopUniqueNumber());
               }

               JOptionPane.showMessageDialog(pnl, "가게추가 완료");

               dispose();
            }

         }
      });
      
      AddBackWard.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
	});

   }

   public static void main(String[] args) {
      new AddRest().setVisible(true);
   }
}