import java.util.*;

class Book extends Publication {
    private final String content;

    public Book(String title, String content) {
        super(title);
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

