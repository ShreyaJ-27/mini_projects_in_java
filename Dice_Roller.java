import java.util.Random;
import java.util.Scanner;

//DICE ROLLER PROGRAM
public class Dice_Roller {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice=sc.nextInt();
    /*    if(numOfDice>0){
            for(int i=0; i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                System.out.println("You rolled: "+ roll);
                total += roll;
            }
            System.out.println("Total value of dices rolled: "+ total);
        }
        else {
            System.out.println("Number of dice must be greater than 0.");
        }*/

        while(numOfDice<0) {
            System.out.print("Please renter number of dice(s) to roll: ");
            numOfDice = sc.nextInt();
        }
        for(int i=0; i<numOfDice;i++){
            int roll = random.nextInt(1,7);
            printDice(roll);
            System.out.println("You rolled: "+ roll);
            total += roll;
        }
        System.out.println("Total value of dices rolled: "+ total);
        sc.close();
    }
    static void printDice(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |      ●|
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●    ● |
                |        |
                | ●    ● |
                 -------
                """;
        String dice5 = """
                 -------
                |●     ● |
                |   ●    |
                |●     ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●    ● |
                | ●    ● |
                | ●    ● |
                 -------
                """;

        switch(roll){
            case 1-> System.out.print(dice1);
            case 2-> System.out.print(dice2);
            case 3-> System.out.print(dice3);
            case 4-> System.out.print(dice4);
            case 5-> System.out.print(dice5);
            case 6-> System.out.print(dice6);
            default -> System.out.print("Invalid roll.");
        }
    }
}
