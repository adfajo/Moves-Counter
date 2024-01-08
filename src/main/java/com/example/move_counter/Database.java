package com.example.move_counter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
        Scanner scan = new Scanner(line);
        scan.useDelimiter("\t");
        String name = scan.next();
        String type = scan.next();
        int pP = Integer.parseInt(scan.next());
        String power = scan.next();
        String acc = scan.next();
        String desc = scan.next();
        moveSet.addMove(new Move(name, type, pP, power, acc, desc));
        line = bf.readLine();
      }
      bf.close();
      return moveSet;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
