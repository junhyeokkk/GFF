
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

public class Category extends JFrame {
   private JPanel panel;
   private int y = 120;
   private int z = 80;
   int total;
   private GroupLayout gl_panel;

   public Category() {
      getContentPane().setLayout(null);

      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scrollPane.getVerticalScrollBar().setUnitIncrement(16);
      scrollPane.setBounds(0, 0, 344, 601);
      getContentPane().add(scrollPane);

      panel = new JPanel();
      panel.setBackground(new Color(198, 239, 206));
      scrollPane.setViewportView(panel);
      

      gl_panel = new GroupLayout(panel);
      gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
            .addGap(0, 340, Short.MAX_VALUE));
      
      

      panel.setLayout(gl_panel);

      ////////////// 그룹 레이아웃 //////////////
      JLabel restLbl = new JLabel("음식쩜쓰");
      restLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      panel.add(restLbl);
      restLbl.setBounds(130, 0, 75, 30);
      
      
      JButton Back = new JButton("<- 뒤로");
      Back.setBounds(0, 0, 75, 30);
      Back.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
      panel.add(Back);
      Back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FoodCategory().setVisible(true);
            dispose();
         }
      });
      
      

      JButton HomeBtn = new JButton("home");
      HomeBtn.setBounds(290, 0, 30, 30);
      panel.add(HomeBtn);

      JPanel restPnl = new JPanel();
      restPnl.setBounds(0, 120, 318, 76);
      panel.add(restPnl);
      restPnl.setLayout(null);

      JLabel restImg = new JLabel("가게 이미지");
      restImg.setBounds(12, 10, 57, 56);
      restPnl.add(restImg);

      JLabel restName = new JLabel("존나맛있다람이");
      restName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      restName.setBounds(81, 10, 170, 32);
      restPnl.add(restName);

      JLabel minOrder = new JLabel("New label");
      minOrder.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      minOrder.setBounds(81, 43, 99, 23);
      minOrder.setText("최소주문");
      restPnl.add(minOrder);

      JLabel star = new JLabel("");
      star.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      star.setBounds(263, 16, 39, 23);
      star.setText("★ 5.0");
      restPnl.add(star);

      JLabel riderTip = new JLabel("배달팁");
      riderTip.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      riderTip.setBounds(203, 43, 99, 23);
      restPnl.add(riderTip);
      

      setSize(360, 640);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

   public void addPnl() {
      y += z;

      JPanel restPnl = new JPanel();
      restPnl.setBounds(0, y, 318, 76);
      panel.add(restPnl);
      restPnl.setLayout(null);

      JLabel restImg = new JLabel("가게 이미지");
      restImg.setBounds(12, 10, 57, 56);
      restPnl.add(restImg);

      JLabel restName = new JLabel("존나맛있다람이");
      restName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
      restName.setBounds(81, 10, 170, 32);
      restPnl.add(restName);

      JLabel minOrder = new JLabel("New label");
      minOrder.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      minOrder.setBounds(81, 43, 99, 23);
      minOrder.setText("최소주문");
      restPnl.add(minOrder);

      JLabel star = new JLabel("");
      star.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      star.setBounds(263, 16, 39, 23);
      star.setText("★ 5.0");
      restPnl.add(star);

      JLabel riderTip = new JLabel("배달팁");
      riderTip.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
      riderTip.setBounds(203, 43, 99, 23);
      restPnl.add(riderTip);
      
      gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup().addGap(0, total + y, Short.MAX_VALUE)));

   }

   public static void main(String[] args) {

      new Category().setVisible(true);
   }
}