package p_3_one_dimensional_sort_arrays;

import java.util.Arrays;

/**
 * Даны две последовательности a1<a2<...<an и b1<b2<...<bn. Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task2 {


    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 8, 12};
        int size = a.length;

        int[] b = {2, 3, 6, 9, 10};

        a = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, a, size, b.length);
        Arrays.sort(a);

        System.out.println("the resulting array" + Arrays.toString(a));
    }
}
