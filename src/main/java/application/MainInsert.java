package application;

import model.dao.AlunoDAO;
import model.dao.IAlunoDAO;
import model.entities.Aluno;

public class MainInsert {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Maria Luz", "(19)97324-3255");
        IAlunoDAO dao = new AlunoDAO();
        dao.insert(aluno);
    }
}
