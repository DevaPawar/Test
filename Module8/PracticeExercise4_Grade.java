// ANSWER KEY - Practice Exercise 4 (grade calculator)
// IMPORTANT ORDER: check the HIGHEST threshold first, or every mark will match the first branch.
import java.util.Scanner;

public class PracticeExercise4_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        sc.close();
    }
}