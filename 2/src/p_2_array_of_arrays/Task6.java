package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *               1 1 1 .... 1 1 1
 *               0 1 1 .... 1 1 0
 *               0 0 1 .... 1 0 0
 *               ................
 *               0 0 1 .... 1 0 0
 *               0 1 1 .... 1 1 0
 *               1 1 1 .... 1 1 1
 */

public class Task6 {
    public static void main(String[] args)
    {
        int n = 6;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length / 2; ++i) {
            for (int j = i; j < n - i; j++) {
                mas[i][j] = 1;
                mas[mas.length - i - 1][j] = 1;
            }
        }

        System.out.println("the resulting matrix");
        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
