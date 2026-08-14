package ClassNObjects;

public class Pessoa{
    public String nome;
    public int idade;
    public double peso;

    public Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void apresentacao(){
        System.out.println("Ola meu nome e: " + nome + "; minha idade e: " + idade + "; e meu peso e: " + peso + ";");
    }
}