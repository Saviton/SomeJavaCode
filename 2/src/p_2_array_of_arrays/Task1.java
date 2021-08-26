package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task1 {
    public static void main(String[] args) {

        int[][] mas = {{3, 2, 1}, {6, 4, 5}, {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));


        for (int i = 0; i < mas[0].length; i++) {
            if (mas[i][0] > mas[i][mas.length - 1] && i % 2 == 0) {
                System.out.println(Arrays.toString(mas[i]));
            }
        }
    }
}
