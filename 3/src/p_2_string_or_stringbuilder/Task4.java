package p_2_string_or_stringbuilder;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task4 {
    public static void main(String[] args){
        String info = "информатика", tort = "";
        char[] array = info.toCharArray();

        tort = tort.concat(String.copyValueOf(array, 7, 1))
                .concat(String.copyValueOf(array, 3, 2))
                .concat(String.copyValueOf(array, 7, 1));

        System.out.println(tort);
    }
}
