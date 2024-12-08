class Diner extends Resident {
    private final String meal;

    public Diner(String name, String meal) {
        super(name);
        this.meal = meal;
    }

    @Override
    public void interact() {
        System.out.println(name + " наслаждается обедом: " + meal);
        changeMood(Mood.HAPPY);
    }
}