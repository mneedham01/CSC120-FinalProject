//Class for audio files & settings 
public class Audio {
    
    String fileName;
    Double playbackRate;
    Double pitch; 
    Double reverb;
    Double EQ; 

    //constructor
    public Audio(String fileName, Double playbackRate, Double pitch, Double reverb, Double EQ){
        this.fileName=fileName;
        this.playbackRate=playbackRate;
        this.pitch=pitch;
        this.reverb=reverb;
        this.EQ=EQ;
    }

    //methods-- will add exceptions/limits to all of these
    public void changePlaybackRate(Double newPlaybackRate){
        this.playbackRate=newPlaybackRate;    
    }

    public void changePitch(Double newPitch){
        this.pitch=newPitch;    
    }

    public void changeReverb(Double newReverb){
        this.reverb=newReverb;
    }

    public void changeEQ(Double newEQ){
        this.EQ=newEQ;
    }

    public String toString(){
        String toReturn="Filename: "+ this.fileName;
        toReturn+="\nPlayback Rate: "+this.playbackRate;
        toReturn+="\nPitch: "+this.pitch;
        toReturn+="\nReverb: "+this.reverb;
        toReturn+="\nEQ: "+this.EQ+"\n";
        return toReturn;
    }
    
    public void printAudio(){
        System.out.println(this.toString());
    }

}









