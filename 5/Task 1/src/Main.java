import java.io.IOException;
import java.nio.file.Paths;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        TextFile textFile = new TextFile("file12.txt");

        String text = "Hello World!";

        textFile.CreateFile();
        textFile.RenameFile("newfile.txt");
        textFile.addition("\nHello World");
        textFile.Print();

        textFile.Delete();


    }
}
