package p_4_decomposition_using_methods;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Task9 {
    public static double quadrangleArea(int x, int y, int z, int t) {
        int p = (x + y + z + t) / 2;
        return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
    }

    public static void main(String[] args) {
        int x = 3, y = 4, z = 6, t = 5;

        System.out.println("Quadrangle area: " + quadrangleArea(x, y, z, t));
    }
}
