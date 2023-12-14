// Crie um programa que conte o número de caracteres em uma string. 

import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um frase: ");
        String frase = scanner.nextLine();

        int caracteres = contarCaracter(frase);

        System.out.println("Número de caracteres na frase é de: " + caracteres);

        scanner.close();
    }

    static int contarCaracter(String frase) {
        return frase.length();
    }

}