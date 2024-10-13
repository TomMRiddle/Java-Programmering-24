package labs.lab1.controller;
import labs.lab1.model.Player;
import labs.lab1.view.GameView;

public class DiceGameController implements GameController {
    private Player[] players = new Player[1];
    private int rounds;
    private boolean isGameOver;

    public DiceGameController() {
        initialize();
        for(int i = 0; i < rounds; i++) {
            //game type logic goes here
            takeTurn();
        }
        getWinners();
    }

    public void initialize() {
        players[0] = new Player(GameView.getPlayerName(), GameView.getSides());
        rounds = GameView.getRounds();
    }

    public void takeTurn() {
        boolean correct = false;
        int playerChoice = GameView.getPlayerChoice();
        players[0].rollDice();
        if(playerChoice == players[0].getDieValue()) {
            players[0].increaseScore();
            correct = true;
            
        }
        GameView.printTurnResult(players[0], correct);
    }

    public void getWinners() {
        GameView.printWinner(players[0]);
    }
}
