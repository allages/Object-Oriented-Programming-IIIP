package Exercicio2;

public class Cliente {
    private String nome;
    private boolean vip;
    private Produto[] carrinho;

    public Cliente(String nome, boolean vip, Produto[] carrinho) {
        this.nome = nome;
        this.vip = vip;
        this.carrinho = new Produto[10];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Produto[] getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Produto[] carrinho) {
        this.carrinho = carrinho;
    }


    public String adicionarProduto(Produto p){
        for (int i = 0; i < this.carrinho.length; i++) {
            if (this.carrinho[i] == null) {
                this.carrinho[i] = p;
                return "Produto adicionado com sucesso!";
            }
        }
        return "O carrinho está cheio!";
    }

}
