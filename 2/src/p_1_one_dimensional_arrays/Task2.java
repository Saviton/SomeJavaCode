package p_1_one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана последовательность действительных чисел a₁,a₂,...,aₙ. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public class Task2 {
    public static void main(String[] args)
    {
        int n = 4;
        double[] mas = new double[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random() * 200 - 100;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));

        double z = 78;
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                count++;
            }
        }

        System.out.println("obtained array");
        System.out.println(Arrays.toString(mas));

        System.out.println("number of replacements: " + count);
    }
}
