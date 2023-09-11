package com.example.move_counter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Database {

  private String filePath = "src/main/resources/";
  private String file;
  private String fileType = ".txt";
  public Database(String file){
    this.file = file;
  }

  public MoveSets readMoves(){
    MoveSets moveSet = new MoveSets();
    try {
      BufferedReader bf = new BufferedReader(new FileReader(filePath + file + fileType));
      String line = bf.readLine();
      while(line != null){
        int number;
        String name;
        String type;
        int pP;
        int gen;
        try (Scanner scan = new Scanner(line)) {
          scan.useDelimiter(", ");
          number = Integer.parseInt(scan.next());
          name = scan.next();
          type = scan.next();
          pP = Integer.parseInt(scan.next());
          gen = Integer.parseInt(scan.next());
        }
        moveSet.addMove(new Move(number, name, type, pP, gen));
        line = bf.readLine();
      }
      bf.close();
      return moveSet;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }


}
