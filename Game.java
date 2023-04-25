import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    Scanner in;
    ArrayList<Audio> goalFiles = new ArrayList<Audio>();
    Audio goalFile;
    String goalFileName;
    Integer goalPlaybackRate;
    Integer goalPitch;
    Integer goalReverb; 
    Integer goalEQ;
    Audio startFile;
    Random rand = new Random();

    //constructor 
    public Game(){
        this.goalFile=pickGoalFile();
        this.goalFileName=this.goalFile.fileName;
        this.goalPlaybackRate=this.goalFile.playbackRate;
        this.goalPitch=this.goalFile.pitch;
        this.goalReverb=this.goalFile.reverb;
        this.goalEQ=this.goalFile.EQ;
        this.startFile=new Audio(goalFileName, 0,0,0,0);
    }

    //method to randomly pick a goal audio file
    public Audio pickGoalFile(){
        Audio file1=new Audio("file1.wav",5,5,5,5);
        goalFiles.add(file1);
        Audio file2=new Audio("file2.wav",5,5,5,5);
        goalFiles.add(file2);
        Audio file3=new Audio("file3.wav",5,5,5,5);
        goalFiles.add(file3);
        Audio file4=new Audio("file4.wav",5,5,5,5);
        goalFiles.add(file4);
        Audio file5=new Audio("file5.wav",5,5,5,5);
        goalFiles.add(file5);
        Audio file6=new Audio("file6.wav",5,5,5,5);
        goalFiles.add(file6);
        Audio file7=new Audio("file7.wav",5,5,5,5);
        goalFiles.add(file7);
        Audio file8=new Audio("file8.wav",5,5,5,5);
        goalFiles.add(file8);
        Audio file9=new Audio("file9.wav",5,5,5,5);
        goalFiles.add(file9);
        Audio file10=new Audio("file10.wav",5,5,5,5);
        goalFiles.add(file10);

        //choosing a random number
        int num=rand.nextInt(9);
        return goalFiles.get(num);
    }
    
    public Boolean match(){
        if (this.goalFile.playbackRate==this.startFile.playbackRate && this.goalFile.pitch==this.startFile.pitch && this.goalFile.reverb==this.startFile.reverb && this.goalFile.EQ==this.startFile.EQ){
            return true;
        }
        else{
            return false;
        }
    }

    public void play(){
        System.out.println("\nWelcome to the game.");
        System.out.println("This is your goal audio file: \n"+this.goalFile.toString()+"\n");
        System.out.println("This is what the audio file currently sounds like:\n"+this.startFile.toString()+"\n");
        System.out.println("Your objective is to get your current audio file (played anytime by typing 'CURRENT') to match your goal audio file (played anytime by typing 'GOAL').");

        //start scanner
        in=new Scanner(System.in);

        while(!this.match()){

            String userResponse=in.nextLine();

            ArrayList<String> acceptableResponses = new ArrayList<String>();

            acceptableResponses.add("goal");
            acceptableResponses.add("GOAL");
            acceptableResponses.add("Goal");
            acceptableResponses.add("goal ");
            acceptableResponses.add("GOAL ");
            acceptableResponses.add("Goal ");
            acceptableResponses.add("start");
            acceptableResponses.add("START");
            acceptableResponses.add("Start");
            acceptableResponses.add("start ");
            acceptableResponses.add("START ");
            acceptableResponses.add("Start ");
            acceptableResponses.add("1");
            acceptableResponses.add("2");
            acceptableResponses.add("3");
            acceptableResponses.add("4");

            Boolean acceptable= false;
            for (int i=0; i<acceptableResponses.size(); i++){
                if (userResponse.equals(acceptableResponses.get(i))){
                    acceptable=true;
                }
            }

            if (!acceptable){
                System.out.println("This is not an accpetable responses. You can say 'GOAL','START', '1', '2', '3', or '4'.");
            }

            if(userResponse.equals("1")){
                playbackRateWitch playback=new playbackRateWitch();
                playback.test();
            }


        }

    }
    
}
