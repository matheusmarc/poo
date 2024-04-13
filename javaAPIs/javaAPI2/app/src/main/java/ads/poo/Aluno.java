package ads.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;

    public Aluno(String nome, String matricula, String curso, String telefone, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno |" +
                "Nome: " + nome +
                "; Matrícula: " + matricula +
                "; Curso: " + curso +
                "; Telefone: " + telefone +
                "; E-mail: " + email +
                "; Nascimento: " + dataNascimento + "\n";
    }



}
