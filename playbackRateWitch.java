import java.util.Scanner;

public class playbackRateWitch {

    Scanner in;
    String name;

    public playbackRateWitch(){
        this.name="tee hee";
    }

    public void conversation(Audio startFile){

        System.out.println("With me, you can change the playback rate of the file.");
        System.out.println("You can change it to between 0 and 5 times the original speed.");
        System.out.println("Input a number greater than 0 and less than or equal to 5 to change the speed. Input 'DONE' to return back to the main menu.");

        in=new Scanner(System.in);
        
        boolean done=false;

        while (!done){
            String userResponse=in.nextLine();
            
            if(userResponse.equals("Done")||userResponse.equals("DONE")||userResponse.equals("done")){
                done=true;
            }

            double num = Double.parseDouble(userResponse);

            startFile.changePlaybackRate(num);
            startFile.printAudio();

        }

        System.out.println("You have finished your time with me and are now returned to the main menu.");

    }
}
