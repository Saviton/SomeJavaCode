package p_1_linear_programs;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами
 * (х, у) принадлежит закрашенной области, и false — в противном случае:
 * graph.jpg
 */

public class Task6 {
    public static void main(String[] args) {

        double x = 5, y = 7;

        if ((y <= 4 && x <= 2 && x >= -2 && y >= 0) || (y >= -3 && x >= -4 && x <= 4 && y <= 0))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
