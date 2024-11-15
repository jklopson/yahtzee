//Jack Klopson | Final Project Die Class | 11-14-2024

import java.util.Random;

public class Die {
    private static final int SIDES = 6;
    private int value;
    private Random r = new Random();
    /**
     * Default Constructor for Die object
     */
    public Die(){
        value = r.nextInt(1, SIDES+1);
    }

    /**
     * Setter method for the value of a
     * Die object. Sets the value to 
     */
    public void roll() {
        value = r.nextInt(1, SIDES+1);
    }

    /**
     * Getter method for the value of the Die
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Overridden toString method that returns the
     * value of the Die instead of a memory address
     * @return String format of the value of the Die
     */
    @Override
    public String toString() {
        return ""+value;
    }
}