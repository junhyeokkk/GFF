package hanjoo;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class MyPage extends JFrame {
   private JPanel panel;
   LoginCenter logincenter;
   private ArrayList<Member> memberList;  
   
   public MyPage() {

     memberList = logincenter.getInstance().getMemberList();
      panel = new JPanel();
      panel.setBackground(new Color(198, 239, 206));
      getContentPane().add(panel);
      panel.setLayout(null);

      JButton BackBtn = new JButton("<- 뒤로");
      BackBtn.setBounds(0, 0, 67, 34);
      BackBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      panel.add(BackBtn);
      BackBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FirstPage().setVisible(true);
            dispose();
         }
      });

      JButton HomeBtn = new JButton("home");
      HomeBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      HomeBtn.setBounds(279, 0, 65, 34);
      panel.add(HomeBtn);

      
      
      JLabel MY = new JLabel("My그푸파");
      MY.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      MY.setBackground(Color.WHITE);
      MY.setHorizontalAlignment(SwingConstants.CENTER);
      MY.setBounds(79, 2, 183, 32);
      panel.add(MY);
      
      JLabel UserGrade = new JLabel("쌍큐한분");
      UserGrade.setBackground(Color.WHITE);
      UserGrade.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserGrade.setHorizontalAlignment(SwingConstants.CENTER);
      UserGrade.setBounds(0, 117, 344, 50);
      panel.add(UserGrade);
      UserGrade.setText(memberList.get(0).getGrade());
      
      JLabel UserName = new JLabel("김정욱");
      UserName.setHorizontalAlignment(SwingConstants.CENTER);
      UserName.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserName.setBackground(Color.WHITE);
      UserName.setBounds(0, 68, 344, 50);
      panel.add(UserName);
      UserName.setText(memberList.get(0).getName());
      
      JLabel UserID = new JLabel("UserID");
      UserID.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserID.setBackground(Color.WHITE);
      UserID.setBounds(0, 203, 75, 50);
      panel.add(UserID);
       
      
      JLabel UserID1 = new JLabel("wjddnr1111");
      UserID1.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserID1.setBackground(Color.WHITE);
      UserID1.setBounds(87, 203, 204, 50);
      panel.add(UserID1);
      UserID1.setText(memberList.get(0).getId());
      
      JLabel UserTel = new JLabel("UserTel");
      UserTel.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserTel.setBackground(Color.WHITE);
      UserTel.setBounds(0, 263, 75, 50);
      panel.add(UserTel);
      
      JLabel UserTel1 = new JLabel("010");
      UserTel1.setHorizontalAlignment(SwingConstants.CENTER);
      UserTel1.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserTel1.setBackground(Color.WHITE);
      UserTel1.setBounds(87, 263, 60, 50);
      panel.add(UserTel1);
      
      
      JLabel UserTel2 = new JLabel("1111");
      UserTel2.setHorizontalAlignment(SwingConstants.CENTER);
      UserTel2.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserTel2.setBackground(Color.WHITE);
      UserTel2.setBounds(159, 263, 60, 50);
      panel.add(UserTel2);
      
      JLabel UserID_1_1_2 = new JLabel("1111");
      UserID_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
      UserID_1_1_2.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserID_1_1_2.setBackground(Color.WHITE);
      UserID_1_1_2.setBounds(231, 263, 60, 50);
      panel.add(UserID_1_1_2);
      
      JLabel Hypen = new JLabel("-");
      Hypen.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      Hypen.setBackground(Color.WHITE);
      Hypen.setBounds(143, 260, 14, 56);
      panel.add(Hypen);
      
      JLabel Hypen2 = new JLabel("-");
      Hypen2.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      Hypen2.setBackground(Color.WHITE);
      Hypen2.setBounds(220, 260, 14, 56);
      panel.add(Hypen2);
      
      JLabel UserAd = new JLabel("UserAd");
      UserAd.setFont(new Font("휴먼모음T", Font.BOLD, 21));
      UserAd.setBackground(Color.WHITE);
      UserAd.setBounds(0, 323, 75, 50);
      panel.add(UserAd);
      
      JLabel UserAd1 = new JLabel("부산광역시 금정구 중앙대로 2120");
      UserAd1.setFont(new Font("휴먼모음T", Font.BOLD, 13));
      UserAd1.setBackground(Color.WHITE);
      UserAd1.setBounds(87, 323, 204, 50);
      panel.add(UserAd1);
      UserAd1.setText(memberList.get(0).getCurrent_address());
      
      JButton LogOutBtn = new JButton("LogOut");
      LogOutBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      LogOutBtn.setBounds(190, 441, 97, 34);
      panel.add(LogOutBtn);
      
      JButton ChangeTelBtn = new JButton("ChangeTel");
      ChangeTelBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      ChangeTelBtn.setBounds(313, 273, 31, 34);
      panel.add(ChangeTelBtn);
      
      JButton ChangeAdressBtn = new JButton("ChangeAdress");
      ChangeAdressBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      ChangeAdressBtn.setBounds(313, 333, 31, 34);
      panel.add(ChangeAdressBtn);
      
      JButton ReviewBtn = new JButton("내 리뷰우");
      ReviewBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
      ReviewBtn.setBounds(65, 441, 97, 34);
      panel.add(ReviewBtn);
      

      
      
      setSize(360, 640);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

   public static void main(String[] args) {

      new MyPage().setVisible(true);
   }
}