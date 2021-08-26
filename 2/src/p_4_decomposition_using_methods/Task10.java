package p_4_decomposition_using_methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N
 */


public class Task10 {
    public static int[] fromArray(int N) {
        int tmp = N;
        int count = 0;

        for (int i = 10; N > 0; N /= i)
            count++;

        int[] a = new int[count];

        for (int i = 0; i < a.length; i++) {
            a[i] = tmp % 10;
            tmp /= 10;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N ");
        int N = in.nextInt();

        System.out.println("The resulting array" + Arrays.toString(fromArray(N)));
    }
}
