//Jack Klopson | CS2100 Final Project DiceRoll class | 11-14-2024

public class DiceRoll extends Dice {
    public static final int NUM_DIE = 5;

    /**
     * Constructor for DiceRoll.
     * Uses superclass second constructor,
     * initializing the arraylist with NUM_DIE items.
     */
    public DiceRoll() {
        super(NUM_DIE);
    }

    /**
     * Rolls all of the Die in Dice.
     */
    public void toss() {
        for(int i = 0; i < NUM_DIE; i++){
            getDie(i).roll();
        }
    }
}