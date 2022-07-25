import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {

	// 접속하는 메소드
	public static Connection getConnection() throws Exception{
		String url = "jdbc:mysql://localhost:3306/gff";
		String id = "root";
		String password = "root";
		return getConnection(url, id, password);
	}

	
	public static Connection getConnection(String url,String user,String password) throws Exception{

		Connection conn = null;
		// 3. 드라이버로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 4.디비접속	
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	// close 하는 메소드
	public static void close(Connection conn, PreparedStatement ps){
		if (ps != null) {
			try {
				ps.close();
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

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(conn, ps);
	}
}

 