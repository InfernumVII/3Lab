import java.util.List;
import java.util.Optional;

abstract class Publication {
    private final String title;
    private boolean isTaken;

    public Publication(String title) {
        this.title = title;
        this.isTaken = false; // По умолчанию издание свободно
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return !isTaken;
    }

    public void markAsTaken() {
        this.isTaken = true;
    }


    public static <T extends Publication> Optional<T> takeAvailablePublication(List<T> publications) {
        return publications.stream()
                .filter(Publication::isAvailable)
                .findFirst()
                .map(publication -> {
                    publication.markAsTaken(); // Помечаем как занятую
                    return publication;
                });
    }
}
