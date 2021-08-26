package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class Task9 {
    public static void main(String[] args)
    {
        int[][] mas = {
                {3, 2, 1},
                {6, 4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        int[] sum = new int[mas[0].length];

        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                sum[i] += mas[j][i];
            }
        }

        int max = sum[0], maxi = 0;

        for (int i = 0; i < sum.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
                maxi = i;
            }
        }

        System.out.println("Sums: " + Arrays.toString(sum));
        System.out.println("the largest amount in " + (maxi + 1) + " column");
    }
}
