package p_1_String_like_masChar;

import java.util.Arrays;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1 {
    public static void main(String[] args) {
        StringBuffer[] text = {new StringBuffer("camelCase"), new StringBuffer("londonPl"),
                new StringBuffer("terriblePoji"), new StringBuffer("terribleVim")};

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                if (Character.isUpperCase(text[i].charAt(j))) {
                    text[i].insert(j, "_");
                    break;
                }
            }
        }

        System.out.println("result: " + Arrays.toString(text));

    }
}
