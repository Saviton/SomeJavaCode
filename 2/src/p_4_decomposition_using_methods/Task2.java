package p_4_decomposition_using_methods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {
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
        int a = 32, b = 4, c = 8, d = 16;

        System.out.println("smallest common factor: " + nod(nod(a, b), nod(c, d)));
    }
}
