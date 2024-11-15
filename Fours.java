//Jack Klopson | CS2100 Final Project Fours Class | 11-14-2024
public class Fours extends Category {
    /**
     * evaluate abstract method implementation
     * for number of fours
     * @return score based on number of fours
     */
    @Override
    public int evaluate(Dice d) {
        return d.count(4)*4;
    }
}