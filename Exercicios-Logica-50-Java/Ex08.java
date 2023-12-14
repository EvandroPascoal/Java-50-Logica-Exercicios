// Escreva um programa para verificar se uma string é um palíndromo. 

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para saber se ela é considerada um palídromo: ");
        String palavra = scanner.nextLine();
        boolean palindromo = verficarPalindro(palavra);
        System.out.println("A palavra ´" + palavra + "' " + (palindromo ? "é" : "não é") + " um palíndromo.");
        scanner.close();
    }

    static boolean verficarPalindro(String phrase){
        phrase = phrase.toLowerCase().replace("[^a-z]", "");
        StringBuilder palavraInvertida = new StringBuilder(phrase).reverse();
        return phrase.equals(palavraInvertida.toString());
    }

}
