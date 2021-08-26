package p_4_decomposition_using_methods;

import static p_4_decomposition_using_methods.Task2.nod;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task6 {
    public static void multiSimple(int a, int b, int c) {
        if (nod(a, b) == 1 && nod(a, c) == 1 && nod(b, c) == 1)
            System.out.println("Numbers are mutually simple");
        else
            System.out.println("Numbers are not mutually simple");
    }

    public static void main(String[] args) {
        int a = 17, b = 21, c = 74;

        multiSimple(a, b, c);
    }
}
