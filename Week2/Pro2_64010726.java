import java.util.Scanner;


public class Pro2_64010726 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 3);  //randomNum 0-2
        //0, 1, or 2 representing scissor, rock, and paper.
        System.out.print("scissor (0), rock (1), paper (2): ");
        String input[] = {"scissor", "rock", "paper"};
        String output[] = {"It is a draws", "You won", "You loses"};
        int user = in.nextInt();
        int decision = (user - randomNum + 3) % 3; //The user wins if userInput is only one ahead of computerInput (case of (1,2), (2,3)) or lag two (case of (3,1)).
        System.out.print("The computer is " + input[randomNum] + ". You are " + input[user] + ". " + output[decision]);
    } 
}
