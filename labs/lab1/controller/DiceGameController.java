package labs.lab1.controller;
import labs.lab1.model.Player;
import labs.lab1.view.GameView;

public class DiceGameController implements GameController {
    private Player[] players;
    private int rounds;
    private boolean isGameOver;

    public DiceGameController() {
        initialize();
        while(!isGameOver) {
            //game type logic goes here
        }
    }

    private initialize() {
        players[0] = new Player(GameView.getPlayerName(), GameView.getSides());
        rounds = GameView.getRounds();
    }

    public void takeTurn() {

    }

    public void getWinners() {
    
    }
}
