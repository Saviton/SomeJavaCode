package p_2_string_or_stringbuilder;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Task8 {
    public static void main(String[] args) {
        String text = "london is the capital of great britain";
        String[] words = text.split(" ");
        Arrays.sort(words, Comparator.comparing(String::length).reversed());
        System.out.println("result: " + words[0] + ", count: " + words[0].length());
    }
}
