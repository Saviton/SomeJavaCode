
/**
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {
        Sentence sentence1 = new Sentence(new Word("История"), new Word("Java"), new Word("началась"), new Word("в"), new Word("1990-х"),
                new Word("годах"), new Word("когда"), new Word("группа"), new Word("инженеров"), new Word("компании"), new Word("Sun"), new Word("Microsystems"));
        Sentence sentence2 = new Sentence(new Word("В"), new Word("процессе"), new Word("реализации"), new Word("проекта"), new Word("изменились"),
                new Word("не"), new Word("только"), new Word("основные"), new Word("приоритеты"), new Word("но"),
                new Word("и"), new Word("название"), new Word("языка"), new Word("Программирования"));
        Sentence sentence3 = new Sentence(new Word("Как"), new Word("бы"), new Word("то"), new Word("ни"), new Word("было,"),
                new Word("в"), new Word("1995"), new Word("году"), new Word("мир"), new Word("познакомился"), new Word("с"), new Word("языком"),
                new Word("программирования"), new Word("Java"));

        Text text = new Text(sentence1, sentence2);

        text.addSentence(sentence3);
        text.header("Java");
        text.printText();


    }
}
