package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class Task12 {
    public static void main(String[] args)
    {
        Integer[][] mas = {
                {2, 7, 1},
                {6, 4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        System.out.println("line ascending: ");
        for (int i = 0; i < mas.length; i++) {
            Arrays.sort(mas[i]);
        }

        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }

        System.out.println("line descending");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                Arrays.sort(mas[i], Comparator.reverseOrder());
            }
        }

        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
