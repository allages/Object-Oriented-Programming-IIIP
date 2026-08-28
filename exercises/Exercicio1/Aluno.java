package Exercicio1;

public class Aluno{
    String nome;
    private int idade;
    private int matricula;
    private boolean[] presenca = new boolean[10];

    public Aluno(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(string nome){
        this.nome = nome;
    }
}