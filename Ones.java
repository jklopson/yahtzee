//Jack Klopson | CS2100 Final Project Ones Class | 11-14-2024
public class Ones extends Category {
    /**
     * evaluate abstract method implementation
     * for number of ones
     * @return 
     */
    @Override
    public int evaluate(Dice d) {
        return d.count(1);
    }
}