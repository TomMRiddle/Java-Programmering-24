package labs.lab1.model;

public class Player {
    private String name;
    private int score;
    private Die[] dice;
    private int tempScore;

    public Player(String name, int sides) {
        this.name = name;
        score = 0;
        tempScore = 0;
        dice = new Die[1];
        addDie(1, sides);
    }

    public Player(String name, int numberOfDice, int sides) {
        this.name = name;
        score = 0;
        tempScore = 0;
        dice = new Die[numberOfDice];
        addDie(numberOfDice, sides);
    }

    public void rollDice() {
        for(Die die : dice) {
            die.roll();
        }
    }

    private void addDie(int numberOfDice, int sides) {
        for(int i = 0; i < numberOfDice; i++) {
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

    public void addDiceToScore() {
        score += getDieValue();
    }

    public int getScore() {
        return score;
    }

    public int getTempScore() {
        return tempScore;
    }
    
    public String getName() {
        return name;
    }

    public void addToTempScore() {
        tempScore += getDieValue();
    }
    public void resetTempScore() {
        tempScore = 0;
    }
    public void addTempScoreToTotal() {
        score += tempScore;
    }
}