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

    public int getIdade(){
        return idade;
    }

    public int setIdade(int idade){
        this.idade = idade;
    }

    publlic int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public boolean[] getPresenca(){
        return presenca;
    }

    public void setPresenca(boolean[] presenca){
        this.presenca = presenca;
    }

}