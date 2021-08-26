package p_2_array_of_arrays;

import java.util.Arrays;

import static java.lang.Math.random;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args)
    {
        int[][] mas = new int[10][20];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (random() * (14 + 1));
            }
        }

        System.out.println("Source array: ");
        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }

        int counter = 0;

        System.out.println("strings in which 5 occurs five or more times");
        for (int i = 0; i < mas.length; i++) {
            counter = 0;
            for (int j = 0; j < mas[0].length; j++) {
                if (mas[i][j] == 5)
                    counter++;
            }
            if (counter >= 3)
                System.out.println(i + 1);
        }
    }
}
