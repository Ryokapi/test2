/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

    public static Connection getConnect() {
        Connection c = null;
        // tạo thông tin kết nối
        try {
            String DbUrl = "jdbc:sqlserver://LAPTOP-G7EVAT9K:1433;databaseName=JDBC;encrypt=true;trustServerCertificate=true;";
            String userName = "sa";
            String passWord = "123";
            c = DriverManager.getConnection(DbUrl, userName, passWord);
            System.out.println("kết nối thành công ");
        } catch (Exception e) {
            System.out.println("kết nối thất bại");
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
