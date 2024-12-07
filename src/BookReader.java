import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import java.util.List;

class BookReader extends Reader {
    private final List<Book> books;

    public BookReader(String name, List<Book> books) {
        super(name);
        this.books = new ArrayList<>(books);
    }

    public void interact() {
        processPublications(books);
    }

    @Override
    protected void handlePublication(Publication publication) {
        if (publication instanceof Book book) {

            // Шанс на неудачное прочтение книги
            if (ThreadLocalRandom.current().nextInt(100) < 20) {
                System.out.println(name + " попытался прочитать книгу, но что-то пошло не так...");
                changeMood(Mood.SAD);
            } else {
                System.out.println(name + " читает вслух смешное место из книги \"" + book.getTitle() + "\": " + book.getContent());
                changeMood(Mood.HAPPY);
            }
        }
    }
}
