package labs.lab1.model;
import java.util.Random;

class Die {
    private int sides;
    private Random random;
    private int value;

    public Die(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public void roll() {
        value = random.nextInt(sides) + 1;
    }

    public int getDieValue() {
        return value;
    }
}