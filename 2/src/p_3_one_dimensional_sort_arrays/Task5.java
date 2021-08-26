package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2 ... an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2 ... ai - упорядоченная последовательность, т. е.
 * a1 < a2 < ... < an. Берется следующее число a(i + 1) и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {
    static int binarySearch(int arr[], int item, int low, int high) {
        if (high <= low)
            return (item > arr[low]) ? (low + 1) : low;
        int mid = (low + high) / 2;
        if (item == arr[mid])
            return mid + 1;
        if (item > arr[mid])
            return binarySearch(arr, item, mid + 1, high);
        return binarySearch(arr, item, low, mid - 1);
    }

    static void BinaryInsertionSort(int arr[], int n) {
        int i, loc, j, k, selected;
        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = arr[i];
            loc = binarySearch(arr, selected, 0, j);
            while (j >= loc) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = selected;
        }
    }

    public static void main(String[] args) {
        int[] a = {177, 124, 111, 97, 100, 86, 95};

        System.out.println("array a: " + Arrays.toString(a));
        BinaryInsertionSort(a, a.length);
        System.out.println("array a after Binary InsertionSort Sort: " + Arrays.toString(a));
    }
}
