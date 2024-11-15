//Jack Klopson | CS2100 Final Project Fives Class | 11-14-2024
public class Fives extends Category {
    /**
     * evaluate abstract method implementation
     * for number of fives
     * @return score based on number of fives
     */
    @Override
    public int evaluate(Dice d) {
        return d.count(5)*5;
    }
}