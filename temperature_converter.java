import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit?(C or F): ");
        unit =sc.next().toUpperCase();

        //condition ? true:false
        newTemp=(unit.equals("C")) ? (temp-32)*5/9 : (temp*9/5)+32;
        System.out.printf("The temperature in °%s is %.2f", unit, newTemp);
        sc.close();
    }
}
