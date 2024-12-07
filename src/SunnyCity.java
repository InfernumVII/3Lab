import java.util.ArrayList;
import java.util.List;

class SunnyCity {
    private final List<Resident> residents;
    private String timeOfDay;

    public SunnyCity() {
        residents = new ArrayList<>();
        timeOfDay = "День";
    }

    public void addResident(Resident resident) {
        if (resident instanceof Girl && ((Girl) resident).getInstrument() == null) {
            throw new IllegalArgumentException(resident.name + " не имеет музыкального инструмента!");
        }
        residents.add(resident);
    }
    public List<Resident> getResidents() {
        return residents;
    }

    public void changeTimeOfDay(String newTime) {
        timeOfDay = newTime;
        System.out.println("Сейчас: " + timeOfDay);
    }

    public void startScenario() {
        startScenario(1000);
    }
    public void startScenario(long millis) {
        System.out.println("Начинается день в Солнечном городе.");
        for (Resident resident : residents) {
            try {
                Thread.sleep(millis);
                resident.interact();
                // Все остальные жители делятся настроением
                for (Resident otherResident : residents) {
                    if (otherResident != resident) {
                        otherResident.changeMood(resident.mood); // Делимся настроением с другими
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Сценарий был прерван: " + e.getMessage());
            }
        }
    }
}