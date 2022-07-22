import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SignUp {
	Connection conn;
	public static void main(String args[]) {

		InsertMember("ffff6666","ffff6666",1,"뿅뿅이","01066666666","가야동");

	}
	
	private static void InsertMember(String userId ,String userPw, int userAdrres, String userName, String userPhone, String userDetailAdrres) {

		Connection conn  = null;
		Statement stmt = null;
		try {	
			conn = ConnectDatabase.makeConnection();
			stmt = conn.createStatement();
			String s = "INSERT INTO member_t(login_id, password, busan_add_id , name, phone ,current_address) values";
			s += "('" +  userId + "','" + userPw + "','" + userAdrres + "','" + userName + "','" + userPhone + "','" + userDetailAdrres + "')";
			System.out.println(s);
			int i = stmt.executeUpdate(s);
			if(i == 1) {
				System.out.println("레코드 추가 성공");
			}
			else {
				System.out.println("레코드 추가 실패");
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}  finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	
}
