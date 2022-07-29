package hanjoo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.sun.xml.internal.ws.api.server.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class MyRestList extends JFrame {
	private JPanel panel;
	private GroupLayout groupLayout;
	private int y = 10;
	private int z = 85;
	private int total;
	private JScrollPane scrollPane;
	private JButton DeleteBtn;
	private ArrayList<JButton> btnbl;
	private ArrayList<FoodShop> foodList;
	private foodShopPanel fsp;
	private ArrayList<foodShopPanel> foodShopPanels = new ArrayList<foodShopPanel>();
	private ArrayList<JPanel> panelList = new ArrayList<JPanel>();
	private int index;
	

	public MyRestList() {
		showView();
		function();
		listener();
		

	}
	// UI
	private void showView() {
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(198, 239, 206));
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setBounds(0, 114, 344, 487);
		getContentPane().add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(198, 239, 206));
		scrollPane.setViewportView(panel);

		groupLayout = new GroupLayout(panel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 340, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 468, Short.MAX_VALUE)
		);

		panel.setLayout(groupLayout);
		
		JButton BackBtn = new JButton("<- 뒤로");
		BackBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		BackBtn.setBounds(0, 0, 67, 34);
		getContentPane().add(BackBtn);
		
		JLabel MYRestList = new JLabel("내 음식점 목록");
		MYRestList.setHorizontalAlignment(SwingConstants.CENTER);
		MYRestList.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		MYRestList.setBackground(Color.WHITE);
		MYRestList.setBounds(79, 2, 183, 32);
		getContentPane().add(MYRestList);
		
		JButton HomeBtn = new JButton("home");
		HomeBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		HomeBtn.setBounds(260, 0, 65, 34);
		getContentPane().add(HomeBtn);
		
		setResizable(false);
		setSize(360, 640);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		foodList = Method.SeladdPnl();
		
			int y = 10;
			int z = 85;
			
		for (int j = 0; j < foodList.size(); j++) {
						
			panel.add(Method.panelList(foodShopPanels, foodList, scrollPane, groupLayout).get(j));
	}
		
	}
	
	// 리스너
	private void listener() {
		
			foodShopPanels.get(0).getRemove().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("사이즈" + foodShopPanels.size());
					
					System.out.println("이버튼의 인덱스는???:  " + 0);
					
				}
			});
			
			foodShopPanels.get(1).getRemove().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("이버튼의 인덱스는???:  " + 1);
					
				}
			});
		
		
	}
	
	// 기능
	private void function() {
		
		
		
		
//		foodList = Method.SeladdPnl();
//		
//		for (int i = 0; i < foodList.size(); i++) {
//			panel.add(Method.panelList(foodList, groupLayout).get(i));
//			Method.panelList(foodList, groupLayout).get(i).
//		}
//		
//		
//		Method.deleteCreate(removeBtn, foodList, panel, groupLayout);
		
		
		
	}
	
	public static void main(String[] args) {

		new MyRestList().setVisible(true);
	}
}