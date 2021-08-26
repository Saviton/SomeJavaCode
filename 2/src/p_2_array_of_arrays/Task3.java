package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {
    public static void main(String[] args) {
        int[][] mas = {
                {3, 2, 1},
                {6, 4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        int k = 1, p = 2;

        System.out.println("k -line : " + Arrays.toString(mas[k - 1]));
        System.out.println("p -column: ");

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i][p - 1]);
        }
    }
}
