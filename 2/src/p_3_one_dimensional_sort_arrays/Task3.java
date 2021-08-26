package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сортировка выбором. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

public class Task3 {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[index]) {
                    index = j;
                }
            }
            int maxi = a[index];
            a[index] = a[i];
            a[i] = maxi;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 7, 11, 64, 123, 150, 177};

        System.out.println("array a: " + Arrays.toString(a));
        selectionSort(a);
        System.out.println("array a after SelectionSort: " + Arrays.toString(a));
    }
}
