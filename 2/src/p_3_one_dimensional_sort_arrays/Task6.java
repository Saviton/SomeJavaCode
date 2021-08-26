package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1,
 * то продвигаютсяна один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
 * на один элемент назад.Составить алгоритм этой сортировки.
 */

public class Task6 {
    static void insertionSort(double[] arr, int start, int inc) {
        double tmp;
        for (int i = start; i < arr.length - 1; i += inc)
            for (int j = Math.min(i + inc, arr.length - 1); j - inc >= 0; j = j - inc)
                if (arr[j - inc] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j - inc];
                    arr[j - inc] = tmp;
                } else break;
    }

    public static void main(String[] args) {
        double[] a = {177.5, 124.2, 111.8, 97.1, 100.4, 86.7, 95.9};

        for (int inc = a.length / 2; inc >= 1; inc = inc / 2)
            for (int step = 0; step < inc; step++)
                insertionSort(a, step, inc);

        System.out.println("array a after ShellSort: " + Arrays.toString(a));
    }
}
