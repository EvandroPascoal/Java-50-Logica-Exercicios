// Desenvolva um programa que calcule o seno de um ângulo em graus. 

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        double seno = Math.sin(Math.toRadians(anguloGraus));

        System.out.println("O seno do ângulo é: " + seno);
    }
}
