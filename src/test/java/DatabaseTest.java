import com.example.move_counter.Database;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  public void readDatabase(){
    Database db = new Database("Moves1");
    db.readMoves();
  }

  @Test
  public void readDatabase2(){
    Database db = new Database("Moves2");
    System.out.println(db.readMoves().getAllMoves().size());
  }

  @Test
  public void readDatabase3(){
    Database db = new Database("Moves3");
    System.out.println(db.readMoves().getAllMoves().size());
  }

  @Test
  public void readDatabase4(){
    Database db = new Database("Moves4");
    System.out.println(db.readMoves().getAllMoves().size());
  }
}
