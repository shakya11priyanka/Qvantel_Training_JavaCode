package Connection_Establishment;

import java.sql.*;


public class Connection_JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1:3306/Practise";
         Connection con=DriverManager.getConnection(url,"root","2018*8220");
         Statement st=con.createStatement();
         
         st.executeUpdate("update Test1 set Age=100 where Name='Priyanka'");
         
         
        	 System.out.println("Values Delete");
         
         
         
	}

}
