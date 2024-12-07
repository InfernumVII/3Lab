class Boy extends MusicalResident {
    public Boy(String name, MusicalInstrument instrument) {
        super(name, instrument);
    }

    @Override
    public void interact() {
        System.out.println(name + " играет на музыкальном инструменте.");
        try {
            instrument.play();
            changeMood(Mood.HAPPY);
        } catch (InstrumentBrokenException e) {
            System.out.println(name + " не смог сыграть: " + e.getMessage());
            changeMood(Mood.SAD);
        }
    }
}