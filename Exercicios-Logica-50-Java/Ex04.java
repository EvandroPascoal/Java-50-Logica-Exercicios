// Escreva um programa que inverta uma string. 

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phrase: ");
        String frase = scanner.nextLine();
        String invertida = new StringBuilder(frase).reverse().toString();

        System.out.println(invertida);
    }

}
