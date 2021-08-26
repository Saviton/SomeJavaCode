package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a1 < a2 < ... < an и
 * b1 < b2 < ... < bm; Требуется указать те места, на которые нужно вставлять элементы последовательности
 * b1, b2...bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 8, 12};

        int[] b = {2, 3, 6, 9, 10};

        int[] c = new int[a.length + b.length];

        for (int i = 0, j = 0, k = 0; i < c.length; i++) {
            if (k >= b.length && j < a.length) {
                c[i] = a[j];
                j++;
            } else if (k < b.length && j >= a.length) {
                c[i] = b[k];
                System.out.println("for the " + (k + 1) + " element b - " + (i + 1) + " place in a");
                k++;
            } else if (k < b.length && b[k] < a[j]) {
                c[i] = b[k];
                System.out.println("for the " + (k + 1) + " element b - " + (i + 1) + " place in a");
                k++;
            } else if (j < a.length && b[k] >= a[j]) {
                c[i] = a[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
