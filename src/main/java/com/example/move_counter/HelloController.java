package com.example.move_counter;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private CheckBox check1;
    @FXML
    private CheckBox check2;
    @FXML
    private CheckBox check3;
    @FXML
    private CheckBox check4;
    @FXML
    private ComboBox move1;
    @FXML
    private ComboBox move2;
    @FXML
    private ComboBox move3;
    @FXML
    private ComboBox move4;
    @FXML
    private Label move1Pp;
    @FXML
    private Button add1;
    @FXML
    private Button sub1;

    @FXML
    public void initialize() {
        move1.setDisable(true);
        move2.setDisable(true);
        move3.setDisable(true);
        move4.setDisable(true);
        move1Pp.setDisable(true);
        add1.setDisable(true);
        sub1.setDisable(true);
    }

    @FXML
    public void addMove1(){

    }

    @FXML
    public void subMove1(){

    }

    @FXML
    public void moveChoice1(){
        add1.setDisable(false);
        sub1.setDisable(false);
        move1Pp.setDisable(false);
    }

    @FXML
    public void check1Activate(){
        if(check1.isSelected()){
            check2.setDisable(true);
            check3.setDisable(true);
            check4.setDisable(true);
            Database db = new Database("Moves1");
            move1.setDisable(false);
            move1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move2.setDisable(false);
            move2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move3.setDisable(false);
            move3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move4.setDisable(false);
            move4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check2.setDisable(false);
            check3.setDisable(false);
            check4.setDisable(false);
            move1.setDisable(true);
            move2.setDisable(true);
            move3.setDisable(true);
            move4.setDisable(true);
        }
    }

    @FXML
    public void check2Activate(){
        if(check2.isSelected()){
            check1.setDisable(true);
            check3.setDisable(true);
            check4.setDisable(true);
            Database db = new Database("Moves2");
            move1.setDisable(false);
            move1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move2.setDisable(false);
            move2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move3.setDisable(false);
            move3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move4.setDisable(false);
            move4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check1.setDisable(false);
            check3.setDisable(false);
            check4.setDisable(false);
            move1.setDisable(true);
            move2.setDisable(true);
            move3.setDisable(true);
            move4.setDisable(true);
        }
    }

    @FXML
    public void check3Activate(){
        if(check3.isSelected()){
            check2.setDisable(true);
            check1.setDisable(true);
            check4.setDisable(true);
            Database db = new Database("Moves3");
            move1.setDisable(false);
            move1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move2.setDisable(false);
            move2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move3.setDisable(false);
            move3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move4.setDisable(false);
            move4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check2.setDisable(false);
            check1.setDisable(false);
            check4.setDisable(false);
            move1.setDisable(true);
            move2.setDisable(true);
            move3.setDisable(true);
            move4.setDisable(true);
        }
    }

    @FXML
    public void check4Activate(){
        if(check4.isSelected()){
            check2.setDisable(true);
            check3.setDisable(true);
            check1.setDisable(true);
            Database db = new Database("Moves4");
            move1.setDisable(false);
            move1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move2.setDisable(false);
            move2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move3.setDisable(false);
            move3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            move4.setDisable(false);
            move4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check2.setDisable(false);
            check3.setDisable(false);
            check1.setDisable(false);
            move1.setDisable(true);
            move2.setDisable(true);
            move3.setDisable(true);
            move4.setDisable(true);
        }
    }
}