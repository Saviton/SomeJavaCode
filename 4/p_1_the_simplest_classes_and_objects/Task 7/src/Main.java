import java.util.Scanner;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Task 7: ");

        Triangle triangle;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = in.nextInt();
            System.out.println("Enter b: ");
            int b = in.nextInt();
            System.out.println("Enter c: ");
            int c = in.nextInt();
            triangle = new Triangle(a, b, c);
        } while (!triangle.check());

        System.out.println("area: " + triangle.area());
        System.out.println("perimeter: " + triangle.perimeter());
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
