import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {

    public String DB_url = "jdbc:mysql://localhost:3306/world" ;
    public String DB_driver = "com.mysql.cj.jdbc.Driver";
    public String DB_username = "root" ;
    public String DB_password = "admin";

    public void openConnection(){
        Connection conn = null;
        try {
            Class.forName(DB_driver);
             conn = DriverManager.getConnection(DB_url, DB_username, DB_password);

             if (conn!=null) {
                System.out.println("Connessione riuscita");
             }
             else{
                System.out.println("Connessione NON riuscita");
             }
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    

}
