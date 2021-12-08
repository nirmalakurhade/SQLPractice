package insertsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println(1);
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(2);
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
	System.out.println("connected");
	Statement stmt = con.createStatement();
	String sql = "UPDATE details SET age = 50 WHERE id in (1,2)";
	stmt.executeUpdate(sql);
	sql = "SELECT id,name,age,sallary,mobile FROM details";
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()) {
		int id =rs.getInt("id");
		String name =rs.getString("name");
		int age = rs.getInt("age");
		int sallary = rs.getInt("sallary");
		int mobile = rs.getInt("mobile");
		System.out.println("id is :"+id+"||");
		System.out.println("name is :"+name+"||");
		System.out.println("age is :"+age+"||");
		System.out.println("sallary is :"+sallary+"||");
		System.out.println("mobile is :"+mobile+"||");
		System.out.println("------------------");
	}
}
}
