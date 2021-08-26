package p_2_string_or_stringbuilder;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task1 {
    public static void main(String[] args){
        String line = "london  is  the  capital       of great britain";
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isSpaceChar(line.charAt(i)))
                count++;
            else {
                if (maxCount < count)
                    maxCount = count;
                count = 0;
            }
        }

        System.out.println("maxcount: " + maxCount);
    }
}
