package Catalog;

public class Book {
    /**
     * Поле имя
     */
    private String name;
    /**
     * Поле Автор
     */
    private String author;
    /**
     * Поле Тип книги
     */
    private String type;

    @Override
    public String toString() {
        return "******************************************************************************"
                + System.lineSeparator() + name + System.lineSeparator() + author + System.lineSeparator()
                + type + System.lineSeparator();
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param name   - имя
     * @param author - автор
     * @param type   - тип книги
     */
    public Book(String name, String author, String type) {
        this.name = name;
        this.author = author;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
