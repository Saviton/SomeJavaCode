package p_4_decomposition_using_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */


public class Task12 {
    public static int sum(ArrayList<Integer> a) {
        int sum = 0;

        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }

        return sum;
    }

    public static List<Integer> task(int k, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (k <= n) {
            answer.add(k);
            return answer;
        }
        for (int i = n; sum(answer) != k; ) {
            if (sum(answer) + i <= k)
                answer.add(i);
            else
                i--;
        }

        return answer;
    }

    public static void main(String[] args) {
        int K = 567, N = 101;

        System.out.println("answer: " + task(K, N));
    }
}
