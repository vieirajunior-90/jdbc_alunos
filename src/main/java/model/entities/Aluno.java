package model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String telefone;

    @Override
    public String toString() {
        System.out.printf("%-5d %-20s %s\n", id, nome, telefone);
        return "";
    }
}
