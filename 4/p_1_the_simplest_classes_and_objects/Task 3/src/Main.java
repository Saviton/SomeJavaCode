
/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
 * номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов,
 * имеющих оценки, равные только 9 или 10.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 3: ");
        Student[] students = new Student[10];
        students[0] = new Student("Иванов Д.П.", "5", new int[]{10, 10, 9, 8, 9});
        students[1] = new Student("Сидоров К.Г.", "5", new int[]{7, 7, 10, 9, 10});
        students[2] = new Student("Петров В.А.", "5", new int[]{9, 9, 8, 9, 9});
        students[3] = new Student("Алексеев Л.Н.", "3", new int[]{9, 10, 9, 8, 9});
        students[4] = new Student("Сергеев Н.В.", "3", new int[]{7, 7, 8, 10, 9});
        students[5] = new Student("Антонов А.В.", "3", new int[]{7, 8, 9, 10, 3});
        students[6] = new Student("Миронов A.C.", "4", new int[]{10, 9, 10, 9, 10});
        students[7] = new Student("Караткевич М.Ю.", "4", new int[]{8, 9, 7, 9, 8});
        students[8] = new Student("Ломоносов М.В.", "4", new int[]{10, 8, 9, 10, 8});
        students[9] = new Student("Дюпри Ж.Ш.", "6", new int[]{9, 10, 9, 10, 9});

        for (int i = 0; i < students.length; i++) {
            students[i].check_excellent();
        }
        System.out.println("--------------------------------------------------------------------------------------");

    }
}
