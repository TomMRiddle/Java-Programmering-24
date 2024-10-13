package labs.lab1.controller;
import labs.lab1.model.Player;
import labs.lab1.view.GameView;

public class DiceGameController {
    private static Player[] players = new Player[1];
    private static int rounds;

    public DiceGameController() {
        initialize();
        for(int i = 0; i < rounds; i++) {
            takeTurn();
        }
        getWinners();
    }

    private static void initialize() {
        players[0] = new Player(GameView.getPlayerName(), GameView.getSides());
        rounds = GameView.getRounds();
    }

    private static void takeTurn() {
        boolean correct = false;
        int playerChoice = GameView.getPlayerChoice();
        players[0].rollDice();
        if(playerChoice == players[0].getDieValue()) {
            players[0].increaseScore();
            correct = true;
            
        }
        GameView.printTurnResult(players[0], correct);
    }

    private static void getWinners() {
        GameView.printWinner(players[0]);
    }
}
