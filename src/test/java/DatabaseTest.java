import com.example.move_counter.Database;
import com.example.move_counter.MoveSets;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  public void readMovesGen1(){
    Database db = new Database("MovesGen1");
    MoveSets mS = db.readMoves();
    System.out.println(mS.allMovesToString());
  }

  @Test
  public void readMovesGen2(){
    Database db = new Database("MovesGen2");
    MoveSets mS = db.readMoves();
    System.out.println(mS.allMovesToString());
  }

  @Test
  public void readMovesGen3(){
    Database db = new Database("MovesGen3");
    MoveSets mS = db.readMoves();
    System.out.println(mS.allMovesToString());
  }
}
