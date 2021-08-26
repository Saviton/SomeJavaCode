package p_2_if_else_programs;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
 * пройдет ли кирпич через отверстие.
 */

public class Task4 {
    public static void main(String[] args) {
        double A = 7, B = 5;
        double x = 7, y = 5, z = 2;

        if (A * B >= x * y || A * B >= x * z || A * B >= z * y)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
