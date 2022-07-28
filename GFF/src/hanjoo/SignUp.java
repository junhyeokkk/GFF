package hanjoo;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SignUp {
   Connection conn;
   public static void main(String args[]) {

      InsertMember("ffff6666","ffff6666",1,"뿅뿅이","01066666666","가야동");

   }
   
   private static void InsertMember(String userId ,String userPw, int userAddrress, String userName, String userPhone, String userDetailAdrres) {

      Connection conn  = null;
      PreparedStatement stmt = null;
      try {   
         conn = DBUtil.getConnection();

         String s = "INSERT INTO member_t(login_id, password, busan_add_id , name, phone ,current_address) values";
         s += "('" +  userId + "','" + userPw + "','" + userAddrress + "','" + userName + "','" + userPhone + "','" + userDetailAdrres + "')";
         System.out.println(s);
         stmt = conn.prepareStatement(s);
         int i = stmt.executeUpdate(s);
         if(i == 1) {
            System.out.println("레코드 추가 성공");
         }
         else {
            System.out.println("레코드 추가 실패");
         }
      }  catch (Exception e) {
         // TODO Auto-generated catch block
         System.out.println(e.getMessage());
         System.exit(0);
      } finally {
         DBUtil.close(conn, stmt);
      }
   }
}