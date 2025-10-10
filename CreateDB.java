package jvprj;

import java.sql.*;

public class CreateDB {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	static final String USER = "jvdb";
	static final String PWD = "jv911";
	
	public static void main (String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Conection to database...");
			con = DriverManager.getConnection(DB_URL, USER, PWD);
			
			System.out.println("Creating Database....");
			st=con.createStatement();
			
			String sql = "create database student25";
			boolean result = st.execute(sql);
		    System.out.println(result);
		    System.out.println("Database created..");
		}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				if(st!=null) {
					st.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
	}
}
