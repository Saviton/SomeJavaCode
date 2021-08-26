package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Отсотрировать столбцы матрицы по возрастанию и убыванию значений элементов
 */

public class Task13 {
    public static void main(String[] args)
    {
        int[][] mas = {
                {2, 7, 1},
                {6, 4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        System.out.println("column ascending: ");

        for (int k = 0; k < mas[0].length; k++) {
            for (int i = mas.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (mas[j][k] > mas[j + 1][k]) {
                        int tmp = mas[j][k];
                        mas[j][k] = mas[j + 1][k];
                        mas[j + 1][k] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }

        System.out.println("column descending");
        for (int k = 0; k < mas[0].length; k++) {
            for (int i = mas.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (mas[j][k] < mas[j + 1][k]) {
                        int tmp = mas[j][k];
                        mas[j][k] = mas[j + 1][k];
                        mas[j + 1][k] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
