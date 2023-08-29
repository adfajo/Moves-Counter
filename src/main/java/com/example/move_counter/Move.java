package com.example.move_counter;

public class Move {
    private int number;
    private String name;
    private String type;
    private int pP;
    private int gen;

    public Move(int number, String name, String type, int pP, int gen) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.pP = pP;
        this.gen = gen;
    }

    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getPP(){
        return this.pP;
    }

    public int getGen(){
        return this.gen;
    }
}
