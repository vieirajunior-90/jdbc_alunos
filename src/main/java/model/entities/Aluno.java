package model.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
public class Aluno implements Serializable {

    private final static long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String telefone;

    public Aluno() {
    }

    public Aluno(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        System.out.printf("%-5d %-20s %s\n", id, nome, telefone);
        return "";
    }
}
