package p_4_decomposition_using_methods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 * HOK(A,B) = (A*B)/ НОД(A,B)
 */

public class Task1 {
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

        int a = 15, b = 72;

        System.out.println("smallest common factor: " + nod(a, b));
        System.out.println("greatest common multiple: " + nok(a, b));
    }
}
