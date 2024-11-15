//Jack Klopson | CS2100 Final Project Threes Class | 11-14-2024
public class Threes extends Category {
    /**
     * evaluate abstract method implementation
     * for number of threes
     * @return score based on number of threes
     */
    @Override
    public int evaluate(Dice d) {
        return d.count(3)*3;
    }
}