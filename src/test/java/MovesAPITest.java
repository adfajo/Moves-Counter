import com.example.move_counter.Move;
import com.example.move_counter.MovesAPI;
import org.junit.jupiter.api.Test;

public class MovesAPITest {
    @Test
    public void testingConnection() {
        MovesAPI movesAPI = new MovesAPI();
        Move move = movesAPI.stringToMove(movesAPI.getMovesData(555));
        System.out.println("name: " + move.getName());
        System.out.println("power: " + move.getPower());
        System.out.println("type: " + move.getType());
        System.out.println("accuracy: " + move.getAcc());
        System.out.println("PP: " + move.getPP());;
    }
}
