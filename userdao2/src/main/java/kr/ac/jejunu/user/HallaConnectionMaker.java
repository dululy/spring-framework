package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HallaConnectionMaker implements ConnectionMaker {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connectionreturn
        return DriverManager.getConnection("jdbc:mysql://localhost/jeju?serverTimezone=Asia/Seoul", "jeju", "jejupw");
    }
}
