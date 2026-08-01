// ANSWER KEY - Practice Exercise 3 (month -> season, grouped cases)
// This is INTENTIONAL fall-through (unlike the bug demo) — grouping cases with
// no break between them, so 3, 4, and 5 all share ONE print statement.
import java.util.Scanner;

public class PracticeExercise3_Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 3,4,5:
            // case 4:
            // case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month");
        }

        sc.close();
    }
}