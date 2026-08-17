package Intro;
import java.util.Scanner;

public class Print {

    public static String gerarCpf(){
    
}
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Testando input!
        String nome;
        Scanner input = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Seu nome é: " + nome);

        // Testando laços de repetição
        int idade;
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        if (idade >= 18){
            System.out.println(nome + "é maior de idade!");
        } else if (idade >= 0){
            System.out.println(nome + "é menor de idade!\nFaltam:");
            int i;
            for (i = 1; idade < 17; i += 1){
                idade += 1;
                System.out.println(i);
            }
            System.out.println(i + " anos para você fazer a sua CNH!");
        } else {
            System.out.println("Idade inválida!");
        }

        input.close();
    }
}