import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextFile {
    private Path path;
    //private Files file;

    TextFile(String path) {
        this.path = Paths.get(path);
    }

    public void CreateFile() throws IOException {
        if (Files.notExists(path)) {
            System.out.println("File created successfully!");
            Files.createFile(path);
        } else
            System.out.println("This file has already been created!");

    }

    public void RenameFile(String newPath) throws IOException {
        Files.move(path, path.resolveSibling(newPath));
        path = Paths.get(newPath);
    }

    public void Print() throws IOException {
        //System.out.println(Files.readAllLines(path));
        System.out.println("File contents: ");
        for (String x : Files.readAllLines(path))
            System.out.println(x);
    }

    public void addition(String text) throws IOException {
        byte[] strToBytes = text.getBytes();
        Files.write(path, strToBytes, StandardOpenOption.APPEND);

    }

    public void Delete() throws IOException {
        Files.delete(path);
    }
}
