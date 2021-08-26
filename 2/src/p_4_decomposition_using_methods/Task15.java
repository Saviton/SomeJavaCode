package p_4_decomposition_using_methods;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */

public class Task15 {
    public static void detect(int n) {
        int place, next, tmp;

        boolean flag;

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            tmp = i;
            flag = true;

            for (int j = 0; tmp > 9; tmp /= 10) {
                place = tmp % 10;
                next = (tmp / 10) % 10;
                if (place <= next) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        detect(n);
    }
}
