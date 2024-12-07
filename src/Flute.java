import java.util.concurrent.ThreadLocalRandom;

class Flute implements MusicalInstrument {
    private final InstrumentSpecs specs = new InstrumentSpecs("Флейта", "издает мелодичные звуки");

    @Override
    public void play() throws InstrumentBrokenException {
        if (ThreadLocalRandom.current().nextInt(100) < 5) {
            throw new InstrumentBrokenException(specs.name() + " сломана.");
        }
        System.out.println(specs.name() + " " + specs.sound());
    }
}