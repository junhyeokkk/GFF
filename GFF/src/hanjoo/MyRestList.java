package hanjoo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class MyRestList extends JFrame {
	private JPanel panel;
	private GroupLayout groupLayout;
	private int y = 120;
	private int z = 85;
	private int total;
	private ArrayList<JButton> btnbl;
	private ArrayList<FoodShop> foodList;

	public MyRestList() {
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setBounds(0, 0, 344, 601);
		getContentPane().add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(198, 239, 206));
		scrollPane.setViewportView(panel);

		groupLayout = new GroupLayout(panel);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING).addGap(0, 340, Short.MAX_VALUE));

		panel.setLayout(groupLayout);

		JButton BackBtn = new JButton("<- 뒤로");
		BackBtn.setBounds(0, 0, 67, 34);
		BackBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		panel.add(BackBtn);

		JButton HomeBtn = new JButton("home");
		HomeBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		HomeBtn.setBounds(260, 0, 65, 34);
		panel.add(HomeBtn);

		JLabel MYRestList = new JLabel("내 음식점 목록");
		MYRestList.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		MYRestList.setBackground(Color.WHITE);
		MYRestList.setHorizontalAlignment(SwingConstants.CENTER);
		MYRestList.setBounds(79, 2, 183, 32);
		panel.add(MYRestList);
		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		foodList = Method.SeladdPnl(panel, groupLayout);

		int y = 120;
		int z = 85;
		int total = 0;

		for (int j = 0; j < foodList.size(); j++) {

			JPanel RestPnl = new JPanel();
			RestPnl.setBounds(0, y, 330, 75);
			panel.add(RestPnl);
			RestPnl.setLayout(null);
			y += z;

			JLabel RestID = new JLabel("상호명");
			RestID.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
			RestID.setBounds(74, 10, 165, 58);
			RestPnl.add(RestID);
			RestID.setText(String.valueOf(foodList.get(j).getS_name()));

			JButton DeleteBtn = new JButton("삭제");
			DeleteBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
			DeleteBtn.setBounds(251, 10, 67, 23);
			RestPnl.add(DeleteBtn);

			JButton jb = new JButton("상세정보");
			jb.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
			jb.setBounds(251, 43, 67, 23);
			RestPnl.add(jb);
			
			jb.addActionListener(detailBtnAction(foodList.get(j).getS_id()));
			
			

			JLabel Img = new JLabel("사진담으셍");
			Img.setBounds(5, 10, 55, 55);
			RestPnl.add(Img);
			Img.setText(String.valueOf(foodList.get(j).getShop_pic()));

			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup().addGap(0, total + y, Short.MAX_VALUE)));

		}

//      HomeBtn2 = Method.SeladdPnl(panel, groupLayout).get(0)
//      jj.add(Method.SeladdPnl(panel, groupLayout).get(0));
//		addDetailListener();
	}


	
	
	private static void getFoodShopInfo() {
		
	}
	

	/**
	 * 각 메뉴의 [상세정보] 조회를 위한 액션
	 * s_id(식당 고유키)를 파라미터로 받음
	 * 
	 * @param s_id
	 * @return
	 */

	private ActionListener detailBtnAction(int s_id) {
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(s_id);
				
				Method.getDetailRestInfo(s_id);
				
				System.out.println("겟인스턴스푸드인포:    " + LoginCenter.getInstance().getFoodInfo().getS_name());
				new SellerRestDetail().setVisible(true);
				
				
				
				
				
				//상세화면을 조회화는 JFrame이 열려야함 . 
				//상세화면을 열 때 필요한 데이터를 shopInfo에 담아서 쓰면 될 것으로 생각이 됨

			}
		};
		return actionListener;
	}

	public static void main(String[] args) {

		new MyRestList().setVisible(true);
	}
}