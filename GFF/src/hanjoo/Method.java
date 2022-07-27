import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Method {
	static private ArrayList<Member> memberList;
	static private ArrayList<Seller> sellerList;
	static private ArrayList<FoodShop> foodList;
	private static Method method;
	private static int number = 0;
	public static int category;
	private static ArrayList<JButton> btnbl;

	// 가게 운영시간 db형식으로 삽입
	public static String OpenTime(String time1, String time2, String time3, String time4) {

		return time1 + ":" + time2 + "~" + time3 + ":" + time4;
	}

	// 카테고리 개수 불러오는 메소드 (버튼 몇개 생성할지)
	public static int Category_Button() {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtil.getConnection();
			String s = "Select count(*) from Category_t";
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);
			while (rs.next()) {
				number = rs.getInt("count(*)");
			}
			System.out.println(number);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}
		return number;
	}

	// 카테고리 이름 불러오는 메소드 (버튼 몇개 생성할지)
	public static ArrayList<String> Category_Btn_name() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ArrayList<String> c_name = new ArrayList<String>();

		try {
			conn = DBUtil.getConnection();
			String s = "Select cat_name from Category_t";
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);
			while (rs.next()) {
				c_name.add(rs.getString("cat_name"));
			}
			System.out.println(number);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}
		return c_name;
	}

	// 카테고리ID 불러오는 메소드
	public static ArrayList<Integer> Category_Btn_ID() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ArrayList<Integer> c_id = new ArrayList<Integer>();

		try {
			conn = DBUtil.getConnection();
			String s = "Select cat_id from Category_t";
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);
			while (rs.next()) {
				c_id.add(rs.getInt("cat_id"));
			}
			System.out.println(number);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}
		return c_id;
	}

	// 카테고리별 pnl 받아오기 음식점
	public static void Category_food(JPanel panel, GroupLayout gl_panel) {

		Connection conn = null;
		PreparedStatement stmt = null;
		try {

			conn = DBUtil.getConnection();
			int y = 40;
			int z = 80;
			int total = 0;
			foodList = LoginCenter.getInstance().getFoodList();
			sellerList = LoginCenter.getInstance().getSellerList();

			// System.out.println(FoodCategory.count);
			System.out.println(category);
			// 나중에 1을 판매자 ID로 교체
			String s = "Select a.s_name, a.min_del_price, a.del_price, a.shop_pic, a.rating"
					+ "  From foodshop_t AS a left join ca_food_t AS b on a.s_id = b.s_id "
					+ "left join Category_t AS c on b.cat_id = c.cat_id where b.cat_id = ";
			s += "'" + category + "'";
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);
			ArrayList<FoodShop> fs = new ArrayList<>();
			while (rs.next()) {
				fs.add(new FoodShop(rs.getString("s_name"), rs.getInt("min_del_price"), rs.getInt("del_price"),
						rs.getString("shop_pic"), rs.getDouble("rating")));

				if (foodList == null) {
					for (int q = 0; q < fs.size(); q++) {
						foodList.add(fs.get(q));
					}
				} else {
					foodList = new ArrayList<FoodShop>();
					for (int q = 0; q < fs.size(); q++) {
						foodList.add(fs.get(q));
					}
				}
			}
			System.out.println(category);
			System.out.println(foodList);

			for (int j = 0; j < foodList.size(); j++) {
				y += z;
				JPanel restPnl = new JPanel();
				restPnl.setBounds(0, y, 318, 76);
				restPnl.setLayout(null);

				JLabel restImg = new JLabel("가게 이미지");
				restImg.setBounds(12, 10, 57, 56);
				restPnl.add(restImg);
				restImg.setIcon(new ImageIcon(String.valueOf(foodList.get(j).getShop_pic())));

				JLabel restName = new JLabel("존나맛있다람이");
				restName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
				restName.setBounds(81, 10, 170, 32);
				restPnl.add(restName);
				restName.setText(String.valueOf(foodList.get(j).getS_name()));

				JLabel star = new JLabel("");
				star.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
				star.setBounds(263, 16, 39, 23);
				star.setText("★ 5.0");
//            restPnl.add(별);
				star.setText(String.valueOf(foodList.get(j).getRating()));

				JLabel star_1 = new JLabel("★");
				star_1.setHorizontalAlignment(SwingConstants.CENTER);
				star_1.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
				star_1.setBounds(242, 16, 20, 23);
				restPnl.add(star_1);

				JLabel minOrder = new JLabel("최소주문");
				minOrder.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
				minOrder.setBounds(81, 43, 50, 23);
				restPnl.add(minOrder);

				JLabel riderTip = new JLabel("배달팁");
				riderTip.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
				riderTip.setBounds(203, 43, 50, 23);
				restPnl.add(riderTip);

				JLabel minOrderPrice = new JLabel("가격");
				minOrderPrice.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
				minOrderPrice.setBounds(141, 43, 50, 23);
				restPnl.add(minOrderPrice);
				minOrderPrice.setText(String.valueOf(foodList.get(j).getMin_del_price()));

				JLabel riderTipPrice = new JLabel("가격");
				riderTipPrice.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
				riderTipPrice.setBounds(263, 43, 50, 23);
				restPnl.add(riderTipPrice);
				riderTipPrice.setText(String.valueOf(foodList.get(j).getDel_price()));

				gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(0, total + y, Short.MAX_VALUE)));

				panel.add(restPnl);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}

	}

	// 내가게 상점만 등록되도록
	public static ArrayList<FoodShop> SeladdPnl(JPanel panel, GroupLayout groupLayout) {

		Connection conn = null;
		PreparedStatement stmt = null;

		ArrayList<FoodShop> fs = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();

			sellerList = LoginCenter.getInstance().getSellerList();
			// 나중에 1을 판매자 ID로 교체
			String s = "Select s_id, s_name,shop_pic From foodshop_t where sel_id = ";
			s += "'" + LoginCenter.getInstance().getSelInfo().getSel_id() + "'";
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);

			while (rs.next()) {
				fs.add(new FoodShop(rs.getInt("s_id"), rs.getString("s_name"), rs.getString("shop_pic")));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}

		return fs;
	}

	// 전화번호 합
	public static String PhoneNumSum(String num1, String num2, String num3) {

		return num1 + num2 + num3;
	}

	// 회원 로그인시 비교 메소드
	public static void CheckMember(JPanel pnl, String a, String b) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtil.getConnection();

			String s = "Select * From member_t where login_id = ";
			s += "'" + a + "'";
			System.out.println(s);
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);

			while (rs.next()) {
				LoginCenter.getInstance()
						.setMyInfo(new Member(rs.getInt("m_id"), rs.getInt("busan_add_id"), rs.getString("login_id"),
								rs.getString("password"), rs.getString("name"), rs.getString("phone"),
								rs.getString("grade"), rs.getString("role"), rs.getString("current_address"),
								rs.getString("created_date"), rs.getString("modifieded_date"), rs.getString("status")));
			}

			if (a.equals(LoginCenter.getInstance().getMyInfo().getId())) {
				System.out.println("아이디 마즘");
				if (b.equals(LoginCenter.getInstance().getMyInfo().getPassword())) {
					System.out.println("로그인 성공");
					new FirstPage().setVisible(true);
					Login.check = false;
				} else {
					System.out.println("아이디 맞는데 비번 틀림");
				}
			} else {
				System.out.println("실패");
				System.out.println(memberList.get(0).getId());
				System.out.println(memberList.get(0).getPassword());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}
	}

	
   
    /**
     * 식당의 상세정보를 조회하는 쿼리문 작성 필요.
     * where 조건에는 반드시 s_id 를 통해 조회가 되어야 하며,
     * 반환은 FoodShop 단건으로 리턴이 되어야 한다.
     * 
     * @param s_id (식당 고유넘버)
     * @return FoodShop
     */
    public static FoodShop getDetailRestInfo(int s_id) {
    	String sql = "SELECT * FOODSHOP_T WHERE S_ID=";
    	sql += s_id;
    	
    	return null;
    }

	// 판매자 로그인시 비교 메소드
	public static void CheckSeller(JPanel pnl, String a, String b) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtil.getConnection();
			String s = "Select * From seller_t where sel_log_id = ";
			s += "'" + a + "'";
			System.out.println(s);
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);

			while (rs.next()) {

				LoginCenter.getInstance()
						.setSelInfo(new Seller(rs.getInt("sel_id"), rs.getString("s_id"), rs.getString("sel_log_id"),
								rs.getString("sel_pw"), rs.getString("sel_name"), rs.getString("sel_tel"),
								rs.getString("created_date"), rs.getString("modifieded_date"), rs.getString("status")));
			}

			if (a.equals(LoginCenter.getInstance().getSelInfo().getSel_log_id())) {
				System.out.println("아이디 마즘");
				if (b.equals(LoginCenter.getInstance().getSelInfo().getPassword())) {
					System.out.println("로그인 성공");

					new SellerFirst().setVisible(true);
					Login.check = false;
				} else {
					System.out.println("아이디 맞는데 비번 틀림");
				}
			} else {
				System.out.println("실패");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}

	}
}