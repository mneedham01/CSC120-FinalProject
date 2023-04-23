//Class for audio files & settings 
public class Audio {
    
    String fileName;
    Integer playbackRate;
    Integer pitch; 
    Integer reverb;
    Integer EQ; 

    //constructor
    public Audio(String fileName, Integer playbackRate, Integer pitch, Integer reverb, Integer EQ){
        this.fileName=fileName;
        this.playbackRate=playbackRate;
        this.pitch=pitch;
        this.reverb=reverb;
        this.EQ=EQ;
    }

    
    public void changePlaybackRate(Integer newPlaybackRate){
        this.playbackRate=newPlaybackRate;    
    }

    public void changePitch(Integer newPitch){
        this.pitch=newPitch;    
    }

    public void changeReverb(Integer newReverb){
        this.reverb=newReverb;
    }

    public void changeEQ(Integer newEQ){
        this.EQ=newEQ;
    }

    public String toString(){
        String toReturn="Filename: "+ this.fileName;
        toReturn+="\nPlayback Rate: "+this.playbackRate;
        toReturn+="\nPitch: "+this.pitch;
        toReturn+="\nReverb: "+this.reverb;
        toReturn+="\nEQ: "+this.EQ;
        return toReturn;
    }
    
    public void printAudio(){
        System.out.println(this.toString());
    }

}









