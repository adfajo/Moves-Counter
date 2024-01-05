package com.example.move_counter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MoveSets {
    private ArrayList<Move> allMoves;
    public ArrayList<Move> listMoves;
    public ArrayList<Move> activeMoves = new ArrayList<>(4);

    public MoveSets(){
        this.allMoves = new ArrayList<>();
    }

    public ArrayList<Move> getAllMoves(){
        return allMoves;
    }

    public ArrayList<Move> getActiveMoves(){
        return activeMoves;
    }

    public void addMove(Move move){
        allMoves.add(move);
    }

    public void removeMove(Move move){
        allMoves.remove(move);
    }

    public void addToActiveListType(String type){
        for(Move move : allMoves){
            if(move.getType().equals(type)){
                listMoves.add(move);
            }
        }
    }

    public void addToActiveListName(String name){
        for(Move move : allMoves){
            if(move.getName().equals(name)){
                listMoves.add(move);
            }
        }
    }

    public void clearActiveList(){
        listMoves.clear();
    }

    public void addMoveToActiveMoves(Move move){
        activeMoves.add(move);
    }

    public void removeMoveFromActiveMoves(Move move){
        activeMoves.remove(move);
    }

    public void removeAllMovesFromActiveMoves(){
        for(Move move : activeMoves){
            activeMoves.remove(move);
        }
    }
}
