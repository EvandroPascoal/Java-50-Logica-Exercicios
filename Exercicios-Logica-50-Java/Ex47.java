// Crie um programa que remova os elementos duplicados de um array. 

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex47 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> conjunto = new LinkedHashSet<>(Arrays.asList(array));
        Integer[] semDuplicados = conjunto.toArray(new Integer[0]);

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array sem duplicados: " + Arrays.toString(semDuplicados));

    }
}
