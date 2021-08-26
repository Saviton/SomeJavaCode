package p_1_String_like_masChar;

/**
 * В строке найти количество чисел
 */

public class Task4 {
    public static void main(String[] args){
        String line = "11london 28is 3the 14capital 52of 6great 7britain";
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (!flag && Character.isDigit(line.charAt(i))) {
                count++;
                flag = true;
            }
            if (!Character.isDigit(line.charAt(i)))
                flag = false;
        }

        System.out.println("Numbers: " + count);
    }
}
