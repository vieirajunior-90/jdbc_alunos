package application;

import model.dao.AlunoDAO;
import model.dao.IAlunoDAO;

public class MainSelect {

    public static void main(String[] args) {

        IAlunoDAO dao = new AlunoDAO();
        dao.findById(3);
    }
}
