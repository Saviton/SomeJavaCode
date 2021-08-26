package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *            1  2   3   .... n
 *            n  n-1 n-2 .... n
 *            1  2   3   .... n
 *            n  n-1 n-2 .... n
 *            .................
 *            n  n-1 n-2 .... n
 */

public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0, z = n; j < mas[0].length; j++, z--) {
                if (i % 2 == 0)
                    mas[i][j] = j + 1;
                else
                    mas[i][j] = z;
            }
        }

        System.out.println("the resulting matrix");
        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
