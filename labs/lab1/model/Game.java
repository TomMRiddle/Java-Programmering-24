package labs.lab1.model;

import java.util.ArrayList;

public abstract class Game {
    protected ArrayList<Player> players;
    protected int rounds;

    public Game() {
        players = new ArrayList<>();
    }
    public void initialize() {};
    public void takeTurn() {};
    public void getWinners() {};
}
