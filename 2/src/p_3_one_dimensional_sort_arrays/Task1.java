package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

public class Task1 {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] b = {2, 2, 2, 2, 2, 2};
        int k = 3;

        a = Arrays.copyOf(a, a.length + b.length);

        for (int i = a.length - b.length - 1; i >= k - 1; i--) {
            a[b.length + i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            a[k + i] = b[i];
        }

        System.out.println("the resulting array: " + Arrays.toString(a));
    }
}
