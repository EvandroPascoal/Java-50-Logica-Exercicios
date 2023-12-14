// Crie um programa que encontre o maior elemento em um array. 

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int[] array = {10, 50, 19, 61, 85, 44};

        int maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }

        System.out.println("O maior elemento do array é: " + maior);
    }
}
