package com.example.move_counter;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Represents different types of lists of moves. One that contains all moves, one that represent a list of moves
 * (will be used for sorting by gen) and a list that represent active moves which are moves that the user adds
 * (active moves can only be 4).
 *
 * @author adfajo
 * @version 1.0
 */
public class MoveSets {
    private ArrayList<Move> allMoves;
    public ArrayList<Move> listMoves;
    public ArrayList<Move> activeMoves = new ArrayList<>(4);

    /**
     * Constructs a list which contains all objects of Move.
     */
    public MoveSets(){
        this.allMoves = new ArrayList<>();
        this.listMoves = new ArrayList<>();
    }

    /**
     * Returns the ArrayList allMoves
     * @return allMoves as an ArrayList
     */
    public ArrayList<Move> getAllMoves(){
        return allMoves;
    }

    public ArrayList<Move> getListMoves(){
        return listMoves;
    }

    /**
     * Returns the ArrayList activeMoves
     * @return activeMoves as an ArrayList
     */
    public ArrayList<Move> getActiveMoves(){
        return activeMoves;
    }

    /**
     * Add method for the allMoves ArrayList
     * @param move object Move to be added
     */
    public void addMove(Move move){
        allMoves.add(move);
    }

    /**
     * Remove method for the allMoves ArrayList
     * @param move object Move to be removed
     */
    public void removeMove(Move move){
        allMoves.remove(move);
    }

    public void addToListMovesGen(int gen){
        for(Move move : allMoves){
            if(move.getGen() <= gen){
                listMoves.add(move);
            }
        }
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

    public void getAGen(int gen){
        if(gen < 10 && gen > 0){
            for(Move move : allMoves) {
                if (move.getGen() <= gen) {
                    listMoves.add(move);
                }
            }
        }
    }

    public String allMovesToString(){
        StringBuilder sb = new StringBuilder();
        for(Move move : allMoves){
            sb.append(move.getNumber() + ", " + move.getName() + ", " + move.getType() + ", " + move.getPP() + ", " +
                    move.getGen() + "\n");
        }
        return sb.toString();
    }

    public String listMovesToString(){
        StringBuilder sb = new StringBuilder();
        for(Move move : listMoves){
            sb.append(move.getNumber() + ", " + move.getName() + ", " + move.getType() + ", " + move.getPP() + ", " +
                    move.getGen() + "\n");
        }
        return sb.toString();
    }
}
