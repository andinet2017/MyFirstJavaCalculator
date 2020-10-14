import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2, res;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the Dream Corp Calculator! Type two numbers.");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.print(" Now pick an operand!");

        char operator = input.next().charAt(0);


        if (operator == '+') {
            res = num1 + num2;
            System.out.println(res);


        } else if (operator == '*') {
            res = num1 * num2;
            System.out.println(res);


        } else if (operator == '-') {
            res = num1 - num2;
            System.out.println(res);


        }

        else if (operator == '/') {
         try{
            res = num1 / num2;
            System.out.println(res);}

            catch (ArithmeticException e) {
                System.out.println("Exception caught: Division by zero is not possible.Try non Zero Denominator");
            }


        } else {
            System.out.println("You input wrong operator!Please try again!!");


        }


}


    }
