
// Escreva um programa para calcular a soma dos números de 1 a 100. 


public class Ex01 {
    public static void main(String[] args) {

        int soma = 0;

        for(int x = 1; x <= 100; x++){
            soma = soma + x;
        }

        System.out.println("A soma entre o números de 1 a 100 é: " + soma);

    }
}