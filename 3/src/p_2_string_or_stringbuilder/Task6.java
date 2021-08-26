package p_2_string_or_stringbuilder;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {
    public static void main(String[] args){
        String text = "london is the capital of great britain";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            result += text.charAt(i);
            result += text.charAt(i);
        }

        System.out.println("result: " + result);
    }
}
