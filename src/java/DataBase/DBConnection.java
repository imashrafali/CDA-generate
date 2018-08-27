package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection con = null;

    public static Connection getConnection() throws  SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cda_generation", "root", "root");

        return con;
    }
}
