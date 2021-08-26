package p_2_array_of_arrays;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I² - J²) / N)
 * и подсчитать количество положительных элементов в ней
 */

public class Task7 {
    public static void main(String[] args)
    {
        int n = 6;
        int counter = 0;
        double[][] mas = new double[n][n];

        for (int i = 0; i < mas.length; ++i) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = Math.sin((i * i - j * j) / n);
                if (mas[i][j] > 0)
                    counter++;
            }
        }

        System.out.println("the resulting matrix");
        for (int i = 0; i < mas.length; i++) {//output
            for (int j = 0; j < mas[0].length; j++) {
                System.out.printf("%.2f  ", mas[i][j]);
            }
            System.out.println();
        }

        System.out.println("positive elements: " + counter);
    }
}
