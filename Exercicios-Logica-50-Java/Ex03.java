
// Implemente um programa que verifique se um número é primo. 

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner exercicio03 = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = exercicio03.nextInt();

        int contadorD = 0;

        for(int a = 1; a <= n; a++) {
            if(n % a == 0) {
                contadorD++;
            }
        }

        if(contadorD == 2){
            System.out.println("É número primo :)");
        }else{
            System.out.println("Não é número primo :)");
        }
    }
}
