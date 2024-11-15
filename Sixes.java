//Jack Klopson | CS2100 Final Project Sixes Class | 11-14-2024
public class Sixes extends Category {
    /**
     * evaluate abstract method implementation
     * for number of sixes
     * @return score based on number of sixes
     */
    @Override
    public int evaluate(Dice d) {
        return d.count(6)*6;
    }
}