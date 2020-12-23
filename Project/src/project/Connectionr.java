
package project;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author jheanne
 */
class Connectionr {
    public static Connection con;
    public static String dbFile = "C://Users//jheanne//Documents//Attendance.accdb";
    public static String dbUrl = "jdbc:ucanaccess://"+dbFile.trim()+";memory=true";
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection(dbUrl,"","");
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        
    
    return con;
    }
}
