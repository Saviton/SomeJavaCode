package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *             1 1 1 1 .... 1
 *             2 2 2 2 .... 0
 *             3 3 3 0 .... 0
 *             ..............
 *             n 0 0 0 .... 0
 */

public class Task5 {
    public static void main(String[] args) {
        int n = 7;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length - i; j++) {
                mas[i][j] = i + 1;
            }
        }

        System.out.println("the resulting matrix");
        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
