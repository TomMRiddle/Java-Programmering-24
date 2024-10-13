package labs.lab1.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import exercises.solutions.E5.library.Book;
import labs.lab1.model.Player;
import labs.lab1.view.GameView;

public class MultiplayerDiceGameController {
    private static Player[] players;
    private static int rounds;
    
    
    public MultiplayerDiceGameController() {
        initialize();
        for(int i = 0; i < rounds; i++) {
            takeTurn();
        }
        getWinners();
    }
    
    private static void initialize() {
        String[] playerNames = GameView.getPlayerNames();
        int numberOfDice = GameView.getNumberOfDice();
        int sides = GameView.getSides();
        rounds = GameView.getRounds();
        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i], numberOfDice, sides);
        }
    }

    private static void takeTurn() {
        for(Player player : players) {
            player.rollDice();
            player.addDiceToScore();
            GameView.printTurnResult(player, true);
        }
    }

    private static void getWinners() {
        Arrays.sort(players, Comparator.comparingInt(Player::getScore).reversed());
        int winningScore = 0;
        for(Player player : players) {  
            if(player.getScore() >= winningScore) {
                GameView.printWinner(player);
            } else {
                break;
            }
            winningScore = player.getScore();
        }
    }
}
