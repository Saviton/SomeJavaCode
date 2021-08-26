package p_1_one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task1 {
    public static void main(String[] args) {
        int n = 8;
        int[] mas = new int[n];
        int k = 3;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (99 + 1)) + 1;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));
        System.out.println();

        System.out.println("Array elements that are divided by k");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % k == 0)
                System.out.println(mas[i]);
        }
    }
}
