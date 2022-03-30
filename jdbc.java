import java.sql.*;
  
class jdbc{ 
 
public static void main(String args[]){  

try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","root");  
  
PreparedStatement stmt=con.prepareStatement("insert into jdbc1 values()");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}
catch(Exception e)
{ 
System.out.println(e);
}  
  
}
}  
 