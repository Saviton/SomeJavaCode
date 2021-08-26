package p_1_one_dimensional_arrays;

import java.util.Arrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task6 {

    static boolean prime_number(int a) {
        a++;
        if (a < 2)
            return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;

        double[] mas = new double[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random() * 10 - 5;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));
        System.out.println("Satisfying Items");

        for (int i = 0; i < mas.length; i++) {
            if (prime_number(i))
                System.out.println(mas[i]);
        }
    }
}
