import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, i, j, num2, res,c;

        //creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Dream Corp Calculator!");

        System.out.print("Please enter first number.");
        num1 = input.nextInt();

        System.out.print("Please enter second  number.");
        num2 = input.nextInt();

        System.out.print("Now pick an operand!");

        char operator = input.next().charAt(0);

// for addition calculation
        if (operator == '+') {
            res = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + res);

// for multiplication calculation
        } else if (operator == '*') {
            res = num1 * num2;
            System.out.println(res);

// for substraction calculation
        } else if (operator == '-') {
            res = num1 - num2;
            System.out.println("The difference of " + num1 + " and " + num2 + " is " + res);

//for division calculation

        } else if (operator == '/') {
            try {
                res = num1 / num2;
                System.out.println(num1 + " divided by " + num2 + " is " + res);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: Division by zero is not possible.Try non Zero Denominator");
            }

        }
//for exponent calculation

        else if (operator == '^') {
            int power = 1;
            for (i = 1; i <= num2; i++) {
                power = power * num1;

            }
            System.out.println(num1 + " the power of " + num2 + " is " + power);
        }

        // for factorial calculation,BigInteger is used to address calculation of factorial for
        //large numbers(e.g 20!)

        else if (operator == '!') {
            BigInteger f = new BigInteger("1");
            BigInteger g = new BigInteger("1");
            if (num1 < 0 || num2 < 0) {
                System.out.println("Number should be posetive");

            } else {
                for (i = 2; i <= num1; i++) {
                    f = f.multiply(BigInteger.valueOf(i));
                }

                for (j = 2; j <= num2; j++) {
                    g = g.multiply(BigInteger.valueOf(j));
                }

            }
            System.out.println("The factorial of " + num1 + " is " + f);
            System.out.println("The factorial of " + num2 + " is " + g);


        } else {
            System.out.println("You entered  paku1!!");

        }


    }
}


