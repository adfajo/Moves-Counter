package com.example.move_counter;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    private ComboBox moveBox1;
    @FXML
    private ComboBox moveBox2;
    @FXML
    private ComboBox moveBox3;
    @FXML
    private ComboBox moveBox4;
    @FXML
    private Label move1Pp;
    @FXML
    private Button add1;
    @FXML
    private Button sub1;

    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;
    private MoveSets allMoves;
    private Database db;

    @FXML
    public void initialize() {
        moveBox1.setDisable(true);
        moveBox2.setDisable(true);
        moveBox3.setDisable(true);
        moveBox4.setDisable(true);
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
        move1 = db.readMoves().getMove(moveBox1.getValue());
        move1Pp.setText(String.valueOf(move1.getPP()));
    }

    @FXML
    public void check1Activate(){
        if(check1.isSelected()){
            check2.setDisable(true);
            check3.setDisable(true);
            check4.setDisable(true);
            db = new Database("Moves1");
            moveBox1.setDisable(false);
            moveBox1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox2.setDisable(false);
            moveBox2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox3.setDisable(false);
            moveBox3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox4.setDisable(false);
            moveBox4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check2.setDisable(false);
            check3.setDisable(false);
            check4.setDisable(false);
            moveBox1.setDisable(true);
            moveBox2.setDisable(true);
            moveBox3.setDisable(true);
            moveBox4.setDisable(true);
        }
    }

    @FXML
    public void check2Activate(){
        if(check2.isSelected()){
            check1.setDisable(true);
            check3.setDisable(true);
            check4.setDisable(true);
            db = new Database("Moves2");
            moveBox1.setDisable(false);
            moveBox1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox2.setDisable(false);
            moveBox2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox3.setDisable(false);
            moveBox3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox4.setDisable(false);
            moveBox4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check1.setDisable(false);
            check3.setDisable(false);
            check4.setDisable(false);
            moveBox1.setDisable(true);
            moveBox2.setDisable(true);
            moveBox3.setDisable(true);
            moveBox4.setDisable(true);
        }
    }

    @FXML
    public void check3Activate(){
        if(check3.isSelected()){
            check2.setDisable(true);
            check1.setDisable(true);
            check4.setDisable(true);
            db = new Database("Moves3");
            moveBox1.setDisable(false);
            moveBox1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox2.setDisable(false);
            moveBox2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox3.setDisable(false);
            moveBox3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox4.setDisable(false);
            moveBox4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check2.setDisable(false);
            check1.setDisable(false);
            check4.setDisable(false);
            moveBox1.setDisable(true);
            moveBox2.setDisable(true);
            moveBox3.setDisable(true);
            moveBox4.setDisable(true);
        }
    }

    @FXML
    public void check4Activate(){
        if(check4.isSelected()){
            check2.setDisable(true);
            check3.setDisable(true);
            check1.setDisable(true);
            db = new Database("Moves4");
            moveBox1.setDisable(false);
            moveBox1.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox2.setDisable(false);
            moveBox2.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox3.setDisable(false);
            moveBox3.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
            moveBox4.setDisable(false);
            moveBox4.setItems(FXCollections.observableList(db.readMoves().getAllMoves()));
        }else{
            check2.setDisable(false);
            check3.setDisable(false);
            check1.setDisable(false);
            moveBox1.setDisable(true);
            moveBox2.setDisable(true);
            moveBox3.setDisable(true);
            moveBox4.setDisable(true);
        }
    }
}