//Jack Klopson | CS2100 Final Project Category Abstract Class | 11-14-2024
public abstract class Category {
    private int score;
    private boolean used = false;

    /**
     * Abstract method to be defined in subclasses.
     * Will return a score based on a player's turn
     * @param d dice to evaluate
     * @return int value for score
     */
    abstract int evaluate(Dice d);

    /**
     * Adds the value that the Dice would
     * produce to the score of the player,
     * based on the evaluate method. Sets
     * used to true
     * @param d dice to evaluate.
     */
    public void addValue(Dice d) {
        evaluate(d);
        used = true;
    }

    /**
     * Getter method for score
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * Getter method for used
     * @return used
     */
    public boolean getUsed() {
        return used;
    }
}