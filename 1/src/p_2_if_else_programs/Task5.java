package p_2_if_else_programs;

/**
 * Вычислить значение функции:
 * F(x) = x2 = x²-3x+9, если x<=3
 * F(x) = 1/(x³ + 6), если x>3
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task 5: ");
        double x = 5;

        if (x <= 3)
            System.out.println("result : " + (x * x - 3 * x + 9));
        else
            System.out.println("result : " + (1 / (x * x * x + 6)));

        System.out.println("***************************************************************************************");
    }
}
