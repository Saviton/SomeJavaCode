package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    public static void main(String[] args)
    {
        int[][] mas = {
                {3, 2, 1},
                {6, -4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        System.out.println("Positive elements on the diagonal");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                if (i == j && mas[i][j] > 0)
                    System.out.println(mas[i][j]);
            }
        }
    }
}
