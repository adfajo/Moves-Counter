package com.example.move_counter;

/**
 * Represents an object of Move that keeps the info of each individual moves.
 * These objects are used in the class MoveSets.
 *
 * @author adfajo
 * @version 04-09-2023
 */
public class Move {
    private String name;
    private String type;
    private int pP;
    private int power;
    private int acc;

    /**
     * Constructor of the Move class.
     * @param name name of the move
     * @param type which typing the move has (Normal/Fighting/Poison/Ghost, etc.)
     * @param pP how much PP the move has. (How many times a move can be used)
     * @param power represents how much damage a move deals.
     * @param acc what the accuracy of a move is.
     */
    public Move(String name, String type, int pP, int power, int acc) {
        this.name = name;
        this.type = type;
        this.pP = pP;
        this.power = power;
        this.acc = acc;
    }

    /**
     * get method for the name field.
     * @return the name field
     */
    public String getName(){
        return this.name;
    }

    /**
     * get method for the type field.
     * @return the type field
     */
    public String getType(){
        return this.type;
    }

    /**
     * get method for the pP field.
     * @return the pP field
     */
    public int getPP(){
        return this.pP;
    }

    /**
     * get method for the power field.
     * @return the power field
     */
    public int getPower(){
        return this.power;
    }

    /**
     * get method for the accuracy field.
     * @return the accuracy field
     */
    public int getAcc(){
        return this.acc;
    }
}
