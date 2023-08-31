import com.example.move_counter.Database;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  public void readDatabase(){
    Database db = new Database("Moves");
    db.readMoves();
  }
}
