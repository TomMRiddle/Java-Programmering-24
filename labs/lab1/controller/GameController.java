package labs.lab1.controller;
import labs.lab1.model.Player;

public interface GameController {
    public void initialize();
    public void takeTurn();
    public void getWinners();
}
