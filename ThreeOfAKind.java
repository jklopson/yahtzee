//Jack Klopson | CS2100 Final Project ThreeOfAKind Class | 11-14-2024
public class ThreeOfAKind extends Category {
    /**
     * evaluate abstract method implementation
     * for three of a kind
     * @return score based on three of a kind
     */
    @Override
    public int evaluate(Dice d) {
        return d.sum();
    }
}