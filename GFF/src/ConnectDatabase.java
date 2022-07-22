import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	Connection conn;
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/gff";
		String id = "root";
		String password = "root";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적제 성공");	
			conn =  DriverManager.getConnection(url,id,password);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결에 실패하였습니다");
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다");
		} 
		return conn;
	}
	

	public static void main(String args[]) {
		Connection con  = makeConnection();
	}
}
