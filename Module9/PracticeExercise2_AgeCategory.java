// ANSWER KEY - Practice Exercise 2 (age category)
//
// HEADS-UP: classic Java switch can only match EXACT values (like 1, 2, "Red") —
// it cannot directly test a range like "age < 18". So we first turn the range
// check into a simple category NUMBER using if/else, THEN switch on that number.
// This genuinely satisfies "use switch case" while doing the range logic honestly.
import java.util.Scanner;

public class PracticeExercise2_AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Step 1: bucket the age into a category (this part MUST be if/else — switch can't do ranges)
        int category;
        if (age <= 0) {
            category = 0;      // invalid
        } else if (age < 18) {
            category = 1;      // minor
        } else {
            category = 2;      // adult
        }

        // Step 2: switch on the category (this part is genuinely a switch, matching exact values 0/1/2)
        switch (category) {
            case 0:
                System.out.println("Invalid Input");
                break;
            case 1:
                System.out.println("Minor");
                break;
            case 2:
                System.out.println("Adult");
                break;
        }

        sc.close();
    }
}