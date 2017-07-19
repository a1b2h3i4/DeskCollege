import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;
 public class DatabaseConnection
 {
     static java.sql.Connection c;
    public static Connection connect()
{ 
    try {
        Class.forName("com.mysql.jdbc.Driver");
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/?","root","");
    } catch (Exception ex) {
        System.out.println(ex);}
    return c;
    }
public static void disconnect()
{try{
    c.close();
}catch(SQLException e)
{}
} 
     public static void main(String[] args) {
         connect();
         disconnect();
     }
}