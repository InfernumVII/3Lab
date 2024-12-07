import java.util.concurrent.ThreadLocalRandom;

class Harmonica implements MusicalInstrument {
    private final InstrumentSpecs specs = new InstrumentSpecs("Пневматическая гармоника", "выдает звуки бубна, струн и звенящих колокольчиков");

    @Override
    public void play() throws InstrumentBrokenException {
        if (ThreadLocalRandom.current().nextInt(100) < 10) {
            throw new InstrumentBrokenException(specs.name() + " сломана.");
        }
        String sound = generateSound();
        System.out.println(specs.name() + " звучит: " + sound);
    }

    private String generateSound() {
        String[] sounds = {
                "громкий бубен",
                "нежные струны, как у арфы",
                "звонкие колокольчики на разные голоса"
        };
        return sounds[ThreadLocalRandom.current().nextInt(sounds.length)];
    }
}
