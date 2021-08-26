package p_1_String_like_masChar;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task2 {
    public static void main(String[] args){
        String line = "word is kek word lol word word.doc poword";

        System.out.println(line.replace("word", "letter"));
    }
}
