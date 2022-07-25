import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class Method {
    static private ArrayList<Member> memberList;
    static private ArrayList<Seller> sellerList;
    private static Method method;
    
	public static void addPnl(JPanel panel, GroupLayout gl_panel) {

		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = DBUtil.getConnection();
			int y = 120;
			int z = 80;

			sellerList = LoginCenter.getInstance().getSellerList();
			String s = "Select * From member_t where login_id = ";
			s += "'" + sellerList.get(0).getSel_id() + "'";
			stmt = conn.prepareStatement(s);
			ResultSet rs = stmt.executeQuery(s);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			DBUtil.close(conn, stmt);
		}

	}
     
    
    
      // 전화번호 합
      public static String PhoneNumSum(String num1, String num2, String num3) {
         
         return num1 + num2 + num3;
      }

      
    //로그인시 비교 메소드 
    public static void CheckMember(String a, String b) {
      Connection conn  = null;
      PreparedStatement stmt = null;
      
      try {   
         conn = DBUtil.getConnection();

         memberList = LoginCenter.getInstance().getMemberList();
         String s = "Select * From member_t where login_id = ";
         s +=  "'" +a + "'" ;
         System.out.println(s);
         stmt = conn.prepareStatement(s);
         ResultSet rs = stmt.executeQuery(s);
         
         while(rs.next()) {
            memberList.add(new Member(rs.getInt("m_id"),rs.getInt("busan_add_id"),
                  rs.getString("login_id"),rs.getString("password"),rs.getString("name"),
                  rs.getString("phone"),rs.getString("grade"),rs.getString("role"),
                  rs.getString("current_address"),rs.getString("created_date"),rs.getString("modifieded_date"),
                  rs.getString("status")));      
         }

         System.out.println(memberList.get(0).toString());
   
         /*
         int i = stmt.executeUpdate(s);
   
         if(i == 1) {
            System.out.println("레코드 추가 성공");
         }
         else {
            System.out.println("레코드 추가 실패");
         }
         */
         
         if(a.equals(memberList.get(0).getId())) {
            System.out.println("아이디 마즘");
            if(b.equals(memberList.get(0).getPassword())) {
               System.out.println("로그인 성공");
               new FirstPage().setVisible(true);
               Login.check = false;
            }
            else {
               System.out.println("아이디 맞는데 비번 틀림");
            }
         }
         else {
            System.out.println("실패");
            System.out.println(memberList.get(0).getId());
            System.out.println(memberList.get(0).getPassword());
         }         
      }  catch (Exception e) {
         // TODO Auto-generated catch block
         System.out.println(e.getMessage());
      } finally {
         DBUtil.close(conn, stmt);
      }
   }
}