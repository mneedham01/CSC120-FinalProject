import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class GameTest {
    Game newGame=new Game();
    System.out.println(newGame.goalFile);
    newGame.goalFile.printAudio();
}
