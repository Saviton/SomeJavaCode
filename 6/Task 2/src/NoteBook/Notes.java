package NoteBook;

import java.time.LocalDate;

/**
 * Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками
 * в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, е-mail, сообщение).
 * <p>
 */
public class Notes {
    private String topic;
    private LocalDate date;
    private String email;
    private String message;

    public Notes(String topic, String data, String email, String message) {
        this.topic = topic;
        this.date = LocalDate.parse(data);
        this.email = email;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "****************************************************************************" + System.lineSeparator() + topic + System.lineSeparator() + date +
                System.lineSeparator() + email + System.lineSeparator() + message + System.lineSeparator();
    }
}
