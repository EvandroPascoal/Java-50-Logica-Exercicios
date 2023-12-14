// Desenvolva um programa que converta uma temperatura de Celsius para Fahrenheit. 

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperatura em Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheint = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheint é: " + fahrenheint);

        scanner.close();
    }

}
