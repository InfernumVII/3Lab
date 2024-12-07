import java.util.*;

abstract class Reader extends Resident {
    public Reader(String name) {
        super(name);
    }


    protected abstract void handlePublication(Publication publication);


    protected <T extends Publication> void processPublications(List<T> publications) {
        if (!publications.isEmpty()) {
            Optional<T> availablePublication = Publication.takeAvailablePublication(publications);

            if (availablePublication.isPresent()) {
                handlePublication(availablePublication.get());
            } else {
                System.out.println(name + " не нашел свободного издания для чтения.");
                changeMood(Mood.NEUTRAL);
            }
        } else {
            System.out.println(name + " не нашел изданий для чтения.");
            changeMood(Mood.NEUTRAL);
        }
    }
}
