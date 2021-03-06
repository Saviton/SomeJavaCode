
/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Task 6: ");
        Time time = new Time(24, -60, -60);
        System.out.println(time);
        time.setHours(21);
        time.setMinutes(30);
        time.setSeconds(22);
        System.out.println(time);
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
