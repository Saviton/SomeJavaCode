package p_1_one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task9 {
    public static void main(String[] args)
    {
        int[] mas = {9, 10, 8, 8, 8, 11, 7, 7, 7, 15, 19};

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));
        int[] popular = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    popular[i]++;
                }
            }
        }
        int result = mas[0];
        int popular_result = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popular_result) {
                popular_result = popular[i];
                result = mas[i];
            }
            if ((popular_result == popular[i]) && (mas[i] < result)) {
                result = mas[i];
            }
        }
        System.out.println("result: " + result);
    }
}
