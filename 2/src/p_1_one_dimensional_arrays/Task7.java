package p_1_one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны действительные числа (a₁,a₂,...,aₙ).
 * Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...  aₙ | aₙ₊₁)
 * Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...  aₙ | aₙ₊₁)
 */

public class Task7 {
    public static void main(String[] args)
    {
        int n = 6;

        double[] mas = new double[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random() * 200 - 100;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));

        double max = mas[0] + mas[mas.length - 1];
        double maxFinal = 0;

        for (int i = 1; i < mas.length / 2; i++) {
            double sum = mas[i] + mas[mas.length - 1 - i];
            maxFinal = Math.max(max, sum);
        }

        System.out.println(maxFinal);
    }
}
