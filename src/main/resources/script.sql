CREATE database if not exists $jdbc_teste;
CREATE TABLE $jdbc_teste.alunos
    (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    telefone VARCHAR(255));
INSERT INTO $jdbc_teste.alunos (nome, telefone)
VALUES ('Hernan Fernandes', '(11)98787-9999'),
       ('Helena Carvalho','(21)94323-2787'),
       ('Fernanda Fernandes', '(31)97443-1122'),
       ('Marcelo Rodrigues','(31)99987-2525'),
       ('Julio Paredes', '(11)97432-2290'),
       ('Renata Rodrigues','(31)91212-2190'),
       ('Paulo Marques', '(19)98763-3290'),
       ('Mireldo Gomes', '(22)90898-0099');