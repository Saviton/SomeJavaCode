package p_1_one_dimensional_arrays;

import java.util.Arrays;

/**
 * Даны целые числа а₁,а₂ ,..., аₙ . Вывести на печать только те числа, для которых аᵢ > i.
 */

public class Task5 {
    public static void main(String[] args)
    {
        int n = 7;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (9 + 1)) + 1;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));
        System.out.println("Satisfying Items mas[i] > i");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i)
                System.out.println(mas[i]);
        }

    }
}
