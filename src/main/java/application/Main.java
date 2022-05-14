package application;

import db.ConnectionFactory;
import model.entities.Aluno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(1, "Maria Joaquina", "(11) 99999-9999");
        System.out.println(aluno);
    }
}
