// ANSWER KEY - Practice Exercise 4 (valid triangle check)
// Rule: sum of any 2 sides must be GREATER than the third side, for ALL 3 pairs.
import java.util.Scanner;

public class PracticeExercise4_TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }

        sc.close();
    }
}