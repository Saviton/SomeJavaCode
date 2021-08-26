package p_2_if_else_programs;
/**
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;

        int answer = Math.max((Math.min(a, b)), (Math.min(c, d)));
        System.out.print("max = " + answer);
    }
}
