package insertsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;




public class B {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println(1);
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(2);
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
	System.out.println("connected");
	Scanner sc = new Scanner(System.in);
	String sql="insert into student values(?,?,?)";
	PreparedStatement pstmt = con.prepareStatement(sql);
	System.out.println("Enter Id");
	pstmt.setInt(1,sc.nextInt());
	System.out.println("Enter name");
	pstmt.setString(2,sc.next());
	System.out.println("Enter age");
	pstmt.setInt(3,sc.nextInt());
	pstmt.executeUpdate();
	System.out.println("Inserted");
}
}
