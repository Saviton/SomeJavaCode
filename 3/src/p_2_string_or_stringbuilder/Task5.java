package p_2_string_or_stringbuilder;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task5 {
    public static void main(String[] args){
        System.out.println("Task 5: ");

        String text = "london is the capital of great britain";

        System.out.println("a: " + (text.length() - text.replaceAll("a+", "").length()));
    }
}
