package Exercicio2;

public class Produto {
    private String nome;
    private boolean disponibilidade;
    private String descricao;
    private double preco;

    public Produto(String nome, boolean disponibilidade, String descricao, double preco){
        this.nome = nome;
        this.disponibilidade = disponibilidade;
        this.descricao = descricao;
        this.preco = preco;
    }

    // gets e sets


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }



    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }



    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }



    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}

