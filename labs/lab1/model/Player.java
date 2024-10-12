package labs.lab1.model;

public class Player {
    private String name;
    private int score;
    private Die[] dice;

    public Player(String name, int numberOfDice, int sides) {
        this.name = name;
        score = 0;
        dice = new Die[numberOfDice];
        addDie(numberOfDice, sides);
    }

    public void rollDice() {
        for(Die die : dice) {
            die.roll();
        }
    }

    private void addDie(int numberOfDice, int sides) {
        for(int i=0;i < numberOfDice;i++) {
            dice[i] = new Die(sides);
        }
    }

    public int getDieValue() {
        int total = 0;
        for(Die die : dice) {
            total += die.getDieValue();
        }
        return total;
    }
    
    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}