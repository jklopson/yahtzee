//Jack Klopson | CS2100 Final Project FourOfAKind Class | 11-14-2024
public class FourOfAKind extends Category {
    /**
     * evaluate abstract method implementation
     * for three of a kind
     * @return score based on four of a kind
     */
    @Override
    public int evaluate(Dice d) {
        return d.sum();
    }
}