
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class SellerFirst extends JFrame {
   private JPanel panel;
   private GroupLayout groupLayout;

   public SellerFirst() {
      getContentPane().setLayout(null);

      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scrollPane.getVerticalScrollBar().setUnitIncrement(16);
      scrollPane.setBounds(0, 0, 344, 601);
      getContentPane().add(scrollPane);

      panel = new JPanel();
      panel.setBackground(new Color(198, 239, 206));
      scrollPane.setViewportView(panel);

      panel.setLayout(groupLayout);
      panel.setLayout(null);
      panel.setLayout(null);

      JButton BackBtn = new JButton("<- 뒤로");
      BackBtn.setBounds(0, 0, 67, 34);
      BackBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      panel.add(BackBtn);
      

      JButton LogOutBtn = new JButton("LogOut");
      LogOutBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
      LogOutBtn.setBounds(260, 366, 65, 34);
      panel.add(LogOutBtn);

      JLabel SellerMyLbl = new JLabel("판매자 초기화면");
      SellerMyLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      SellerMyLbl.setBackground(Color.WHITE);
      SellerMyLbl.setHorizontalAlignment(SwingConstants.CENTER);
      SellerMyLbl.setBounds(79, 2, 183, 32);
      panel.add(SellerMyLbl);
      
      JLabel SellerName = new JLabel("키미노 나마에와");
      SellerName.setHorizontalAlignment(SwingConstants.CENTER);
      SellerName.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
      SellerName.setBounds(0, 123, 325, 60);
      panel.add(SellerName);
      
      JButton MyRestList = new JButton("내 음식점 목록");
      MyRestList.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
      MyRestList.setBounds(0, 210, 325, 60);
      panel.add(MyRestList);
      
      MyRestList.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             new MyRestList().setVisible(true);
             dispose();
          }
       });
      
      JButton AddMyRest = new JButton("내 음식점 추가");
      AddMyRest.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
      AddMyRest.setBounds(0, 280, 325, 60);
      panel.add(AddMyRest);
      
      AddMyRest.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new AddRest().setVisible(true);
            dispose();
         }
      });
      
   
      setSize(360, 640);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);

   }



   public static void main(String[] args) {

      new SellerFirst().setVisible(true);
   }
}