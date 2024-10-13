package labs.lab1;
import labs.lab1.controller.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean gameloop = true;
        while(gameloop) {
            System.out.println("Choose gametype");
            System.out.println("1. Dice game");
            System.out.println("2. Multiplayer game");
            System.out.println("3. Pig game");
            System.out.println("4. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    new DiceGameController();
                    break;
                case 2:
                    new MultiplayerDiceGameController();

                    break;
                case 3:
                    new PigGameController();
                    break;
                case 4:
                    gameloop = false;
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("You need to enter a valid option");
                    break;
            }
        }
    }
}
