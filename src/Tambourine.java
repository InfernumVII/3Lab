import java.util.concurrent.ThreadLocalRandom;

class Tambourine implements MusicalInstrument {
    private final InstrumentSpecs specs = new InstrumentSpecs("Музыкальный тамбурин", "звенит и играет мелодию");
    @Override
    public void play() throws InstrumentBrokenException {
        if (ThreadLocalRandom.current().nextInt(100) < 10) {
            throw new InstrumentBrokenException(specs.name() + " сломан.");
        }
        System.out.println(specs.name() + " " + specs.sound());
    }
}