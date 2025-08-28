import java.util.Scanner;
import java.util.Random;

//NUMBER GUESSING GAME
public class number_guessing_game {
    public static void main(String[] args){

        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min=0 ,max=0;

        System.out.println("NUMBER GUESSING GAME");
        do {
            System.out.print("Enter the minimum value of the number range in which you want to guess: ");
            min = sc.nextInt();

            System.out.print("Enter the maximum value of the number range in which you want to guess: ");
            max = sc.nextInt();
        }while(min==0 && max==0);

        int randomNumber=random.nextInt(min,max+1);

        System.out.printf("Guess an number between %d-%d\n", min, max);
        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW! Try again.");
            }
            else if(guess>randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("YAYY!! You guessed it right.");
                System.out.printf("WELL DONE! You took %d attempts to guess.", attempts);
            }
        }while(randomNumber != guess);
        
        sc.close();
    }
}
