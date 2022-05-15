package application;

import model.dao.AlunoDAO;
import model.dao.IAlunoDAO;
import model.entities.Aluno;

public class MainUpdate {

    public static void main(String[] args) {

        IAlunoDAO dao = new AlunoDAO();

        Aluno aluno = dao.findById(2);
        aluno.setNome("Jessica Vieira");

        dao.update(aluno);
    }
}
