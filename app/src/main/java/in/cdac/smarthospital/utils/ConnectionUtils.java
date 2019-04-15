package in.cdac.smarthospital.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Admin on 10/6/2018.
 */

public class ConnectionUtils {

    static String url="jdbc:mysql://localhost:3306/database_name";
    static String user="";
    static String pass="";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        return DriverManager.getConnection(url,user,pass);
    }
}
