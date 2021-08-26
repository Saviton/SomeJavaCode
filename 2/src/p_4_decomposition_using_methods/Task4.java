package p_4_decomposition_using_methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Task4 {
    public static double coordinates(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n = in.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = (double) (Math.random() * (9 + 1)) + 1;
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = (double) (Math.random() * (9 + 1)) + 1;
        }

        System.out.println("array x: " + Arrays.toString(x));
        System.out.println("array y: " + Arrays.toString(y));

        double maxL = 0;
        double length;
        int[] points = new int[2];

        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < y.length; j++) {
                length = coordinates(x[i], y[i], x[j], y[j]);
                if (length > maxL) {
                    maxL = length;
                    points[0] = i;
                    points[1] = j;
                }
            }
        }

        System.out.println("\nThe greatest distance between points " + points[0] + " and " + points[1]);
    }
}
