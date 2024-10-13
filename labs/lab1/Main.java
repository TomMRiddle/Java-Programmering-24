package labs.lab1;
import labs.lab1.controller.*;
import java.util.Scanner;
import labs.lab1.helpers.GameFactory;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Game game;
    public static void main(String[] args) {
        System.out.println("Choose gametype");
        System.out.println("1. Dice game");
        System.out.println("2. Multiplayer game");
        System.out.println("3. Pig game");
        boolean gameloop = true;
        while(gameloop) {
            switch (scanner.nextInt()) {
                case 1:
                    private Game game = new DiceGameController().initialize();;
                    break;
                case 2:
                    new MultiplayerGame();
                    break;
                case 3:
                    new PigGame();
                    break;
                default:
                    System.out.println("You need to enter a valid option");
                    break;
            }
        }
    }
}
