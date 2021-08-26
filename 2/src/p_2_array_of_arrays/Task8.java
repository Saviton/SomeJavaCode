package p_2_array_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class Task8 {
    public static void main(String[] args)
    {
        int[][] mas = {
                {2, 7, 1},
                {6, 4, 5},
                {10, 7, 8}};

        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(mas));

        int k = 1;
        int p = 2;
        int tmp;

        for (int i = 0; i < mas.length; i++) {
            tmp = mas[i][p - 1];
            mas[i][p - 1] = mas[i][k - 1];
            mas[i][k - 1] = tmp;
        }

        System.out.println("the resulting matrix");

        for (int i = 0; i < mas.length; i++) {//output
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
