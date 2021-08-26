package p_2_array_of_arrays;

import java.util.Scanner;

/**
 * Магическим квадратом порядка n называется квадратная матрица n*n составленная из чисел 1,2,3,...,n², так,
 * что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
 * Пример магического квадрата порядка 3:
 *                   6 1 8
 *                   7 5 3
 *                   2 9 4
 */

public class Task16 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");

        int n = in.nextInt();
        int m[][] = new int[n][n];
        int i, j;
        int num = 1;
        int nn = n * 3 / 2;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                m[(j - i + nn) % n][(i * 2 - j + n) % n] = num++;
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
