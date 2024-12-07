import java.util.Objects;

abstract class Resident {
    protected String name;
    protected Mood mood;

    public Resident(String name) {
        this.name = name;
        this.mood = Mood.NEUTRAL;
    }

    public abstract void interact();

    public void changeMood(Mood newMood) {
        this.mood = newMood;
        System.out.println(name + " изменил настроение на: " + mood.getDescription());
    }

    @Override
    public String toString() {
        return name + " (Настроение: " + mood.getDescription() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Resident resident = (Resident) obj;
        return Objects.equals(name, resident.name) && mood == resident.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood);
    }
}