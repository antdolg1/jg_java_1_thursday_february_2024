package students.igors_melkins.lesson_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","user","pass1234");
            System.out.println("Connection successful");
        } catch (SQLException e){
            System.out.println("Cannot connect to the DB");
            e.printStackTrace();
        }
    }


    public static Connection getConnection() {
        return getConnection();

    }
}
