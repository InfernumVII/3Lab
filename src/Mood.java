enum Mood {
    NEUTRAL("Нейтральное"),
    HAPPY("Веселое"),
    SAD("Грустное");

    private final String description;

    Mood(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}