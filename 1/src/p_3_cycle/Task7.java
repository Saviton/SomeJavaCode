package p_3_cycle;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Task7 {
    public static void main(String[] args) {
        int m = 7, n = 30;

        for (int i = m; i <= n; i++) {

            System.out.printf("dividers %d: ", i);

            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
