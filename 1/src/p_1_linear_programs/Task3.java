package p_1_linear_programs;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * z = ((sin x + cos y) / (cos x - sin y)) * tg (x*y)
 */

public class Task3 {
    public static void main(String[] args) {

        double x = 4, y = 5;
        System.out.printf("z = %.2f\n", (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
    }
}
