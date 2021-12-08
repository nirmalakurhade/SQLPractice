package insertsql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLdata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
		System.out.println("connected");
		Statement stmt=con.createStatement();
		String sql="select * from student";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt("Id");
			String name=rs.getString("name");
			int age=rs.getInt("age");
		}
	}

}
