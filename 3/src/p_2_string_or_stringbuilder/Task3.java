package p_2_string_or_stringbuilder;

/**
 * Проверить, является ли заданное слово палиндромом.
 */

public class Task3 {
    public static void main(String[] args){
        String text = "шалаш";
        text = text.toLowerCase();
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        if (result.equals(text))
            System.out.println("the word is a palindrome");
        else
            System.out.println("the word is'nt a palindrome");
    }
}
