package p_1_one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны действительные числа a₁,a₂,...,aₙ . Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {
    public static void main(String[] args)
    {
        int n = 5;
        double[] mas = new double[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random() * 200 - 100;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));

        int max = 0, min = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[max] < mas[i])
                max = i;
            if (mas[min] > mas[i])
                min = i;
        }

        double tmp = mas[max];

        mas[max] = mas[min];
        mas[min] = tmp;

        System.out.println("obtained array");
        System.out.println(Arrays.toString(mas));
    }
}
