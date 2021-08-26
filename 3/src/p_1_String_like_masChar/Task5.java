package p_1_String_like_masChar;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
 * на одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class Task5 {
    public static void main(String[] args){
        String line = "london  is   the   capital   of  great  britain";

        System.out.println(line.replaceAll(" +", " "));
    }
}
