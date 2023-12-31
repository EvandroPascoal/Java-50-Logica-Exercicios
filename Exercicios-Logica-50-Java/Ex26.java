// Desenvolva um programa que calcule o cosseno de um ângulo em graus. 

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ângulo em graus: ");
        double anguloG = scanner.nextDouble();

        double anguloR = Math.toRadians(anguloG);

        double cosseno = Math.cos(anguloR);

        System.out.println("O cosseno de " + anguloG + " graus é: " + cosseno);

        scanner.close();
    }

}