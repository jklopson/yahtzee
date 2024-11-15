//Jack Klopson | CS2100 Final Project Chance Class | 11-14-2024
public class Chance extends Category {
    /**
     * evaluate abstract method implementation
     * for three of a kind
     * @return score based on ,chance
     */
    @Override
    public int evaluate(Dice d) {
        return d.sum();
    }
}