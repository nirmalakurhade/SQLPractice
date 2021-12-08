package insertsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employeedetails {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
		System.out.println("connected");
		Statement stmt=con.createStatement();
		String sql="Insert INTO details Values(1,'sadashiv',50,40000,98767895)";
		stmt.executeUpdate(sql);
		String sql1="Insert INTO details Values(2,'vijay',30,50000,87654897)";
		stmt.executeUpdate(sql1);
		String sql2="Insert INTO details Values(3,'pritam',30,60000,97754897)";
		stmt.executeUpdate(sql2);
		String sql3="Insert INTO details Values(4,'lalita',30,70000,77654897)";
		stmt.executeUpdate(sql3);
	}

}
