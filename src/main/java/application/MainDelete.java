package application;

import model.dao.AlunoDAO;
import model.dao.IAlunoDAO;

public class MainDelete {

    public static void main(String[] args) {

        IAlunoDAO dao = new AlunoDAO();
        dao.deleteById(9);
    }
}
