package hanjoo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SellerRestDetail extends JFrame {
	private JPanel panel;
	private int x = 40;
	private int y = 55;
	private int z = 130;

	private int yy = 70;
	private int zz = 160;
	private int xx = 170;
	private int total;
	private JTextField RestName;
	private JTabbedPane tabbedPane;
	private JPanel menuTab;
	private GroupLayout gl_panel;
	private JButton backBtn;
	private JButton homeBtn;
	private JLabel mYReview;
	private JPanel restPnl;
	private JPanel restInfoPnl;
	private JPanel reviewTab;
	private JPanel infoTab;
	private JButton MenuAddBtn;
	private JTextArea RevTxt;
	private int count;
	private int count2;


	public SellerRestDetail() {
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setBounds(0, 0, 344, 600);
		getContentPane().add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(198, 239, 206));
		scrollPane.setViewportView(panel);

		restPnl = new JPanel();
		restPnl.setLayout(null);

		backBtn = new JButton("<- 뒤로");
		backBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));

		homeBtn = new JButton("home");
		homeBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));

		mYReview = new JLabel("내음식점 상세페이지");
		mYReview.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		mYReview.setBackground(Color.WHITE);
		mYReview.setHorizontalAlignment(SwingConstants.CENTER);

		restInfoPnl = new JPanel();
		restInfoPnl.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JScrollPane scrollPane2 = new JScrollPane(tabbedPane);
		panel.add(scrollPane2);
		
		Box box = Box.createVerticalBox();
		for (int i = 0; i < 100; i++) {
            box.add(new JLabel("Hello, StackOverflow!"));
		}
		
		출처: https://unikys.tistory.com/211 [All-round programmer:티스토리]
		// 탭메뉴챵이름.add("탭메뉴명",추가할패널);
		menuTab = new JPanel();
		
		tabbedPane.add(new JScrollPane(menuTab),"        메뉴        " );
		menuTab.setLayout(null);
		infoTab = new JPanel();
		tabbedPane.add(new JScrollPane(infoTab),"        정보        " );
		infoTab.setLayout(null);
