package p_3_cycle;

import java.util.ArrayList;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task8 {
    public static void main(String[] args) {
        int a = 5666, b = 96656;
        ArrayList<Integer> answer = new ArrayList();

        while (a != 0) {
            int aCircus = a % 10;
            while (b != 0) {
                int bCircus = b % 10;
                if (aCircus == bCircus) {
                    if (!answer.contains(aCircus))
                        answer.add(aCircus);
                    break;
                }
                b /= 10;
            }
            a /= 10;
        }

        System.out.println("answer:");
        System.out.println(answer);


    }
}
