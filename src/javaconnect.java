
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
Connection conn =DriverManager.getConnection("jdbc:sqlite:D:\\final2\\final.sqlite");
            
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
