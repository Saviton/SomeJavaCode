package p_1_one_dimensional_arrays;

import java.util.Arrays;

/**
 * Дана последовательность целых чисел (a₁,a₂,...,aₙ).
 * Образовать новую последовательность, выбросив из данной min(a₁,a₂,...,aₙ)
 */

public class Task8 {
    public static void main(String[] args)
    {
        int n = 5;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (200)) - 100;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));

        int min = mas[0], counter = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] <= min) {
                if (mas[i] < min) {
                    min = mas[i];
                    counter = 1;
                } else
                    counter++;
            }
        }

        int new_mas[] = new int[mas.length - counter];
        for (int i = 0, j = 0; i < mas.length; i++) {
            if (mas[i] != min) {
                new_mas[j] = mas[i];
                j++;
            }
        }

        System.out.println("obtained array");
        System.out.println(Arrays.toString(new_mas));
    }
}
