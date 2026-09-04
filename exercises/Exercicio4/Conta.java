package Exercicio4;

public class Conta {
    private String nome;
    private String numero;
    private double saldo;

    //construtor

    public  Conta(String nome, String numero, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    //gets e sets

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

}
