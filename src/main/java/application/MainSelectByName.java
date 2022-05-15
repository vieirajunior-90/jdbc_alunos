package application;

import model.dao.AlunoDAO;
import model.dao.IAlunoDAO;

public class MainSelectByName {

    public static void main(String[] args) {

        IAlunoDAO dao = new AlunoDAO();
        dao.findByName("Pisno").forEach(System.out::print);
    }
}
