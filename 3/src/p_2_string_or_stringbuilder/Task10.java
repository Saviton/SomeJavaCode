package p_2_string_or_stringbuilder;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class Task10 {
    public static void main(String[] args){
        String text = "london. is the capital? of great britain!";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?')
                count++;
        }

        System.out.println("Number of offers: " + count);
    }
}
