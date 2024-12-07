class Girl extends MusicalResident {

    public Girl(String name, MusicalInstrument instrument) {
        super(name, instrument);
    }


    @Override
    public void interact() {
        System.out.println(name + " играет на музыкальном инструменте.");
        try {
            instrument.play();
            changeMood(Mood.HAPPY);
        } catch (InstrumentBrokenException e) {
            System.out.println(name + " не смогла сыграть: " + e.getMessage());
            changeMood(Mood.SAD);
        }
    }
}