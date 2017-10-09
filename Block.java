package zxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Block {
	public static void main(String[]args){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/java","root","root");
			PreparedStatement ps= c.prepareStatement("insert into  var values(?,?,?)");
			System.out.println("connected");
			@SuppressWarnings("resource")
			Scanner s= new Scanner(System.in);
			while(true){
					String username=s.next();
					ps.setString(1,username);
					String email=s.next();
					ps.setString(2,email);
					String pass=s.next();
					ps.setString(3,pass);
					ps.executeUpdate();
					System.out.println("yes or no");
					String s1=s.next();
					if(s1.equalsIgnoreCase("no")){
						break;
					}
			}
			}catch(Exception e){
				System.out.println(e);
			}
	}
}