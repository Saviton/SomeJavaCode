package p_1_one_dimensional_arrays;

import java.util.Arrays;

/**
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {
    public static void main(String[] args)
    {
        int n = 5;

        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (200)) - 100;
        }

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0)
                mas[i] = 0;
        }

        System.out.println("obtained array");
        System.out.println(Arrays.toString(mas));
    }
}
