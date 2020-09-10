import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCONNECT 
{
 
   private String className = "oracle.jdbc.driver.OracleDriver";
   private String baza="jdbc:oracle:thin:@localhost:1521/xe";
   private String loginBaza="hr";
   private String hasloBaza="hr";
   
   String getClassName(){
       return className;
   }
   
   String getBaza(){
       return baza;
   }
   
   String getLoginBaza(){
       return loginBaza;
   }
   
   String getHasloBaza(){
       return hasloBaza;
   }
   
}


