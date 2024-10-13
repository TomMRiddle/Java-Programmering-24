package labs.lab1.view;
import labs.lab1.model.Player;
import java.util.Scanner;

public class GameView {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Dice Game!");
    }

    public static int getRounds() {
        System.out.println("Enter the number of rounds:");
        return scanner.nextInt();
    }
    public static int getSides() {
        System.out.println("Enter the number of sides on the die:");
        return scanner.nextInt();
    }

    public static String getPlayerName() {
        System.out.println("Enter your name:");
        return scanner.next();
    }

    public static String[] getPlayerNames(int numberOfPlayers) {
        String[] playerNames = new String[numberOfPlayers];
        for(int i = 0; i < playerNames.length; i++) {
            System.out.println("PLAYER " + i);
            playerNames[i] = getPlayerName();
        }
        return playerNames;
    }

    public static int getNumberOfDice() {
        System.out.println("Enter number of dice:");
        return scanner.nextInt();
    }

    public static int getPlayerChoice() {
        System.out.println("Guess what the die roll result will be:");
        return scanner.nextInt();
    }

    public static void printTurnResult(Player player, boolean correct) {
        System.out.println("Player " + player.getName() + " rolled " + player.getDieValue());
        if(correct) {
            System.out.println("Congratulations, you scored! Your new total score is " + player.getScore());
        } else {
            System.out.println("Better luck next time.");
        }
    }

    public static void printWinner(Player player) {
        System.out.println("The final score is:");
        System.out.println(player.getName() + ": " + player.getScore() + " points");
    }
}

