package p_3_cycle;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x,x>2  y=-x,x>=2
 */

public class Task2 {
    public static void main(String[] args) {
        double a = 1, b = 5, h = 1;

        for (double x = a; x <= b; x += h) {
            if (x > 2 || x == 0)
                System.out.printf("f(%f) = %f\n", x, x);
            else
                System.out.printf("f(%f) = %f\n", x, -x);
        }
    }
}
