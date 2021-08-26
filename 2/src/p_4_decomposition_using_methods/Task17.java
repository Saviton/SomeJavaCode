package p_4_decomposition_using_methods;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился ноль? Для решения задачи использовать декомпозицию.
 */

public class Task17 {
    public static int sum_of_digits(int a) {
        int sum = 0;
        for (; a > 0; a /= 10) {
            sum += a % 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 1565;
        int count = 0;

        for (; number > 0; count++)
            number -= sum_of_digits(number);

        System.out.println("count: " + count);
    }
}
