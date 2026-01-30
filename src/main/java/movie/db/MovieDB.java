package movie.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class MovieDB {

     private static final String URL = " jdbc:mysql://localhost:3306/moviebookingsystem?useSSL=false&serverTimezone=UTC\";";
    private static final String USER = "root"; // 
    private static final String PASSWORD = "meeru";

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;  
        }
    }
}
