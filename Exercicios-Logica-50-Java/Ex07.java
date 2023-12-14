// Desenvolva um programa que calcule o fatorial de um número. 


import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o vetorial: ");
        int numeroFatorial = scanner.nextInt();

        int resultado = calculoVetorial(numeroFatorial);
        System.out.println("O fatorial de: " + numeroFatorial + " é: " + resultado);
        scanner.close();

    }

    static int calculoVetorial(int x){
        if(x == 0 || x == 1){
            return 1;
        } else {
            return x * calculoVetorial(x - 1);
        }
    }

}
