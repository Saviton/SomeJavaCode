package p_1_String_like_masChar;

/**
 * В строке найти количество цифр.
 */

public class Task3 {
    public static void main(String[] args){
        String line = "1london 2is 3the 4capital 5of 6great 78britain";
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i)))
                count++;
        }

        System.out.println("Digits: " + count);
    }
}
