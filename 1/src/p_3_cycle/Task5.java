package p_3_cycle;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * aₙ = 1/2^n + 1/3^n
 */

public class Task5 {
    public static void main(String[] args) {
        double e = 0.001;
        double sum = 0, a;

        for (int n = 1; ; ++n) {
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));

            if (Math.abs(a) <= e)
                break;

            sum += a;
        }

        System.out.print("сумма: " + sum);
    }
}
