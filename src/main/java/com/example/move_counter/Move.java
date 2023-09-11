package com.example.move_counter;

/**
 * Represents an object of Move, which consists of a number, name, type, PP and gen.
 *
 * @author adfajo
 * @version 1.0
 */
public class Move {
    private int number;
    private String name;
    private String type;
    private int pP;
    private int gen;

    /**
     * Constructs an object of Move with different attributes.
     *
     * @param number positioning in the list of moves
     * @param name name of the Move object
     * @param type typing of the Move object (Fire, Water, Electric, etc.)
     * @param pP how many times the move can be used
     * @param gen which generation it got added
     */
    public Move(int number, String name, String type, int pP, int gen) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.pP = pP;
        this.gen = gen;
    }

    /**
     * Get method for the number field
     * @return the number as an int
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * Get method for the name field
     * @return the name as a String
     */
    public String getName(){
        return this.name;
    }

    /**
     * Get method for the type field
     * @return the type as a String
     */
    public String getType(){
        return this.type;
    }

    /**
     * Get method for the PP field
     * @return the PP as an int
     */
    public int getPP(){
        return this.pP;
    }

    /**
     * Get method for the gen field
     * @return the gen as an int
     */
    public int getGen(){
        return this.gen;
    }
}
