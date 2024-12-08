import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class GamePlayer extends Resident {
    private final List<BoardGame> games;

    public GamePlayer(String name, List<BoardGame> games) {
        super(name);
        this.games = new ArrayList<>(games);
    }

    @Override
    public void interact() {
        if (games.isEmpty()) {
            System.out.println(name + " не нашел настольных игр для игры.");
            changeMood(Mood.NEUTRAL);
            return;
        }

        BoardGame game = games.get(ThreadLocalRandom.current().nextInt(games.size()));
        System.out.println(name + " играет в настольную игру \"" + game.name() + "\": " + game.description());
        changeMood(Mood.HAPPY);
    }
}