package p_4_decomposition_using_methods;

import java.util.Scanner;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {

    public static void numbersCompare(int a, int b) {
        if (String.valueOf(a).length() > String.valueOf(b).length())
            System.out.println("a > b");
        else if (String.valueOf(a).length() < String.valueOf(b).length())
            System.out.println("a < b");
        else
            System.out.println("a = b");

    }

    public static void main(String[] args) {
        int a = 455, b = 1111;

        numbersCompare(a, b);
    }
}
