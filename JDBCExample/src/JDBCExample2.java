import java.sql.*;

public class JDBCExample2 {

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
			//System.out.println("데이터 베이스에 접속하였습니다.");
			
			String sql = "SELECT * FROM persons WHERE city ='서울시';";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("PersonID\tLastName\tFisrtName\tAddress\t\tCity");
			System.out.println("--------------------------------------------------");
			while (rs.next()) {
				int personid = rs.getInt("personid");
				String lastname = rs.getString("lastname");
				String firstname = rs.getString("firstname");
				String address = rs.getString("address");
				String city = rs.getString("city");
				System.out.printf("%d \t\t %s \t\t %s \t\t %s \t %s \n",
						personid, lastname, firstname, address, city);				
			}
			rs.close();
			stmt.close();
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
