package com.SMS.login;

public class Details {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@:xe","system","oracle");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from Student details where name=? and pass=?");  
		ps.setString(1,Studentname);  
		ps.setString(2,password);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
		}  

}
