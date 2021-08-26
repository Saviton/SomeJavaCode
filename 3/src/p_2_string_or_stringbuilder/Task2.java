package p_2_string_or_stringbuilder;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2 {
    public static void main(String[] args){
        String line = "Apocalypse Atlantis Belarus";
        String text = "";

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' || line.charAt(i) == 'A')
                text += line.charAt(i) + "b";
            else
                text += line.charAt(i);
        }

        System.out.println("Source: " + line);
        System.out.println("result: " + text);
    }
}
