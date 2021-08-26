package p_3_cycle;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");

        int x = 8;
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.printf("sum: %d\n", sum);
    }
}
