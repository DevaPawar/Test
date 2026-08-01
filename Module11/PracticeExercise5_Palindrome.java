package Module11;

// ANSWER KEY - Practice Exercise 5 (palindrome number check)
import java.util.Scanner;

public class PracticeExercise5_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;      // peel off the last digit
            reversed = reversed * 10 + lastDigit;
            num = num / 10;                // chop off the last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is NOT a palindrome");
        }

        sc.close();
    }
}