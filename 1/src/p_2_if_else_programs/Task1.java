package p_2_if_else_programs;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

public class Task1 {
    public static void main(String[] args) {
        int a = 60, b = 30;

        if (a + b != 180 && a != 0 && b != 0) {
            System.out.println("triangle exists");

            if (a == 90 || b == 90 || 180 - a - b == 90)
                System.out.println("The triangle is rectangular");
        } else
            System.out.println("triangle does'nt exist");
    }
}
