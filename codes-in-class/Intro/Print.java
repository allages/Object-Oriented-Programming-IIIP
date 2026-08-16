package Intro;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Testando input!
        String nome;
        Scanner input = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Seu nome é: " + nome);
    }
}