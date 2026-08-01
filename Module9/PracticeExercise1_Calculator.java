// ANSWER KEY - Practice Exercise 1 (calculator using switch)
import java.util.Scanner;

public class PracticeExercise1_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        String operator = sc.next();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: cannot divide by zero");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}