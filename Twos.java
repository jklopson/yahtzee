//Jack Klopson | CS2100 Final Project Twos Class | 11-14-2024
public class Twos extends Category {
    /**
     * evaluate abstract method implementation
     * for number of twos
     * @return score based on number of twos
     */
    @Override
    public int evaluate(Dice d) {
        return d.count(2)*2;
    }
}