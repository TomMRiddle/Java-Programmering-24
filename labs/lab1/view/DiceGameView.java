package labs.lab1.view;
import labs.lab1.model.Player;

import java.util.Scanner;

class DiceGameView {
    private Scanner scanner;

    public DiceGameView() {
        scanner = new Scanner(System.in);
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to the Dice Game!");
    }

    public int getPlayerChoice(int guessedNumber) {
        System.out.println("Guess what the die roll result will be:");
        return scanner.nextInt();
    }

    public String getUserName() {
        System.out.println("Enter your name:");
        return scanner.next();
    }

    public void printTurnResult(Player player, boolean correct) {
        System.out.println("Player " + player.getName() + " rolled " + player.getDieValue());
        if(correct) {
            System.out.println("Congratulations, you scored! Your new total score is " + player.getScore());
        } else {
            System.out.println("Better luck next time.");
        }
    }

    public void printWinner(Player[] players) {
        if(players.length > 1 ) {
            System.out.println("We have a tie! The  winners are:");
        } else {
            System.out.println("The winner is:");
        }
        for(Player player : players) {
            System.out.println(player.getName());
        }
    }
}

