package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сортировка обменами. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai, a(i+1). Если ai > ai+1, то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task4 {
    static void bubbleSort(int arr[], int n, int count) {
        count = 0;
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
                    count++;
                }
            }

            if (!swapped)
                break;
        }
        System.out.println("number of permutations: " + count);
    }

    public static void main(String[] args) {
        int[] a = {177, 124, 111, 97, 100, 86, 95};

        System.out.println("array a: " + Arrays.toString(a));

        int number_of_permutations = 0;

        bubbleSort(a, a.length, number_of_permutations);

        System.out.println("array a after Exchange Sort: " + Arrays.toString(a));
    }
}
