package labs.lab1.view;
import labs.lab1.model.Player;
import java.util.Scanner;

public class GameView {
    private static boolean tie = false;
    private static Scanner scanner = new Scanner(System.in);

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

    public static String[] getPlayerNames() {
        System.out.println("\nEnter the number of players");
        String[] playerNames = new String[scanner.nextInt()];
        for(int i = 0; i < playerNames.length; i++) {
            System.out.println("PLAYER " + (i + 1));
            playerNames[i] = getPlayerName();
        }
        return playerNames;
    }

    public static int getNumberOfDice() {
        System.out.println("\nEnter number of dice:");
        return scanner.nextInt();
    }

    public static int getPlayerChoice() {
        System.out.println("\nGuess what the die roll result will be:");
        return scanner.nextInt();
    }

    public static void printTurnResult(Player player, boolean correct) {
        System.out.println("\nPlayer " + player.getName() + " rolled " + player.getDieValue());
        if(correct) {
            System.out.println("Your new total score is " + player.getScore());
        } else {
            System.out.println("Better luck next time.");
        }
    }

    public static void printWinner(Player player) {
        if(!tie) {
            System.out.println("\nThe winners final score is:");
        } 
        System.out.println(player.getName() + ": " + player.getScore() + " points");
        tie = true;
    }
}

