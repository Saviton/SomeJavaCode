package p_1_linear_programs;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
 */

public class Task2 {
    public static void main(String[] args) {
        double a = 1, b = 1, c = 1;

        System.out.printf("z = %f\n", ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - a * a * a * c + Math.pow(b, -2));
    }
}
