

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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

public class UserRestDetail extends JFrame {
	private JPanel panel;
	private int x = 30;
	private int y = 40;
	private int z = 130;

	private int yy = 70;
	private int zz = 160;
	private int xx = 160;
	private int total;
	private JTextField RestName;
	private JTabbedPane tabbedPane;
	private JPanel menuTab;
	private GroupLayout gl_panel;
	private JButton backBtn;
	private JButton homeBtn;
	private JLabel RestDetail;
	private JPanel restPnl;
	private JPanel restInfoPnl;
	private JPanel reviewTab;
	private JPanel infoTab;
	private JTextArea RevTxt;
	private JScrollPane scrollPane;
	private int count;

	public UserRestDetail() {
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
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

		RestDetail = new JLabel("음식점 상세페이지");
		RestDetail.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		RestDetail.setBackground(Color.WHITE);
		RestDetail.setHorizontalAlignment(SwingConstants.CENTER);

		restInfoPnl = new JPanel();
		restInfoPnl.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		// 탭메뉴챵이름.add("탭메뉴명",추가할패널);
		menuTab = new JPanel();
		tabbedPane.add("        메뉴        ", new JScrollPane(menuTab));
		menuTab.setLayout(null);
		infoTab = new JPanel();
		tabbedPane.add("        정보        ", new JScrollPane(infoTab));
		infoTab.setLayout(null);
//		infoTab.setSize(290, 500);
		reviewTab = new JPanel();
		tabbedPane.add("        리뷰        ", new JScrollPane(reviewTab));
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
		RestInfoLbl.setBackground(Color.WHITE);
		RestInfoLbl.setForeground(Color.BLACK);
		RestInfoLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		RestInfoLbl.setBounds(0, 35, 269, 65);
		RestInfoLbl.enable(false);
		RestInfoPnl.add(RestInfoLbl);

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

		JLabel BusNameLbl = new JLabel("값을 입력해주세요.");
		BusNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusNameLbl.setBounds(90, 35, 167, 25);
		BusinessInfoPnl.add(BusNameLbl);

		JLabel BusTimeLbl = new JLabel("값을 입력해주세요.");
		BusTimeLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusTimeLbl.setBounds(90, 61, 167, 25);
		BusinessInfoPnl.add(BusTimeLbl);

		JLabel BustelLbl = new JLabel("값을 입력해주세요.");
		BustelLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BustelLbl.setBounds(90, 86, 167, 25);
		BusinessInfoPnl.add(BustelLbl);

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

		JLabel SellerNameLbl = new JLabel("값을 입력해주세요.");
		SellerNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SellerNameLbl.setBounds(90, 35, 167, 25);
		SellerInfoPnl.add(SellerNameLbl);

		JLabel BusName1Lbl = new JLabel("값을 입력해주세요.");
		BusName1Lbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusName1Lbl.setBounds(90, 61, 167, 25);
		SellerInfoPnl.add(BusName1Lbl);

		JLabel BusAdressLbl = new JLabel("값을 입력해주세요.");
		BusAdressLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		BusAdressLbl.setBounds(90, 86, 167, 25);
		SellerInfoPnl.add(BusAdressLbl);

//		JPanel MenuAddPnl = new JPanel();
//		MenuAddPnl.setBackground(Color.WHITE);
//		MenuAddPnl.setBounds(12, 10, 269, 120);
//		menuTab.add(MenuAddPnl);
//		MenuAddPnl.setLayout(null);
//
//		JLabel MenuName = new JLabel("값을 입력하세요.");
//		MenuName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
//		MenuName.setBounds(77, 10, 160, 30);
//		MenuAddPnl.add(MenuName);
//
//		JLabel MenuPrice = new JLabel("값을 입력하세요.");
//		MenuPrice.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
//		MenuPrice.setBounds(77, 80, 180, 30);
//		MenuAddPnl.add(MenuPrice);
//
//		JLabel MenuConstruct = new JLabel("값을 입력하세요.");
//		MenuConstruct.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
//		MenuConstruct.setBounds(77, 50, 180, 20);
//		MenuAddPnl.add(MenuConstruct);
//
//		JLabel MenuNameLbl = new JLabel("메뉴이름");
//		MenuNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
//		MenuNameLbl.setBounds(12, 10, 53, 30);
//		MenuAddPnl.add(MenuNameLbl);
//
//		JLabel ConstructLbl = new JLabel("메뉴구성");
//		ConstructLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
//		ConstructLbl.setBounds(12, 50, 53, 20);
//		MenuAddPnl.add(ConstructLbl);
//
//		JLabel Price_1 = new JLabel("가격");
//		Price_1.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
//		Price_1.setBounds(12, 80, 53, 30);
//		MenuAddPnl.add(Price_1);

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

		JLabel MinAmountLbl = new JLabel("최소주문금액");
		MinAmountLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		MinAmountLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MinAmountLbl.setBounds(114, 10, 90, 30);
		restInfoPnl.add(MinAmountLbl);

		JLabel DelivaryTimeLbl = new JLabel("소요시간");
		DelivaryTimeLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		DelivaryTimeLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		DelivaryTimeLbl.setBounds(114, 50, 90, 30);
		restInfoPnl.add(DelivaryTimeLbl);

		JLabel DelivaryTipLbl = new JLabel("배달팁");
		DelivaryTipLbl.setHorizontalAlignment(SwingConstants.RIGHT);
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

		JLabel ReviewCount = new JLabel("999+");
		ReviewCount.setHorizontalAlignment(SwingConstants.CENTER);
		ReviewCount.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		ReviewCount.setBounds(87, 116, 70, 43);
		restPnl.add(ReviewCount);

		JLabel Pick = new JLabel("찜수");
		Pick.setHorizontalAlignment(SwingConstants.CENTER);
		Pick.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		Pick.setBounds(162, 116, 70, 43);
		restPnl.add(Pick);

		JLabel PickCount = new JLabel("999+");
		PickCount.setHorizontalAlignment(SwingConstants.CENTER);
		PickCount.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		PickCount.setBounds(237, 116, 70, 43);
		restPnl.add(PickCount);

		RestName = new JTextField();
		RestName.setEnabled(false);
		RestName.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		RestName.setHorizontalAlignment(SwingConstants.CENTER);
		RestName.setText("가게이름띠");
		RestName.setBounds(12, 10, 306, 43);
		restPnl.add(RestName);
		RestName.setColumns(10);

		JLabel StarImg = new JLabel("★");
		StarImg.setHorizontalAlignment(SwingConstants.CENTER);
		StarImg.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		StarImg.setBounds(87, 63, 70, 43);
		restPnl.add(StarImg);

		JLabel StarPoint = new JLabel("5.0");
		StarPoint.setFont(new Font("휴먼모음T", Font.PLAIN, 21));
		StarPoint.setBounds(164, 63, 154, 43);
		restPnl.add(StarPoint);
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addComponent(backBtn).addGap(12)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(RestDetail, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addGap(181).addComponent(homeBtn,
										GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))))
				.addComponent(restPnl, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup().addGap(22).addComponent(restInfoPnl,
						GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup().addGap(15).addComponent(tabbedPane,
						GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)));

		JLabel Won = new JLabel("원");
		Won.setHorizontalAlignment(SwingConstants.LEFT);
		Won.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Won.setBounds(209, 10, 62, 30);
		restInfoPnl.add(Won);

		JLabel Minute = new JLabel("분");
		Minute.setHorizontalAlignment(SwingConstants.LEFT);
		Minute.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Minute.setBounds(209, 50, 62, 30);
		restInfoPnl.add(Minute);

		JLabel Won2 = new JLabel("원");
		Won2.setHorizontalAlignment(SwingConstants.LEFT);
		Won2.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Won2.setBounds(209, 90, 62, 30);
		restInfoPnl.add(Won2);
