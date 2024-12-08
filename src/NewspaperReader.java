import java.util.*;

class NewspaperReader extends Reader {
    private final List<Newspaper> newspapers;

    public NewspaperReader(String name, List<Newspaper> newspapers) {
        super(name);
        this.newspapers = new ArrayList<>(newspapers);
    }

    public void interact() {
        processPublications(newspapers);
    }

    @Override
    protected void handlePublication(Publication publication) {
        if (publication instanceof Newspaper newspaper) {
            System.out.println(name + " читает интересную статью из газеты \"" + newspaper.getTitle() + "\": " + newspaper.getArticle());
            changeMood(Mood.HAPPY);
        }
    }
}