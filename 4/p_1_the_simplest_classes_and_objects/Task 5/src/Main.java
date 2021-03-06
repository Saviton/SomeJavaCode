
/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
 * по-умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
 * возможности класса.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Task 5: ");

        new Counter(10, 1, 1).print();
        new Counter().print();

        System.out.println("--------------------------------------------------------------------------------------");
    }
}
