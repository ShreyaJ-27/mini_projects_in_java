import java.util.Scanner;
//COMPOUND INTEREST CALCULATOR
public class Compound_interest_calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=sc.nextDouble();
        System.out.print("Enter the interest rate(in%): ");
        rate=sc.nextDouble() / 100;
        System.out.print("Enter the time duration(in years): ");
        years=sc.nextInt();
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded=sc.nextInt();

        amount= principal*Math.pow(1+rate/timesCompounded , timesCompounded * years);

     //   System.out.println("The amount after "+ years + " is: $"+ amount);
        System.out.printf("The amount after %d is $%,.2f\n", years, amount);

        sc.close();
    }
}
