package p_1_linear_programs;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    public static void main(String[] args) {
        double a = 111.222;
        System.out.println("z = " + ((a * 1000) % 1000 + (int) a / 1000.0));
    }
}
