
/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2: ");
        Test2 test2 = new Test2();
        System.out.println("a: " + test2.getA() + ", b: " + test2.getB());
        test2 = new Test2(11, 9);
        System.out.println("a: " + test2.getA() + ", b: " + test2.getB());
        test2.setA(21);
        test2.setB(27);
        System.out.println("a: " + test2.getA() + ", b: " + test2.getB());
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
