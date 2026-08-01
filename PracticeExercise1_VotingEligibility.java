// ANSWER KEY - Practice Exercise 1 (voting eligibility, ternary)
// NOTE: uses Scanner (user input). If Scanner isn't covered yet,
//       replace the two Scanner lines with:  int age = 20;
import java.util.Scanner;

public class PracticeExercise1_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);

        sc.close();
    }
}