package hanjoo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

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
import javax.swing.JComboBox;

public class FirstPage extends JFrame{
   private JTextField textField;
   private JPasswordField passwordField;
   private JTextField FoodSearch;
   private ArrayList<Member> memberList;  
   
   
   public FirstPage() {
      JPanel pnl = new JPanel();
      pnl.setBackground(new Color(198, 239, 206));
      
      getContentPane().add(pnl);
      pnl.setLayout(null);
      
      JButton DeliveryPackaging = new JButton("배달 & 포장");
      DeliveryPackaging.setFont(new Font("휴먼모음T", Font.PLAIN, 29));
      DeliveryPackaging.setBounds(12, 149, 320, 128);
      pnl.add(DeliveryPackaging);
      
//      DeliveryPackaging.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            new FoodCategory().setVisible(true);
//               dispose();
//         }
//      });
      
      JButton MyPageBtn = new JButton("MyPage");
      MyPageBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      MyPageBtn.setBounds(279, 10, 53, 30);
      pnl.add(MyPageBtn);
      
      MyPageBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new MyPage().setVisible(true);
               dispose();
         }
      });
      
      FoodSearch = new JTextField();
      FoodSearch.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      FoodSearch.setText("FoodSearch");
      FoodSearch.setBounds(12, 50, 264, 30);
      pnl.add(FoodSearch);
      FoodSearch.setColumns(10);
      
      JButton FoodSearchBtn = new JButton("FoodSearchBtn");
      FoodSearchBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      FoodSearchBtn.setBounds(279, 50, 53, 30);
      pnl.add(FoodSearchBtn);
      
      JButton PremiumRes1 = new JButton("PremiumRes1");
      PremiumRes1.setFont(new Font("휴먼모음T", Font.BOLD, 17));
      PremiumRes1.setBounds(12, 360, 98, 98);
      pnl.add(PremiumRes1);
      
      JButton PremiumRes2 = new JButton("PremiumRes2");
      PremiumRes2.setFont(new Font("휴먼모음T", Font.BOLD, 17));
      PremiumRes2.setBounds(123, 360, 98, 98);
      pnl.add(PremiumRes2);
      
      JButton PremiumRes3 = new JButton("PremiumRes3");
      PremiumRes3.setFont(new Font("휴먼모음T", Font.BOLD, 17));
      PremiumRes3.setBounds(234, 360, 98, 98);
      pnl.add(PremiumRes3);
      
      JLabel addlabel = new JLabel("New label");
      addlabel.setBounds(12, 10, 264, 30);
      pnl.add(addlabel);
      addlabel.setText(LoginCenter.getInstance().getMyInfo().getCurrent_address());
      
//      JLabel backgroundImg = new JLabel("");
//      backgroundImg.setBackground(Color.WHITE);
//      backgroundImg.setIcon(new ImageIcon(SellerSignUp.class.getResource("/resource/배달부.png")));
//      backgroundImg.setBounds(0, 0, 344, 601);
//      pnl.add(backgroundImg);
      
      
      setSize(360, 640);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      new FirstPage().setVisible(true);
   }
}