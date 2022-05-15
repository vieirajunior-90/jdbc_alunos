package model.dao;

import db.ConnectionFactory;
import model.entities.Aluno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements IAlunoDAO {

    private String sql;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    @Override
    public void insert(Aluno aluno) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            sql = "INSERT INTO alunos (nome, telefone) VALUES (?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getTelefone());

            int rowsAffeted = pst.executeUpdate();

            if (rowsAffeted > 0) {
                System.out.println("Registro inserido com sucesso!");
            }
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
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
        List<Aluno> alunos = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            sql = "SELECT * FROM alunos";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));

                alunos.add(aluno);
            }
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return alunos;
    }

    @Override
    public List<Aluno> findByName(String nome) {
        List<Aluno> alunos = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            sql = "SELECT * FROM alunos WHERE nome LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + nome + "%");

            rs = pst.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));

                alunos.add(aluno);
            }

            if (alunos.isEmpty()) {
                System.out.println("Nenhum aluno encontrado!");
            }
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return alunos;
    }
}
