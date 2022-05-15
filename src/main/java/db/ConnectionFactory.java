package db;

import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@NoArgsConstructor
public class ConnectionFactory {

    private static String URL = null;
    private static String USER = null;
    private static String PASS = null;

    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        loadProperties();
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
    private static void loadProperties(){
        try(FileInputStream fs = new FileInputStream("src/main/resources/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            URL = props.getProperty("URL");
            USER = props.getProperty("USER");
            PASS = props.getProperty("PASSWORD");
        }
        catch(IOException e) {
            System.out.println("Erro ao ler o arquivo de propriedades: " + e.getMessage());
        }
    }
}
