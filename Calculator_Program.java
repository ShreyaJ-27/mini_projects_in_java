import java.util.Scanner;

//CALCULATOR PROGRAM
public class Calculator_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;
        char operator;
        boolean validOperator=true;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the operation you want to perform(+,-,*,/,^): ");
        operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("CANNOT DIVIDE BY ZERO!");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("INVALID OPERATOR!");
                validOperator = false;
            }
        }
        if (validOperator) {
            System.out.println(result);
        }
        sc.close();

    }
}
