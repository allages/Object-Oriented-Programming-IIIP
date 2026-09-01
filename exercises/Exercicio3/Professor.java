package Exercicio3;

public class Professor {
    private String nome;
    private int matricula;
    private Aula[] ch;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Aula[] getCh() {
        return ch;
    }
    public void setCh(Aula[] ch) {
        this.ch = ch;
    }

    public int calcularCargaHoraria(){

    }

}
