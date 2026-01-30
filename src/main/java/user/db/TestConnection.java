package user.db;

import java.sql.Connection;


public class TestConnection {
    public static void main(String[] args) {
        if (DatabaseConnection.getConnection() != null) {
            System.out.println("DB Connected!");
        } else {
            System.out.println("Connection Failed!");
        }
    }
}
