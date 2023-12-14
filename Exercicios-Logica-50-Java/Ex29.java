// Implemente um programa que calcule o volume de uma esfera. 

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = calcularVolume(raio);

        System.out.println("O volume da esfera é no valor de: " + volume);

        scanner.close();
    }

    static double calcularVolume(double raio) {
        double pi = Math.PI;
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }

}