//		infoTab.setSize(290, 500);
		reviewTab = new JPanel();
		reviewTab.add(box);
		tabbedPane.add( new JScrollPane(reviewTab),"        리뷰        ");
		reviewTab.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 10, 269, 50);
		reviewTab.add(panel_1);
		panel_1.setLayout(null);

		JLabel Star2 = new JLabel("별점");
		Star2.setHorizontalAlignment(SwingConstants.CENTER);
		Star2.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Star2.setBounds(12, 10, 64, 30);
		panel_1.add(Star2);

		JLabel Star2Img = new JLabel("★");
		Star2Img.setHorizontalAlignment(SwingConstants.CENTER);
		Star2Img.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Star2Img.setBounds(88, 10, 64, 30);
		panel_1.add(Star2Img);

		JLabel Star2Point = new JLabel("5.0");
		Star2Point.setHorizontalAlignment(SwingConstants.CENTER);
		Star2Point.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Star2Point.setBounds(164, 10, 64, 30);
		panel_1.add(Star2Point);

		JPanel RestInfoPnl = new JPanel();
		RestInfoPnl.setBackground(Color.WHITE);
		RestInfoPnl.setBounds(12, 10, 270, 100);
		infoTab.add(RestInfoPnl);
		RestInfoPnl.setLayout(null);

		JLabel RestIntro = new JLabel("가게소개");
		RestIntro.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		RestIntro.setHorizontalAlignment(SwingConstants.CENTER);
		RestIntro.setBounds(0, 0, 78, 25);
		RestInfoPnl.add(RestIntro);

		JTextArea RestInfoLbl = new JTextArea("얄리얄리 얄라셩 얄라리얄라");
		RestInfoLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		RestInfoLbl.setBounds(0, 35, 269, 65);
		RestInfoLbl.enable(false);
		RestInfoPnl.add(RestInfoLbl);

		JButton RestIntroBtn = new JButton("수정");
		RestIntroBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		RestIntroBtn.setBounds(214, 1, 55, 30);
		RestInfoPnl.add(RestIntroBtn);

		JPanel BusinessInfoPnl = new JPanel();
		BusinessInfoPnl.setBackground(Color.WHITE);
		BusinessInfoPnl.setBounds(12, 120, 269, 112);
		infoTab.add(BusinessInfoPnl);
		BusinessInfoPnl.setLayout(null);

		JLabel BusinessIntro = new JLabel("영업정보");
		BusinessIntro.setHorizontalAlignment(SwingConstants.CENTER);
		BusinessIntro.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		BusinessIntro.setBounds(0, 0, 78, 25);
		BusinessInfoPnl.add(BusinessIntro);

		JLabel BusName = new JLabel("상호명");
		BusName.setHorizontalAlignment(SwingConstants.CENTER);
		BusName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		BusName.setBounds(0, 35, 78, 25);
		BusinessInfoPnl.add(BusName);

		JLabel BusTime = new JLabel("운영시간");
		BusTime.setHorizontalAlignment(SwingConstants.CENTER);
		BusTime.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		BusTime.setBounds(0, 61, 78, 25);
		BusinessInfoPnl.add(BusTime);

		JLabel BusTel = new JLabel("전화번호");
		BusTel.setHorizontalAlignment(SwingConstants.CENTER);
		BusTel.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		BusTel.setBounds(0, 86, 78, 25);
		BusinessInfoPnl.add(BusTel);

		JLabel BusNameLbl = new JLabel(LoginCenter.getInstance().getFoodInfo().getS_name());
		BusNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusNameLbl.setBounds(90, 35, 167, 25);
		BusinessInfoPnl.add(BusNameLbl);

		JLabel BusTimeLbl = new JLabel(LoginCenter.getInstance().getFoodInfo().getOper_hour());
		BusTimeLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusTimeLbl.setBounds(90, 61, 167, 25);
		BusinessInfoPnl.add(BusTimeLbl);

		JLabel BustelLbl = new JLabel(LoginCenter.getInstance().getFoodInfo().getTel());
		BustelLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BustelLbl.setBounds(90, 86, 167, 25);
		BusinessInfoPnl.add(BustelLbl);

		JButton BusinessBtn = new JButton("수정");
		BusinessBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		BusinessBtn.setBounds(214, 1, 55, 30);
		BusinessInfoPnl.add(BusinessBtn);

		JPanel SellerInfoPnl = new JPanel();
		SellerInfoPnl.setBounds(12, 242, 269, 112);
		infoTab.add(SellerInfoPnl);
		SellerInfoPnl.setLayout(null);
		SellerInfoPnl.setBackground(Color.WHITE);

		JLabel SellerInfo = new JLabel("사업자정보");
		SellerInfo.setHorizontalAlignment(SwingConstants.CENTER);
		SellerInfo.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		SellerInfo.setBounds(0, 0, 78, 25);
		SellerInfoPnl.add(SellerInfo);

		JLabel SellerName = new JLabel("이름");
		SellerName.setHorizontalAlignment(SwingConstants.CENTER);
		SellerName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		SellerName.setBounds(0, 35, 78, 25);
		SellerInfoPnl.add(SellerName);

		JLabel BusName1 = new JLabel("상호명");
		BusName1.setHorizontalAlignment(SwingConstants.CENTER);
		BusName1.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		BusName1.setBounds(0, 61, 78, 25);
		SellerInfoPnl.add(BusName1);

		JLabel BusAdress = new JLabel("주소");
		BusAdress.setHorizontalAlignment(SwingConstants.CENTER);
		BusAdress.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		BusAdress.setBounds(0, 86, 78, 25);
		SellerInfoPnl.add(BusAdress);

		JLabel SellerNameLbl = new JLabel(LoginCenter.getInstance().getSelInfo().getName());
		SellerNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SellerNameLbl.setBounds(90, 35, 167, 25);
		SellerInfoPnl.add(SellerNameLbl);

		JLabel BusName1Lbl = new JLabel(LoginCenter.getInstance().getFoodInfo().getS_name());
		BusName1Lbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusName1Lbl.setBounds(90, 61, 167, 25);
		SellerInfoPnl.add(BusName1Lbl);

		JLabel BusAdressLbl = new JLabel(LoginCenter.getInstance().getFoodInfo().getS_address());
		BusAdressLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusAdressLbl.setBounds(90, 86, 167, 25);
		SellerInfoPnl.add(BusAdressLbl);

		JButton SellerBtn = new JButton("수정");
		SellerBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		SellerBtn.setBounds(214, 1, 55, 30);
		SellerInfoPnl.add(SellerBtn);

		JLabel MinAmount = new JLabel("최소주문금액");
		MinAmount.setHorizontalAlignment(SwingConstants.CENTER);
		MinAmount.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
		MinAmount.setBounds(12, 10, 90, 30);
		restInfoPnl.add(MinAmount);

		JLabel DeliveryTime = new JLabel("배달소요시간");
		DeliveryTime.setHorizontalAlignment(SwingConstants.CENTER);
		DeliveryTime.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
		DeliveryTime.setBounds(12, 50, 90, 30);
		restInfoPnl.add(DeliveryTime);

		JLabel DeliveryTip = new JLabel("배달팁");
		DeliveryTip.setHorizontalAlignment(SwingConstants.CENTER);
		DeliveryTip.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
		DeliveryTip.setBounds(12, 90, 90, 30);
		restInfoPnl.add(DeliveryTip);

		JLabel MinAmountLbl = new JLabel(String.valueOf(LoginCenter.getInstance().getFoodInfo().getMin_del_price()));
		MinAmountLbl.setHorizontalAlignment(SwingConstants.CENTER);
		MinAmountLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MinAmountLbl.setBounds(114, 10, 90, 30);
		restInfoPnl.add(MinAmountLbl);

		JLabel DelivaryTimeLbl = new JLabel(String.valueOf(LoginCenter.getInstance().getFoodInfo().getDel_time()));
		DelivaryTimeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		DelivaryTimeLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		DelivaryTimeLbl.setBounds(114, 50, 90, 30);
		restInfoPnl.add(DelivaryTimeLbl);

		JLabel DelivaryTipLbl = new JLabel(String.valueOf(LoginCenter.getInstance().getFoodInfo().getMin_del_price()));
		DelivaryTipLbl.setHorizontalAlignment(SwingConstants.CENTER);
		DelivaryTipLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		DelivaryTipLbl.setBounds(114, 90, 90, 30);
		restInfoPnl.add(DelivaryTipLbl);

		JLabel Star = new JLabel("별점");
		Star.setHorizontalAlignment(SwingConstants.CENTER);
		Star.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		Star.setBounds(12, 63, 70, 43);
		restPnl.add(Star);

		JLabel Review = new JLabel("리뷰수");
		Review.setHorizontalAlignment(SwingConstants.CENTER);
		Review.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		Review.setBounds(12, 116, 70, 43);
		restPnl.add(Review);

		JLabel ReviewCount = new JLabel(String.valueOf(LoginCenter.getInstance().getFoodInfo().getRei_cnt()));
		ReviewCount.setHorizontalAlignment(SwingConstants.CENTER);
		ReviewCount.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		ReviewCount.setBounds(87, 116, 70, 43);
		restPnl.add(ReviewCount);

		JLabel Pick = new JLabel("찜수");
		Pick.setHorizontalAlignment(SwingConstants.CENTER);
		Pick.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		Pick.setBounds(162, 116, 70, 43);
		restPnl.add(Pick);

		JLabel PickCount = new JLabel(String.valueOf(LoginCenter.getInstance().getFoodInfo().getDibs_cnt()));
		PickCount.setHorizontalAlignment(SwingConstants.CENTER);
		PickCount.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		PickCount.setBounds(237, 116, 70, 43);
		restPnl.add(PickCount);

		RestName = new JTextField();
		RestName.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		RestName.setHorizontalAlignment(SwingConstants.CENTER);
		RestName.setText(LoginCenter.getInstance().getFoodInfo().getS_name());
		RestName.setBounds(12, 10, 240, 43);
		restPnl.add(RestName);
		RestName.setColumns(10);

		JButton RestNameBtn = new JButton("수정");
		RestNameBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		RestNameBtn.setBounds(260, 10, 58, 43);
		restPnl.add(RestNameBtn);

		JLabel StarImg = new JLabel("★");
		StarImg.setHorizontalAlignment(SwingConstants.CENTER);
		StarImg.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		StarImg.setBounds(87, 63, 70, 43);
		restPnl.add(StarImg);

		JLabel StarPoint = new JLabel(String.valueOf(LoginCenter.getInstance().getFoodInfo().getRating()));
		StarPoint.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		StarPoint.setBounds(164, 63, 154, 43);
		restPnl.add(StarPoint);
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addComponent(backBtn).addGap(12)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(mYReview, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addGap(181).addComponent(homeBtn,
										GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))))
				.addComponent(restPnl, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup().addGap(22).addComponent(restInfoPnl,
						GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup().addGap(15).addComponent(tabbedPane,
						GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)));

		panel.setLayout(gl_panel);

		MenuAddBtn = new JButton("추가");
		MenuAddBtn.setBounds(12, 10, 57, 36);
		menuTab.add(MenuAddBtn);
		MenuAddBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));

		MenuAddBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton MenuModifyBtn = new JButton("수정");
		MenuModifyBtn.setBounds(120, 10, 57, 36);
		menuTab.add(MenuModifyBtn);
		MenuModifyBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));

		JButton MenuDelBtn = new JButton("삭제");
		MenuDelBtn.setBounds(224, 10, 57, 36);
		menuTab.add(MenuDelBtn);
		MenuDelBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));

		JButton MinAmountBtn = new JButton("수정");
		MinAmountBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		MinAmountBtn.setBounds(216, 10, 55, 30);
		restInfoPnl.add(MinAmountBtn);

		MinAmountBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, "최소주문금액을 수정해주세요");
			}
		});

		JButton DeliveryTimeBtn = new JButton("수정");
		DeliveryTimeBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		DeliveryTimeBtn.setBounds(216, 50, 55, 30);
		restInfoPnl.add(DeliveryTimeBtn);

		DeliveryTimeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, "배달소요시간을 수정해주세요");
			}
		});

		JButton DeliveryTipBtn = new JButton("수정");
		DeliveryTipBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		DeliveryTipBtn.setBounds(216, 90, 55, 30);
		restInfoPnl.add(DeliveryTipBtn);

		DeliveryTipBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, "배달팁을 수정해주세요");
			}
		});
		
		
		ArrayList<Menu> menuList = new ArrayList<>();
		menuList = Method.myMenuList(LoginCenter.getInstance().getFoodInfo().getS_id());
		addMenuPnl(menuList);
		
		
		MenuAddBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddMenu().setVisible(true);
			}
		});

		
		addRevPnl();

		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void addRevPnl() {
		count2++;

		JPanel RevPnl = new JPanel();
		RevPnl.setBounds(12, yy, 269, 150);
		reviewTab.add(RevPnl);
		RevPnl.setLayout(null);
		RevPnl.setBackground(Color.WHITE);
		yy += zz;

		JLabel RevUserName = new JLabel("유저이름");
		RevUserName.setHorizontalAlignment(SwingConstants.CENTER);
		RevUserName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		RevUserName.setBounds(0, 2, 78, 25);
		RevPnl.add(RevUserName);

		JLabel RevMenu = new JLabel("주문메뉴");
		RevMenu.setHorizontalAlignment(SwingConstants.CENTER);
		RevMenu.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		RevMenu.setBounds(0, 33, 78, 25);
		RevPnl.add(RevMenu);

		JLabel RevUserLbl = new JLabel("받아온 값");
		RevUserLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		RevUserLbl.setBounds(90, 3, 104, 25);
		RevPnl.add(RevUserLbl);

		JLabel RevMenuLbl = new JLabel("받아온 값");
		RevMenuLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		RevMenuLbl.setBounds(90, 33, 167, 25);
		RevPnl.add(RevMenuLbl);

		JButton RevBtn = new JButton("삭제");
		RevBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 9));
		RevBtn.setBounds(214, 1, 55, 30);
		RevPnl.add(RevBtn);

		RevTxt = new JTextArea();
		RevTxt.setText("쳐묵쳐묵하니 쳐 지기네");
		RevTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		RevTxt.setBounds(10, 68, 247, 72);
		RevPnl.add(RevTxt);
		RevTxt.setEnabled(false);
		RevTxt.setColumns(10);
		System.out.println(count2);
		
		
