package p_4_decomposition_using_methods;
/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */
public class Task14 {
    public static void armstrongNumber(int n, int k) {
        for (int i = 1; i <= k; i++) {
            int originalNumber, remainder, result = 0;

            originalNumber = i;

            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, n);
                originalNumber /= 10;
            }

            if (result == i)
                System.out.println(i + " is an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        int n = 3, k = 1000;

        armstrongNumber(n, k);
    }
}
