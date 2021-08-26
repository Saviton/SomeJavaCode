package p_3_one_dimensional_sort_arrays;

import java.util.Scanner;

/**
 * Даны дроби p1/q1, p2/q2,.., pn/qn(pi,qi - натуральные). Составить программу, которая приводит
 * эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {
    public static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0, m = 0;

        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int mas1[] = new int[n];
        int mas2[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (9 + 1)) + 1;
            mas2[i] = (int) (Math.random() * (9 + 1)) + 1;
            System.out.print(mas1[i] + "/" + mas2[i] + "  ");
        }
        System.out.println();


        int mean = nok(mas2[0], mas2[1]);
        for (int i = 2; i < n; i++) {
            mean = nok(mean, mas2[i]);
        }

        for (int i = 0; i < n; i++) {
            mas1[i] = mean / mas2[i] * mas1[i];
            mas2[i] = mean;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (mas1[j] > mas1[j + 1]) {
                    int value = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = value;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(mas1[i] + "/" + mas2[i] + " ");
        }
    }
}
