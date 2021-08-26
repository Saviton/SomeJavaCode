package p_4_decomposition_using_methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task5 {
    public static int premax(int[] a) {
        int max = a[0], premax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > premax && a[i] != max)
                premax = a[i];
        }
        return premax;
    }

    public static void main(String[] args) {
        int[] a = {1, 7, 11, 64, 123, 150, 177, 177};

        System.out.println("Second largest number: " + premax(a));
    }
}
