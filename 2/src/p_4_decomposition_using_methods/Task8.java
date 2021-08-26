package p_4_decomposition_using_methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Task8 {
    public static int triple_sum(int[] a, int k, int m) {
        k--;
        m--;

        int sum = 0;

        for (int i = k; i <= m; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 8, 12};

        System.out.println("Source array: " + Arrays.toString(a));
        System.out.println("D[1] + D[2] + D[3] = " + triple_sum(a, 1, 3));
        System.out.println("D[3] + D[4] + D[5] = " + triple_sum(a, 3, 5));
        System.out.println("D[4] + D[5] + D[6] = " + triple_sum(a, 4, 6));
    }
}
