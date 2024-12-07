import java.util.concurrent.ThreadLocalRandom;

class Trumpet implements MusicalInstrument {
    private final InstrumentSpecs specs = new InstrumentSpecs("Труба", "издаёт ритмичные звуки");

    @Override
    public void play() throws InstrumentBrokenException {
        if (ThreadLocalRandom.current().nextInt(100) < 20) {
            throw new InstrumentBrokenException(specs.name() + " сломан.");
        }
        System.out.println(specs.name() + " " + specs.sound());
    }
}