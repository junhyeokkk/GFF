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

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class SellerFirst extends JFrame {
   private JPanel panel;
   private JButton AddMyRest;
   private JButton LogOutBtn;
   
   
   private GroupLayout groupLayout;
   private JButton MyRestList;

   public SellerFirst() {
	   showView();
	   listener();
   }
   
   private void showView() {
	   
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

//	      JButton BackBtn = new JButton("<- 뒤로");
//	      BackBtn.setBounds(0, 0, 67, 34);
//	      BackBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
//	      panel.add(BackBtn);
	      
	      LogOutBtn = new JButton("LogOut");
	      LogOutBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
	      LogOutBtn.setBounds(260, 366, 65, 34);
	      panel.add(LogOutBtn);

	      JLabel SellerMyLbl = new JLabel("판매자 초기화면");
	      SellerMyLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
	      SellerMyLbl.setBackground(Color.WHITE);
	      SellerMyLbl.setHorizontalAlignment(SwingConstants.CENTER);
	      SellerMyLbl.setBounds(79, 2, 183, 32);
	      panel.add(SellerMyLbl);
	      
	      JLabel SellerName = new JLabel(LoginCenter.getInstance().getSelInfo().getName() + "님 반갑습니다.");
	      SellerName.setHorizontalAlignment(SwingConstants.CENTER);
	      SellerName.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
	      SellerName.setBounds(0, 123, 325, 60);
	      panel.add(SellerName);
	      
	      MyRestList = new JButton("내 음식점 목록");
	      MyRestList.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
	      MyRestList.setBounds(0, 210, 325, 60);
	      panel.add(MyRestList);

	      AddMyRest = new JButton("내 음식점 추가");
	      AddMyRest.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
	      AddMyRest.setBounds(0, 280, 325, 60);
	      panel.add(AddMyRest);
	      
	      setResizable(false);
	      setSize(360, 640);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }
   
   private void listener() {
	   
	   		// 음식점 추가 버튼 눌렀을때
	      AddMyRest.addActionListener(new ActionListener() {
	          @Override
	          public void actionPerformed(ActionEvent e) {
	             new AddRest().setVisible(true);
	             
	          }
	       });
	      
	      	// 내 음식점 목록 버튼 눌렀을때
	      MyRestList.addActionListener(new ActionListener() {
	          @Override
	          public void actionPerformed(ActionEvent e) {
	             new MyRestList().setVisible(true);
	          }
	       });
	      
	      LogOutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				dispose();	
			}
		});
	      
   }

   public static void main(String[] args) {

      new SellerFirst().setVisible(true);
   }
}