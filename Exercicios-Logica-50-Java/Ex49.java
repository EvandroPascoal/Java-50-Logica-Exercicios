// Implemente um programa que calcule a média móvel de um array. 

public class Ex49 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 10};
        int tamanhoIntervalo = 3;

        for (int i = 0; i <= array.length - tamanhoIntervalo; i++) {
            int soma = 0;
            for (int j = i; j < i + tamanhoIntervalo; j++) {
                soma += array[j];
            }
            double media = (double) soma / tamanhoIntervalo;
            System.out.println("Média do intervalo " + (i + 1) + " - " + (i + tamanhoIntervalo) + ": " + media);
        }
    }
}