//		tabbedPane.addChangeListener(new ChangeListener() {
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				if (tabbedPane.getSelectedIndex() == 1) {
//					panel.setPreferredSize(new Dimension(290, 780));
//				} else if (tabbedPane.getSelectedIndex() == 2){
//					panel.setPreferredSize(new Dimension(290,500 + (count2 * 160)));
//					gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
//							.addGroup(gl_panel.createSequentialGroup()
//									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
//											.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
//											.addGroup(gl_panel.createSequentialGroup().addGap(2).addComponent(mYReview,
//													GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
//											.addComponent(homeBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
//									.addGap(18).addComponent(restPnl, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
//									.addGap(18)
//									.addComponent(restInfoPnl, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
//									.addGap(18)
//									.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, zz + yy, GroupLayout.PREFERRED_SIZE)));
//				} 
//			}
//		});

		
		
	}
	
	public void addMenuPnl(ArrayList<Menu> mml) {
		
		for (int i = 0; i < mml.size(); i++) {
			count++;
			
			JPanel MenuAddPnl = new JPanel();
			MenuAddPnl.setBackground(Color.WHITE);
			MenuAddPnl.setBounds(12, y, 269, 120);
			menuTab.add(MenuAddPnl);
			MenuAddPnl.setLayout(null);
			y += z;
			JLabel MenuName = new JLabel(mml.get(i).getMenu_name());
			JLabel OrderCountLbl = new JLabel(toString().valueOf(mml.get(i).getOrd_cnt()));
			JLabel MenuPrice = new JLabel(toString().valueOf(mml.get(i).getMenu_price()));
			
//			lbl.add(new JLabelList(MenuName, OrderCountLbl, MenuPrice));
//			for (int i = 0; i < mml.size(); i++) {
//				lbl.get(i).getLb1().setText(mml.get(i).getMenu_name());
//			}
			
			MenuName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
			MenuName.setBounds(77, 10, 160, 30);
			MenuAddPnl.add(MenuName);

			
			MenuPrice.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
			MenuPrice.setBounds(77, 50, 180, 30);
			MenuAddPnl.add(MenuPrice);

			JLabel OrderCount = new JLabel("주문횟수");
			OrderCount.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
			OrderCount.setBounds(12, 90, 53, 20);
			MenuAddPnl.add(OrderCount);

			
			OrderCountLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
			OrderCountLbl.setBounds(77, 90, 180, 20);
			MenuAddPnl.add(OrderCountLbl);

			JLabel MenuNameLbl = new JLabel("메뉴이름");
			MenuNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
			MenuNameLbl.setBounds(12, 10, 53, 30);
			MenuAddPnl.add(MenuNameLbl);

			JLabel Price_1 = new JLabel("가격");
			Price_1.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
			Price_1.setBounds(12, 50, 53, 30);
			MenuAddPnl.add(Price_1);

			JCheckBox MenuCheck = new JCheckBox("");
			MenuCheck.setBackground(Color.WHITE);
			MenuCheck.setBounds(245, 0, 24, 30);
			MenuAddPnl.add(MenuCheck);

			gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panel.createSequentialGroup().addGap(2).addComponent(mYReview,
											GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
									.addComponent(homeBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(18).addComponent(restPnl, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(restInfoPnl, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, x + y, GroupLayout.PREFERRED_SIZE)));
			
			System.out.println(x + y);
			System.out.println(count);
			
			tabbedPane.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					if (tabbedPane.getSelectedIndex() == 1) {
						panel.setPreferredSize(new Dimension(290, 780));
					} else if (tabbedPane.getSelectedIndex() == 0){
						panel.setPreferredSize(new Dimension(290,485 + (count * 129)));
					} 
				}
			});
		}
		
		
		
	}
	

	

	public static void main(String[] args) {

		new SellerRestDetail().setVisible(true);
	}
}
