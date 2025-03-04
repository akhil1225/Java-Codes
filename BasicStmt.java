import java.sql.*;
public class BasicStmt{
    public static void main(String... args){
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akki","root","mysql");
        Statement stmt= con.createStatement();
        String query = "SELECT * FROM emp";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            System.out.println("ID: "+rs.getInt(1)+
                               "Name: "+rs.getString(2)+
                               "Salary: "+rs.getDouble(3));
        }
        rs.close();;
        stmt.close();
        
        con.close();
    } catch(Exception e){
        e.printStackTrace();
    }
}
}