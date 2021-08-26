package p_2_string_or_stringbuilder;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших)
 * букв в введенной строке. Учитывать только английские буквы.
 */

public class Task9 {
    public static void main(String[] args){
        int count_low = 0, count_up = 0;
        String line = "London Britain";

        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i)))
                count_up++;
            else if (Character.isLowerCase(line.charAt(i)))
                count_low++;

        }
        System.out.println("count_low: " + count_low + ", count_up: " + count_up);
    }
}
