package p_2_if_else_programs;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 3, y2 = 4, x3 = 1, y3 = 2;

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
