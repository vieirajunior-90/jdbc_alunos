package application;

import db.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try(Connection connection = ConnectionFactory.getConnection()) {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alunos");

            while(rs.next()) {
                System.out.println(rs.getString("nome"));
            }
        }
        catch(SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}
