// Jack Klopson | CS2100 Final Project Dice Class | 11-14-2024

import java.util.ArrayList;

public class Dice {
    private static final int DEF_CAP = 5;
    private ArrayList<Die> dice;

    /**
     * Default constructor for a Die object
     */
    public Dice() {
        dice = new ArrayList<>(DEF_CAP);
    }

    /**
     * Overloaded constructor for a Die object
     * @param num creates arraylist of dice with num capacity
     */
    public Dice(int num) {
        dice = new ArrayList<>(num);
    }

    /**
     * Adds a Die d to the end of the arraylist
     * @param d Die to add
     */
    public void addDie(Die d) {
        dice.add(d);
    }

    /**
     * Getter method for the number of Die in dice
     * @return number of Die elements in arraylist
     */
    public int getNumDice() {
        return dice.size();
    }

    /**
     * Getter method for the die at at certain
     * index in the arraylist
     * @param i index in the arraylist
     * @return Die at index i
     */
    public Die getDie(int i) {
        return dice.get(i);
    }

    /**
     * Removes a Die at index i from the arraylist
     * @param i the index to be removed
     * @return the die at index i
     */
    public Die removeDie(int i) {
        return dice.remove(i);
    }

    /**
     * 
     * @param val
     * @return
     */
    public int count(int val) {
        int ct = 0;
        for(int i = 0; i < dice.size(); i++){
            if(dice.get(i).getValue() == val)
                ct++;
        }
        return ct;
    }

    /**
     * Calculates the sum of all Die in arraylist
     * @return integer sum of all Die in dice
     */
    public int sum() {
        int allDie = 0;
        for(int i = 0; i < dice.size(); i++){
            allDie += dice.get(i).getValue();
        }
        return allDie;
    }

    /**
     * Finds whether a Die of value val
     * exists in the arraylist
     * @param val value to check
     * @return true if a Die with value val is
     * in the arraylist, and false if it does not exist
     */
    public boolean contains(int val) {
        for(int i = 0; i < dice.size(); i++){
            if(dice.get(i).getValue() == val)
                return true;
        }
        return false;
    }
    
    /**
     * Overridden toString method containing more relevant representation
     * of a Dice object instead of its memeory address.
     * @return formatted string containing index and value of every Die
     */
    @Override
    public String toString() {
        String temp = "";
        for(int i = 0; i < dice.size(); i++){
            temp += String.format("%d: value %d\n", i, dice.get(i).getValue());
        }
        return temp;
    }
}