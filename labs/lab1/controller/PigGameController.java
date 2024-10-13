package labs.lab1.controller;

import java.util.Arrays;
import java.util.Comparator;

import labs.lab1.model.Player;
import labs.lab1.view.GameView;

public class PigGameController {
    private static Player[] players;
    private static boolean isGameOver = false;
    
    public PigGameController() {
        initialize();
        do {
            takeTurn();
        }
        while (!isGameOver);
        getWinners();
    }
    
    private static void initialize() {
        String[] playerNames = GameView.getPlayerNames();
        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i], 6);
        }
    }

    private static void takeTurn() {
        for(Player player : players) {
            do {
                player.rollDice();
                if(player.getDieValue() == 1) {
                    player.resetTempScore();
                    GameView.printTurnResult(player, false);
                    break;
                } else {
                    player.addToTempScore();
                    GameView.printDieRollAndTempScore(player);
                }   
            } while(GameView.getEndTurn());
            player.addTempScoreToTotal();
            player.resetTempScore();
            if(player.getScore() >= 100) {
                isGameOver = true;
            }
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