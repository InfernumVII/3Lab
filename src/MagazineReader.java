import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import java.util.List;

class MagazineReader extends Reader {
    private final List<Magazine> magazines;

    public MagazineReader(String name, List<Magazine> magazines) {
        super(name);
        this.magazines = new ArrayList<>(magazines);
    }

    public void interact() {
        processPublications(magazines);
    }

    @Override
    protected void handlePublication(Publication publication) {
        if (publication instanceof Magazine magazine) {
            System.out.println(name + " показывает всем смешную картинку из журнала \"" + magazine.getTitle() + "\": " + magazine.getIllustration());
            changeMood(Mood.HAPPY);
        }
    }
}

