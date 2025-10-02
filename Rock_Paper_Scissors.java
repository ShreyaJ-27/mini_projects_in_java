import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random =new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain="yes";

        do {
            System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice=sc.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice");
                continue;
            }
            computerChoice=choices[random.nextInt(3)];
            System.out.println("Computer's choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie.");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && playerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && playerChoice.equals("paper"))){
                System.out.println("You Win!");
            }
            else System.out.println("You lose!");

            System.out.println("Play Again(yes/no): ");
            playAgain=sc.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
