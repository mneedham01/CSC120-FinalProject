import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class AudioTest {

    @Before
    Audio file=new Audio("file.wav",5,5,5,5);

    @Test
    public void testChangePlaybackRate(){
        file.changePlaybackRate(8);
        Integer actualPlaybackRate=file.playbackRate;
        Integer idealPlaybackRate=8;
        assertEquals(idealPlaybackRate,actualPlaybackRate);
    }

    @Test
    public void testChangePitch(){
        file.changePitch(8);
        Integer actualPitch=file.pitch;
        Integer idealPitch=8;
        assertEquals(idealPitch,actualPitch);
    }

    @Test
    public void testChangeReverb(){
        file.changeReverb(8);
        Integer actualReverb=file.reverb;
        Integer idealReverb=8;
        assertEquals(idealReverb,actualReverb);
    }

    @Test
    public void testChangeEQ(){
        file.changeEQ(8);
        Integer actualEQ=file.EQ;
        Integer idealEQ=8;
        assertEquals(idealEQ,actualEQ);
    }

}
