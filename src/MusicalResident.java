

abstract class MusicalResident extends Resident {
    protected String name;
    protected MusicalInstrument instrument;

    public MusicalResident(String name, MusicalInstrument instrument) {
        super(name);
        this.name = name;
        this.instrument = instrument;
    }

    public MusicalInstrument getInstrument() {
        return instrument;
    }
}
