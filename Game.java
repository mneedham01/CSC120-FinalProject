import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    Scanner in;
    ArrayList<Audio> goalFiles = new ArrayList<Audio>();
    Audio goalFile;
    Random rand = new Random();
    int num=rand.nextInt(10);

    //constructor 
    public Game(){
        this.goalFile=pickGoalFile();
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
    public static void main(String args[]){
        Game newGame=new Game();
        System.out.println(newGame.goalFile);
        newGame.goalFile.printAudio();
    }
}
