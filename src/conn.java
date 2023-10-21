
import java.sql.*;

public class conn {
    
    public static void main(String args[]){
      
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shashank","root","");
        
        Statement smt = con.createStatement();
        ResultSet rs=smt.executeQuery("select * from lms");
        
        System.out.println("Connection Established Successfully");
        
        while(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        
        
        con.close();
        
        }catch(Exception e){
            System.out.println(e);
            
            
        }
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
