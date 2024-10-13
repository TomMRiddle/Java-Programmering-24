package labs.lab1.helpers;
import labs.lab1.controller.*;

public class GameFactory {
    public static GameController createDiceGame() {
        return new DiceGameController();
    }
    public static GameController createMultiplayerGame() {
        return new MultiplayerDiceGameController();
    }
    public static GameController createPigGame() {
        return new PigGameController();
    }
}
