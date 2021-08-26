package p_3_pattern_matcher;
import java.util.*;

import static java.util.Comparator.comparingInt;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

public class Task1 {
    private static void sortParagraph(String text) {
        String[] paragraphs = text.split("\\n");
        int count = 0;

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String paragr : paragraphs) {
            for (String s1 : paragr.split("[.!?]")) {
                count++;
            }
            map.put(paragr, count);
            count = 0;
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    private static void sortWord(String text) {
        String[] sentences = text.split("[.!?]");
        ArrayList<String> words = new ArrayList<>();

        Comparator<String> comparator = comparingInt(String::length);
        for (String sent : sentences) {
            sent = sent.trim();

            Collections.addAll(words, sent.split("\\s*([ ,;:.«»\\-—])\\s*"));
            words.sort(comparator);
            System.out.println(words);
            words.clear();
        }
    }

    private static void SortLiteral(String text, char letter) {
        if (text.indexOf(letter) != -1) {
            String[] sentences = text.split("([.!?]+)");
            for (String s : sentences) {
                String[] mass = s.split("\\W");
                for (int k = 0; k < mass.length; k++) {
                    if (mass[k].indexOf(letter) == -1) {
                        mass[k] = mass[k].replaceAll(".", "");
                    }
                }
                for (int k = 0; k < mass.length; k++) {
                    for (int j = 0; j < mass.length - 1; j++) {
                        if (CountLiteral(mass[j], letter) > CountLiteral(mass[j + 1], letter)) {
                            String temp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = temp;
                        }
                    }
                }
                for (int k = 0; k < mass.length; k++) {
                    for (int j = 0; j < mass.length - 1; j++) {
                        if (CountLiteral(mass[j], letter) == CountLiteral(mass[j + 1], letter) && mass[j].compareTo(mass[j + 1]) > 0) {
                            String temp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = temp;
                        }
                    }
                }
                int count = 1;
                for (String a : mass) {
                    if (!a.equals("")) {
                        if (count == mass.length) {
                            System.out.print(a);
                            System.out.println();
                        } else {
                            System.out.print(a + " ");
                        }
                    }
                    count++;
                }
            }
        } else {
            System.out.println("Отсутствует");
        }
    }

    private static int CountLiteral(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String text = "\n\tMeet my family. There are five of us - my parents, my elder brother, my baby sister and me. First, meet my mum and dad, Jane and Michael. " +
                "\n\tMy mum enjoys reading and my dad enjoys playing chess with my brother Ken. My mum is slim and rather tall. She has long red hair and big brown eyes." +
                "\n\tShe has a very pleasant smile and a soft voice. My mother is very kind and understanding. We are real friends. She is a housewife. " +
                "\n\tAs she has three children, she is always busy around the house." +
                "\n\tShe takes care of my baby sister Meg, who is only three months old. My sister is very small and funny. She sleeps, eats and sometimes cries." +
                "\n\tWe all help our mother and let her have a rest in the evening. " +
                "\n\tThen she usually reads a book or just watches TV. " +
                "\n\tMy father is a doctor. He is tall and handsome. He has short dark hair and gray eyes. He is a very hardworking man. He is rather strict with us, but always fair. " +
                "\n\tMy elder brother Ken is thirteen, and he is very clever." +
                "\n\tHe is good at Maths and always helps me with it, because I can hardly understand all these sums and problems." +
                "\n\tKen has red hair and brown eyes. My name is Jessica. I am eleven.";


        //абзацы по количеству предложений
        System.out.println("Source text: \n" + text);
        System.out.println("Абзацы по количеству предложений: \n");
        sortParagraph(text);
        System.out.println("\nОтсортированые слова в каждом предложении по длине: \n");
        sortWord(text);
        System.out.println("");
        SortLiteral(text, 'a');
    }
}
