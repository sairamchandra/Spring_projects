package Crud;


import java.util.*;  
import java.sql.*;  

public class Studend {  

	public static Connection getConnection(){  
		Connection con=null;  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demovirtusa","root","Sairamchandra65@");  
		}catch(Exception e){System.out.println(e.getMessage());}  
		return con;  
	}  
	public static int save(Student e){  
		int status=0;  
		try{  
			Connection con=Studend.getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"insert into stdss(Std_name,age,email,place) values (?,?,?,?)");  
			ps.setString(1,e.getStd_name());  
			ps.setString(2,e.getAge());  
			ps.setString(3,e.getEmail());  
			ps.setString(4,e.getPlace());  

			status=ps.executeUpdate();  

			con.close();  
		}catch(Exception ex){ex.printStackTrace();}  

		return status;  
	}  
	public static int update(Student e){  
		int status=0;  
		try{  
			Connection con=Studend.getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"update stdss set Std_name=?,age=?,email=?,place=? where id=?");  
			ps.setString(1,e.getStd_name());  
			ps.setString(2,e.getAge());  
			ps.setString(3,e.getEmail());  
			ps.setString(4,e.getPlace());  
			ps.setInt(5,e.getId());  

			status=ps.executeUpdate();  

			con.close();  
		}catch(Exception ex){ex.printStackTrace();}  

		return status;  
	}  
	public static int delete(int id){  
		int status=0;  
		try{  
			Connection con=Studend.getConnection();  
			PreparedStatement ps=con.prepareStatement("delete from stdss where id=?");  
			ps.setInt(1,id);  
			status=ps.executeUpdate();  

			con.close();  
		}catch(Exception e){e.printStackTrace();}  

		return status;  
	}  
	public static Student getStudentId(int id){  
		Student e=new Student();  

		try{  
			Connection con=Studend.getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from stdss where id=?");  
			ps.setInt(1,id);  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){  
				e.setId(rs.getInt(1));  
				e.setStd_name(rs.getString(2));  
				e.setAge(rs.getString(3));  
				e.setEmail(rs.getString(4));  
				e.setPlace(rs.getString(5));  
			}  
			con.close();  
		}catch(Exception ex){ex.printStackTrace();}  

		return e;  
	}  
	public static List<Student> getAllStudents(){  
		List<Student> list=new ArrayList<Student>();  

		try{  
			Connection con=Studend.getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from stdss");  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
				Student e=new Student();  
				e.setId(rs.getInt(1));  
				e.setStd_name(rs.getString(2));  
				e.setAge(rs.getString(3));  
				e.setEmail(rs.getString(4));  
				e.setPlace(rs.getString(5));  
				list.add(e);  
			}  
			con.close();  
		}catch(Exception e){e.printStackTrace();}  

		return list;  
	}  
}  