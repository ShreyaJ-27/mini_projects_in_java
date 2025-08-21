import java.util.Scanner;

//MAD LIBS GAME
public class mad_libs_game {

    public static void main(String[] args) {
        {
            //MAD LIBS GAME
            String exclaim1;
            String adverb1;
            String noun1;
            String adjective1;

            Scanner sc1=new Scanner(System.in);
            System.out.print("Enter an exclamatory word: ");
            exclaim1=sc1.nextLine();
            System.out.print("Enter an adverb(info about verb): ");
            adverb1=sc1.nextLine();
            System.out.print("Enter a noun: ");
            noun1=sc1.nextLine();
            System.out.print("Enter an adjective(description): ");
            adjective1=sc1.nextLine();

            System.out.println(" ' " + exclaim1 + " !' He said " + " ' " +  adverb1 + " ' ");
            System.out.println("as he jumped into his convertible " + " ' " + noun1 + " ' " + " and ");
            System.out.println("drove off with his " + " ' " +  adjective1 + " ' " + " wife.");

            sc1.close();
        }
    }
}
