package model.dao;

import model.entities.Aluno;

import java.util.List;

public interface IAlunoDAO {

    void insert(Aluno aluno);
    void update(Aluno aluno);
    void deleteById(Integer id);
    void findById(Integer id);

    List<Aluno> findAll();
    List<Aluno> findByName(String nome);
}
