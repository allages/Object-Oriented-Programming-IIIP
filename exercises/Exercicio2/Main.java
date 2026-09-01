package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Macarrao", true, "otimo", 3.00);
        Produto p2 = new Produto("Danone", true, "grego", 2.50);

        Cliente c1 = new Cliente ("Jeanne", true);

        c1.adicionarProduto(p1);
        c1.adicionarProduto(p2);

        System.out.println(c1.comprar());
    }
}
