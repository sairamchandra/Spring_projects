package com.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClientDao
{
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demovirtusa","root","Sairamchandra65@");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	public static int saveAccount(client c){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into clients(name,father,mother,dob,email,address,pincode,city,state,phone) values(?,?,?,?,?,?,?,?,?,?)");  
	        ps.setString(1,c.getName());  
	        ps.setString(2,c.getFathername());  
	        ps.setString(3,c.getMothername());  
	        ps.setInt(4,c.getDob());  
	        ps.setString(5,c.getEmail());  
	        ps.setString(6,c.getAddress()); 
	        ps.setInt(7,c.getPincode()); 
	        ps.setString(8,c.getCity());  
	        ps.setString(9,c.getState()); 
	        ps.setLong(10,c.getPhone()); 
	        
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  

}
