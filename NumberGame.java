import java.util.*;
public class NumberGame {

public static void main(String[] args) {
    int n=100;
    int maxattempt=10;
    int score=0;
    Scanner s=new Scanner(System.in);
    System.out.println("WELCOME to the game");

    boolean play=true;
    while(play){
        
        // create instance using random class
        Random r=new Random();
        // Generate number
        int gen_Num=r.nextInt(n);
        int attempt=0;

        System.out.println("Guess number between 1 to 100");

        // Ask user want hint or not to guess correct number
        System.out.println("If you want hint press (yes/no)");

        String hint=s.nextLine();

        if(hint.equalsIgnoreCase("yes")){
            // Check number is even or not
            if(gen_Num%2==0){
                System.out.println("HINT...Number is even");
            }
            else{
                System.out.println("HINT...Number is odd");
            }
        }
        // Take input from user
        while(attempt<=maxattempt){
            System.out.println("Guess any number");
            int guess_Num=s.nextInt();
            attempt++;

            // Show result
            if(guess_Num==gen_Num){
                System.out.println("CONGRATULATIONS! you guess correct number in "+attempt+" attempts");

                score=maxattempt-attempt;
                break;

            }
            else if(guess_Num<=gen_Num){
                System.out.println("Guessed number is too low ! Try again");

                if(attempt==maxattempt+1){
                    System.out.println("OOPs! sorry your attempts are over");
                }
            }
            else{
                System.out.println("Guessed number is too high ! Try again");

                if(attempt==maxattempt+1){
                    System.out.println("OOPs! sorry your attempts are over");
            }
        }
    }
    System.out.println("Do you want to play again? press(yes/no)");
    play=s.next().equalsIgnoreCase(("yes"));
}
    System.out.println("Thanks for playing your total score is "+score);
}
}
