package p_4_decomposition_using_methods;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */

public class Task3 {
    public static double right_triangle(double a) {
        return (Math.sqrt(3) / 4) * a * a;
    }

    public static void main(String[] args) {
        int a = 5;

        System.out.println("hexagon area: " + 6 * right_triangle(a));
    }
}
