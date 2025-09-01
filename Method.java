import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called()

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num=sc.nextDouble();
        System.out.println("Square of number= "+ square(num));
        System.out.println("Cube of number= "+ cube(num));

        sc.nextLine();

        System.out.print("Enter your first name: ");
        String first=sc.nextLine();
        System.out.print("Enter your last name: ");
        String last=sc.nextLine();
        String fullName=printFullName(first, last);
        System.out.println("Hello! "+ fullName);

        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(ageCheck(age)){
            System.out.println("You are eligible for pan card registration.");
        }
        else System.out.println("You must be 18+ to register for pan card.");
        sc.close();
    }
    static double square(double number) {
        return Math.pow(number,2);
    }
    static double cube(double number){
        return Math.pow(number,3);
    }
    static String printFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        return age>=18;
    }
}
