package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {
    public static void main(String[] args)
    {
        int[][] mas = {
                {2, 7, 1},
                {6, 4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        int max = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                if (max < mas[i][j])
                    max = mas[i][j];
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                if (mas[i][j] % 2 != 0)
                    mas[i][j] = max;
            }
        }

        System.out.println("the resulting matrix: ");

        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
