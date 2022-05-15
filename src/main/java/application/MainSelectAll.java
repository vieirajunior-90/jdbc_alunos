package application;

import model.dao.AlunoDAO;
import model.dao.IAlunoDAO;

public class MainSelectAll {

    public static void main(String[] args) {

        IAlunoDAO dao = new AlunoDAO();
        dao.findAll().forEach(System.out::print);
    }
}
