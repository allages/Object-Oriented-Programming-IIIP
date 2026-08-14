package ClassNObjects;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("joao",17 ,50.35);
        System.out.println(p1);
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.peso);

        Pessoa p2 = p1;

        System.out.println(p2);
        p2.nome = "carlos";
        System.out.println(p1.nome);
    }

}