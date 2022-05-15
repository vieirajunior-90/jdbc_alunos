package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://172.17.0.2:3306/jdbc_teste";
    private static final String USER = "root";
    private static final String PASS = "157090";

    private static Connection conn;

    public ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        if(conn == null || conn.isClosed()) {
            try {
                conn = DriverManager.getConnection(URL, USER, PASS);
            }
            catch(SQLException e) {
                System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            }
        }
        return conn;
    }
}
