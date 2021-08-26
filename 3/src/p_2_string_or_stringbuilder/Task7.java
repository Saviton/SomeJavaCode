package p_2_string_or_stringbuilder;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Task7 {
    public static void main(String[] args){
        String text = " abc cde def";
        String result = "";

        text = text.replaceAll(" +", "");
        result += text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j))
                    break;
                if (j == i - 1)
                    result += text.charAt(i);
            }
        }

        System.out.println("result: " + result);
    }
}
