package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class Task14 {
    public static void main(String[] args) {

        /**Если рассматривать прямоугольную матрицу, то существуют условия при которых условия не могут быть выполнены, например: матрица 2*3 не имеет решения
         * т.к. в 3 столбец мы не сможем вместить 3 единицы, в связи с чем была использована квадратная матрица. */

        int n = 3;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (j >= i)
                    mas[i][j] = 1;
                else
                    mas[i][j] = 0;
            }
        }

        System.out.println("the resulting matrix: ");
        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
