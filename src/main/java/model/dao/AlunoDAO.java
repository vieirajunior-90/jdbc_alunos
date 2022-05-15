package model.dao;

import db.ConnectionFactory;
import model.entities.Aluno;

import java.sql.*;
import java.util.List;

public class AlunoDAO implements IAlunoDAO {

    private String sql;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    @Override
    public void insert(Aluno aluno) {

    }

    @Override
    public void update(Aluno aluno) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void findById(Integer id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            sql = "SELECT * FROM alunos WHERE id = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            rs = pst.executeQuery();

            if (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));

                System.out.println(aluno);
            }
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public List<Aluno> findAll() {
        return null;
    }

    @Override
    public List<Aluno> findByName(String nome) {
        return null;
    }
}