//		gl_panel.setVerticalGroup(
//			gl_panel.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel.createSequentialGroup()
//					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
//						.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
//						.addGroup(gl_panel.createSequentialGroup()
//							.addGap(2)
//							.addComponent(mYReview, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
//						.addComponent(homeBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
//					.addComponent(restPnl, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
//					.addComponent(restInfoPnl, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
//					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
//		);

		panel.setLayout(gl_panel);

//		JPanel RevPnl = new JPanel();
//		RevPnl.setBounds(12, 70, 269, 150);
//		reviewTab.add(RevPnl);
//		RevPnl.setLayout(null);
//		RevPnl.setBackground(Color.WHITE);
//
//		JLabel RevUserName = new JLabel("유저이름");
//		RevUserName.setHorizontalAlignment(SwingConstants.CENTER);
//		RevUserName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
//		RevUserName.setBounds(0, 2, 78, 25);
//		RevPnl.add(RevUserName);
//
//		JLabel RevMenu = new JLabel("주문메뉴");
//		RevMenu.setHorizontalAlignment(SwingConstants.CENTER);
//		RevMenu.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
//		RevMenu.setBounds(0, 33, 78, 25);
//		RevPnl.add(RevMenu);
//
//		JLabel RevUserLbl = new JLabel("받아온 값");
//		RevUserLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
//		RevUserLbl.setBounds(90, 3, 104, 25);
//		RevPnl.add(RevUserLbl);
//
//		JLabel RevMenuLbl = new JLabel("받아온 값");
//		RevMenuLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
//		RevMenuLbl.setBounds(90, 33, 167, 25);
//		RevPnl.add(RevMenuLbl);
//
//		RevTxt = new JTextArea();
//		RevTxt.setEnabled(false);
//		RevTxt.setHorizontalAlignment(SwingConstants.CENTER);
//		RevTxt.setText("아따 맛이 지립니다요");
//		RevTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
//
//		RevTxt.setBounds(10, 68, 247, 72);
//		RevPnl.add(RevTxt);
//		RevTxt.setColumns(10);

		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addMenuPnl();
		addRevPnl();
		addRevPnl();
		addRevPnl();
		addRevPnl();
		addRevPnl();

		setSize(360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void addRevPnl() {

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

		RevTxt = new JTextArea();
		RevTxt.setText("쳐묵쳐묵하니 쳐 지기네");
		RevTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 11));
		RevTxt.setBounds(10, 68, 247, 72);
		RevPnl.add(RevTxt);
		RevTxt.setEnabled(false);
		RevTxt.setColumns(10);
	}

	public void addMenuPnl() {
		count++;
		JPanel MenuAddPnl = new JPanel();
		MenuAddPnl.setBackground(Color.WHITE);
		MenuAddPnl.setBounds(12, y, 269, 120);
		menuTab.add(MenuAddPnl);
		MenuAddPnl.setLayout(null);
		y += z;

		JLabel MenuName = new JLabel("값을 입력하세요.");
		MenuName.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MenuName.setBounds(77, 10, 160, 30);
		MenuAddPnl.add(MenuName);

		JLabel MenuPrice = new JLabel("값을 입력하세요.");
		MenuPrice.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MenuPrice.setBounds(77, 80, 180, 30);
		MenuAddPnl.add(MenuPrice);

		JLabel MenuConstruct = new JLabel("값을 입력하세요.");
		MenuConstruct.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		MenuConstruct.setBounds(77, 50, 180, 20);
		MenuAddPnl.add(MenuConstruct);

		JLabel MenuNameLbl = new JLabel("메뉴이름");
		MenuNameLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MenuNameLbl.setBounds(12, 10, 53, 30);
		MenuAddPnl.add(MenuNameLbl);

		JLabel ConstructLbl = new JLabel("메뉴구성");
		ConstructLbl.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		ConstructLbl.setBounds(12, 50, 53, 20);
		MenuAddPnl.add(ConstructLbl);

		JLabel Price_1 = new JLabel("가격");
		Price_1.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Price_1.setBounds(12, 80, 53, 30);
		MenuAddPnl.add(Price_1);

		JCheckBox MenuCheck = new JCheckBox("");
		MenuCheck.setBackground(Color.WHITE);
		MenuCheck.setBounds(245, 0, 24, 30);
		MenuAddPnl.add(MenuCheck);

		JButton OrderBtn = new JButton("주문하기");
		OrderBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		OrderBtn.setBounds(184, 10, 97, 23);
		menuTab.add(OrderBtn);

		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addGap(2).addComponent(RestDetail,
										GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addComponent(homeBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(restPnl, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(restInfoPnl, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, x + y, GroupLayout.PREFERRED_SIZE)));
		tabbedPane.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {

				if (tabbedPane.getSelectedIndex() == 1) {
					panel.setPreferredSize(new Dimension(290, 780));
				} else {
					panel.setPreferredSize(new Dimension(290, 200 + (count * 160)));
				}

			}
		});
//						.addGap(18)
//						.addComponent(menuTab, GroupLayout.PREFERRED_SIZE, x + y, GroupLayout.PREFERRED_SIZE)
//						.addGap(18)
//						.addComponent(infoTab, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
//						.addGap(18)
//						.addComponent(reviewTab, GroupLayout.PREFERRED_SIZE, xx + yy, GroupLayout.PREFERRED_SIZE)));
	}

	public static void main(String[] args) {

		new UserRestDetail().setVisible(true);
	}
}
