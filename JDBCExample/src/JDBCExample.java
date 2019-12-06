import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "testdb";
		String par = "?serverTimezone=UTC";
		String userid = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					url+db+par,userid,password);
			System.out.println("데이터 베이스에 접속하였습니다.");
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 클래스를 찾을 수 없습니다."+e.getMessage());			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
