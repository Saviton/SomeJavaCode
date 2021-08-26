package p_1_one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов
 */

public class Task3 {
    public static void main(String[] args)
    {
        int n = 6;
        double[] mas = new double[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random() * 200 - 100;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));

        int negative_numbers = 0, positive_numbers = 0, zero_numbers = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                positive_numbers++;
            else if (mas[i] < 0)
                negative_numbers++;
            else
                zero_numbers++;
        }

        System.out.println("negative numbers: " + negative_numbers);
        System.out.println("positive numbers: " + positive_numbers);
        System.out.println("zero numbers: " + zero_numbers);
    }
}
