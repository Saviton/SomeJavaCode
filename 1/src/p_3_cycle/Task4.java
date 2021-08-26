package p_3_cycle;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i <= 200; i++)
            sum *= Math.pow(i, 2);

        System.out.printf("sum = %d\n", sum);
    }
}
