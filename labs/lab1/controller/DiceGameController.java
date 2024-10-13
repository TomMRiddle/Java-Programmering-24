package labs.lab1.controller;
import labs.lab1.model.Player;
import labs.lab1.view.GameView;

public class DiceGameController implements GameController {
    private Player[] players;
    private int rounds;
    private boolean isGameOver;

    public DiceGameController() {
        players = initialize();
        while(!isGameOver) {
            //game type logic goes here
        }
    }

    public Player[] initialize() {
        players[0] = Player(GameView.getPlayerName(), GameView.getSides());
        rounds = GameView.getRounds();
        return players;
    }

    public void takeTurn() {

    }

    public void getWinners() {
    
    }
}
