import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rockPaperSiscors{
    public static void main (String[] args){
        Scanner player = new Scanner(System.in);

        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = player.nextLine();

       Random random = new Random();
       int pcMove = random.nextInt(3);


        String computerMove;
       if (pcMove == 1){
        computerMove = "rock";
       }
       else if (pcMove == 2){
        computerMove = "paper";
       }
       else{
        computerMove = "scissors";
       }

       if (playerMove == "rock" && )
        
        
    }
}