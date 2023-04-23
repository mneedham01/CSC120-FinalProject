import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AudioTest {
    @Test
    public void testChangePlaybackRate(){
        Audio file=new Audio("file.wav",5,5,5,5);
        file.changePlaybackRate(8);
        Integer actualPlaybackRate=file.playbackRate;
        assertEquals(8,actualPlaybackRate);
    }

}
