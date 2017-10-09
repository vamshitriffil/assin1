package zxc;

import java.sql.*;

public class vamshi {
	
public static void main(String[]args){

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c= DriverManager.getConnection
				("jdbc:mysql://localhost:3306/vamshi","root","root");
		PreparedStatement p= c.prepareStatement("insert vam values(?)");
		p.setString(1, "mmmm");
		int i=p.executeUpdate();
		if(i>0){
			System.out.println("update");
		}
	}
catch(Exception e)
	{
	System.out.println("not connected");
	}
}
}