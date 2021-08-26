package p_4_decomposition_using_methods;

import java.math.BigInteger;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {
    public static BigInteger sum(int n) {
        BigInteger sum = new BigInteger("0");

        for (long i = (long) Math.pow(10, n - 1) + 1; i < Math.pow(10, n); i = i + 2) {
            sum = sum.add(new BigInteger(String.valueOf(i)));
        }
        return sum;
    }

    public static int evenNumbers(BigInteger n) {
        int evenNumbers = 0;
        String a = n.toString();
        for (int i = 0; i < a.length(); i++) {
            if (Integer.parseInt(a.substring(i, i + 1)) % 2 == 0)
                evenNumbers++;
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
        int n = 5;

        BigInteger digitNumber = sum(n);
        System.out.println(digitNumber.toString());
        System.out.println("Even numbers " + evenNumbers(digitNumber));
    }
}
