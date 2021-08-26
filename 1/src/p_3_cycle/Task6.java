package p_3_cycle;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}
